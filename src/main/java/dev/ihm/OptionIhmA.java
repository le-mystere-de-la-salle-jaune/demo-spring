package dev.ihm;

import dev.service.Service;

public class OptionIhmA implements OptionIhm {

    private Service service;

    public OptionIhmA(Service service) {
        this.service = service;
    }

    public void execute() {
        System.out.println("Option A");
        System.out.println("    Service => " + service.info());
    }
}
