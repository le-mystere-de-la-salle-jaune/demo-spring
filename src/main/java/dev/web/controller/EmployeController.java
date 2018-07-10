package dev.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeController {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	// @ResponseBody
	public String hello() {
		return "bonjour";
	}

}
