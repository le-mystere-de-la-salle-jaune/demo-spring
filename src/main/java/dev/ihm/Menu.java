package dev.ihm;

import java.util.List;

public class Menu {

    private List<OptionIhm> optionIhms;

    public Menu(List<OptionIhm> optionIhms) {
        this.optionIhms = optionIhms;
    }

    public void demarrer() {
        optionIhms.forEach(OptionIhm::execute);
    }
}
