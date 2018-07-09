package dev.ihm;

import org.springframework.stereotype.Controller;

import dev.service.Service;

@Controller
public class OptionIhmB implements OptionIhm {

	private Service service;

	public OptionIhmB(Service service) {
		this.service = service;
	}

	@Override
	public void execute() {
		System.out.println("Option B");
		System.out.println("    Service => " + service.info());
	}
}
