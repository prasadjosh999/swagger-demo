package com.spring.swagger.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo")
public class DemoController {
	

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name, @RequestHeader(value = "X-Channel", required = false) String channel) {
		
		return "Hello "+name;
	}

}
