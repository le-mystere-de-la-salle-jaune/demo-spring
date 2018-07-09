package dev.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Menu {

	private List<OptionIhm> optionIhms;

	@Autowired
	public Menu(List<OptionIhm> optionIhms) {
		this.optionIhms = optionIhms;
	}

	public void demarrer() {
		optionIhms.forEach(OptionIhm::execute);
	}
}
