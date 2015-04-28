package com.apurvkulkarni.versioning.v3;

import com.apurvkulkarni.versioning.v2.PathVersioningTestControllerV2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/v3/customer")
public class PathVersioningTestControllerV3 extends PathVersioningTestControllerV2 {
}
