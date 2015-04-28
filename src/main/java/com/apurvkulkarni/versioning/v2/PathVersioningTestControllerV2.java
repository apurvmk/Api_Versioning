package com.apurvkulkarni.versioning.v2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value="/v2/customer")
public class PathVersioningTestControllerV2{

	@RequestMapping(method = RequestMethod.GET, value = "/customertest", produces = "application/json")
	public ResponseEntity<String> newMethodTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":\"customer test v2\"}", HttpStatus.OK);
	}
}
