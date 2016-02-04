package com.leveraon.springmvc.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("recipient", "World");
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "login";
	}
}