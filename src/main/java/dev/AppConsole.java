package dev;

import java.util.Arrays;

import dev.ihm.Menu;
import dev.ihm.OptionIhm;
import dev.ihm.OptionIhmA;
import dev.ihm.OptionIhmB;
import dev.service.Service;
import dev.service.ServiceImpl1;
import dev.service.ServiceImpl2;

public class AppConsole {

    public static void main(String[] args) {
    	
    	Service serv = new ServiceImpl2();
 
    	OptionIhm opA = new OptionIhmA(serv);
    	OptionIhm opB = new OptionIhmB(serv);
    	
    	Menu menu = new Menu(Arrays.asList(opA, opB));
    	
    	menu.demarrer();

    }
}
