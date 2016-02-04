package com.leveraon.springmvc.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "login";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("recipient", "World");
		return "index";
	}

	@RequestMapping(value = "/blank", method = RequestMethod.GET)
	public String blank(Model model) {
		return "blank";
	}

	@RequestMapping(value = "/buttons", method = RequestMethod.GET)
	public String buttons(Model model) {
		return "buttons";
	}

	@RequestMapping(value = "/flot", method = RequestMethod.GET)
	public String flot(Model model) {
		return "flot";
	}

	@RequestMapping(value = "/forms", method = RequestMethod.GET)
	public String forms(Model model) {
		return "forms";
	}

	@RequestMapping(value = "/grid", method = RequestMethod.GET)
	public String grid(Model model) {
		return "grid";
	}

	@RequestMapping(value = "/icons", method = RequestMethod.GET)
	public String icons(Model model) {
		return "icons";
	}

	@RequestMapping(value = "/morris", method = RequestMethod.GET)
	public String morris(Model model) {
		return "morris";
	}

	@RequestMapping(value = "/notification", method = RequestMethod.GET)
	public String notification(Model model) {
		return "notification";
	}

	@RequestMapping(value = "/panel-wells", method = RequestMethod.GET)
	public String panel_wells(Model model) {
		return "panel-wells";
	}

	@RequestMapping(value = "/tables", method = RequestMethod.GET)
	public String tables(Model model) {
		return "tables";
	}

	@RequestMapping(value = "/typography", method = RequestMethod.GET)
	public String typography(Model model) {
		return "typography";
	}
}