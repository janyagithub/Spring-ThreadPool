package com.asimio.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asimio.demo.service.DemoService;

@RestController
@RequestMapping(value = "/demo")
public class DemoResource {

	@Autowired
	private DemoService demoService;

	@RequestMapping(method = RequestMethod.GET)
	public String getDemo() {
		
		System.out.println(demoService);
		return String.format("Tenant: %s", demoService.getTenantValue());
	}
}