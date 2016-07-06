package com.basic1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {

	@RequestMapping(value="hello")
	public String homePage(Map<String, String> model){
		model.put("name", "anvesh");
		return "home";
	}
}
