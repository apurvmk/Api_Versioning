package com.apurvkulkarni.versioning.v2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apurvkulkarni.versioning.v1.PathVersioning;

@Controller
@RequestMapping(value="/v2")
public class PathVersioningV2 extends PathVersioning{

	@RequestMapping(method = RequestMethod.GET, value = "/pathVersioning", produces = "application/json")
	public ResponseEntity<String> pathVersioningTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":v2}", HttpStatus.OK);
	}
}
