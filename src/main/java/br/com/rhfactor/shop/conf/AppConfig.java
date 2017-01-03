package br.com.rhfactor.shop.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.rhfactor.shop.controllers.HomeController;
import br.com.rhfactor.shop.daos.ProdutoDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses = { HomeController.class , ProdutoDAO.class })
public class AppConfig {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
