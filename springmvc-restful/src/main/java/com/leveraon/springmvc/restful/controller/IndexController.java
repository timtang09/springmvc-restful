package com.leveraon.springmvc.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "redirect:/sign-in";
	}

	@RequestMapping(value = "/sign-in", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public String main() {
		return "index";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout() {
		return "login";
	}
}