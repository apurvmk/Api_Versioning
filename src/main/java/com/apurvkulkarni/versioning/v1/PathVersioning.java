package com.apurvkulkarni.versioning.v1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"","/v1"})
public class PathVersioning {

	@RequestMapping(method = RequestMethod.GET, value = "/pathVersioning", produces = "application/json")
	public ResponseEntity<String> pathVersioningTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":\"v1\"}", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/pathUnversioned", produces = "application/json")
	public ResponseEntity<String> unchangedVersionTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":\"unversioned\"}", HttpStatus.OK);
	}
}
