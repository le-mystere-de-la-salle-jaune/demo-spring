package dev.ihm;

import java.util.Scanner;

import org.springframework.stereotype.Controller;

import dev.service.Service;

@Controller
public class OptionIhmA implements OptionIhm {
	private Service service;
	private Scanner scanner;

	public OptionIhmA(Service service, Scanner scanner) {
		super();
		this.service = service;
		this.scanner = scanner;
	}

	@Override
	public void execute() {
		System.out.println("Option A");
		String saisie = this.scanner.next();
		System.out.println("Saisie : " + saisie);
		System.out.println("    Service => " + service.info());
	}
}
