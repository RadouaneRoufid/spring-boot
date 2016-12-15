package com.roufid.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roufid.tutorial.services.HelloWorldService;

@Controller
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping("/")
    @ResponseBody
	public String helloWorld() {
		return helloWorldService.sayHelloWorld();
	}
}
