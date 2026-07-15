package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {
@RequestMapping(value="/testAPI",consumes = MediaType.APPLICATION_XML_VALUE,produces  = MediaType.APPLICATION_JSON_VALUE)
	public Emp display(@RequestBody Emp emp)
	{
		
 		return emp;
	}

}
