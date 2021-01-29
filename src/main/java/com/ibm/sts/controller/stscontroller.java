package com.ibm.sts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stscontroller {
	@RequestMapping("/sts")
	public String sts(){				
		return "sts project";	
		}
}
