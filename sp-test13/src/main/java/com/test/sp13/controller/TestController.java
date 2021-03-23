package com.test.sp13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;

import com.test.sp13.entity.TestVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String doUpload(Model m, @ModelAttribute TestVO tVO) {
		m.addAttribute("tVO", tVO);
		return "complete";
	}

}
