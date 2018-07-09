package dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ihm.Menu;

public class AppConsoleSpringJavaConfig {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Menu menu = context.getBean("menu", Menu.class);

			menu.demarrer();
		}

	}

}
