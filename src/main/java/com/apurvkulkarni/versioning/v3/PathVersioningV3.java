package com.apurvkulkarni.versioning.v3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apurvkulkarni.versioning.v2.PathVersioningV2;

@Controller
@RequestMapping(value="/v3")
public class PathVersioningV3 extends PathVersioningV2{

	@RequestMapping(method = RequestMethod.GET, value = "/newMethod", produces = "application/json")
	public ResponseEntity<String> newMethodTest(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<>("{\"version\":v3}", HttpStatus.OK);
	}
}
