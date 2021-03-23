package com.test.sp13.entity;


import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class TestVO {
	private String title;
	private String name;
	
	@Transient
	private MultipartFile file;
}
