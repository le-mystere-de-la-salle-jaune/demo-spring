package dev.ihm;

import dev.service.Service;

public class OptionIhmB implements OptionIhm {

    private Service service;

    public OptionIhmB(Service service) {
        this.service = service;
    }

    public void execute() {
        System.out.println("Option B");
    }
}
