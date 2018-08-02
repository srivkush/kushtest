package com.nttdata.test.controller;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.test.model.Greeting;

@RequestMapping("greetings")
@BasePathAwareController
public class GreetingController {

	@GetMapping(value = "/sayHello", produces = MediaTypes.HAL_JSON_VALUE)
	public Greeting greeting(@QueryParam("name") @DefaultValue("World") String name) {
		final String message = String.format(Greeting.FORMAT, name);
		return new Greeting(message);
	}

}
