package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "jsp.index";
	}
}
