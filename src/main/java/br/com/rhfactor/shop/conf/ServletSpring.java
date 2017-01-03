package br.com.rhfactor.shop.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.rhfactor.shop.conf.AppConfig;

public class ServletSpring extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/**
	 * Método que informa as configurações de Servlets
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{ AppConfig.class , JPAConfig.class };
	}
	
	/**
	 * Método que indica os endereços que serão processados pelo Servlet do Spring
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
