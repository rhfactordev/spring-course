package br.com.rhfactor.shop.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfig {

	/**
	 * Método responsável por criar e gerenciar nossa fábrica de conexão com o
	 * banco de dados
	 * 
	 * @return
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

		factoryBean.setJpaVendorAdapter(vendorAdapter);

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setUsername("root"); // usuário do seu banco de dados
		dataSource.setPassword(""); // password do seu banco de dados
		dataSource.setUrl("jdbc:mysql://localhost:3306/shop"); // banco de dados

		dataSource.setDriverClassName("com.mysql.jdbc.Driver");

		factoryBean.setDataSource(dataSource);

		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");

		factoryBean.setJpaProperties(props);

		// Package que devem ser scaneados para encontrar classes anotadas com
		// @Entity
		factoryBean.setPackagesToScan("br.com.rhfactor.shop.beans");

		return factoryBean;
	}

	/**
	 * Método que habilita uma transação (transactions) com nosso banco de dados
	 * 
	 * @param emf
	 * @return
	 */
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}
}
