package com.apurvkulkarni.versioning.v3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MimeVersioningV3{

	@RequestMapping(method = RequestMethod.GET, value = "/mimeNewMethod", produces = "application/vnd.apurv.v3+json")
	public ResponseEntity<String> pathVersioningTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":\"v3\"}", HttpStatus.OK);
	}
	
}
