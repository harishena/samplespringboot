package com.infosys.rsu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RsuAutomationController {
	
	 @GetMapping("/rsu/sample")
	    public String getString()
	    {
	     
	      return "Hai";
	    }

}
