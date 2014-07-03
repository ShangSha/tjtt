package com.shangsha.core.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class TestController {

	@RequestMapping(value="/test")
	public String test(){
		
		return "test/test";
	}
}
