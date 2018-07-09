package dev;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.ihm.Menu;


public class AppConsoleSpring {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml")) {

			Menu menu = context.getBean("menu", Menu.class);
			
			menu.demarrer();
			
		}

	}
}
