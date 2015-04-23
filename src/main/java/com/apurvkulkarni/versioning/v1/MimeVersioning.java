package com.apurvkulkarni.versioning.v1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MimeVersioning {

	@RequestMapping(method = RequestMethod.GET, value = "/mimeVersioning", produces = "application/json")
	public ResponseEntity<String> pathVersioningTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":\"v1\"}", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/mimeUnversioned", produces = "application/json")
	public ResponseEntity<String> unchangedVersionTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":\"v1\"}", HttpStatus.OK);
	}
}
