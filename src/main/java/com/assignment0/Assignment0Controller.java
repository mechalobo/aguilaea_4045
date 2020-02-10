package com.assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Assignment0Controller {
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}

}
