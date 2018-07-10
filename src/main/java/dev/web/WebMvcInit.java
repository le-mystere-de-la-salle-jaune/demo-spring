package dev.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebMvcInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Démmarrage App");

		// 0. Config Spring de départ

		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(WebAppSpringConfig.class);

		// 1. Configurer le contrôleur frontal

		/*
		 * <servlet> <servlet-name>dispatcher</servlet-name>
		 * <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-
		 * class> <load-on-startup>1</load-on-startup> </servlet>
		 */
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher",
				new DispatcherServlet(webContext));
		dispatcher.setLoadOnStartup(1);
		/*
		 * <servlet-mapping> <servlet-name>dispatcher</servlet-name>
		 * <url-pattern>/api</url-pattern> </servlet-mapping>
		 */
		dispatcher.addMapping("/mvc/*");

		// 2. Ecouteur
		/*
		 * <listener>
		 * <listener-class>org.springframework.web.context.ContextLoaderListener</
		 * listener-class> </listener>
		 */
		servletContext.addListener(new ContextLoaderListener(webContext));

	}

}
