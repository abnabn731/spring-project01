package com.example.project01.service.security;

import javax.annotation.Resource;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ShaEncoder {
	// security-context.xml에 선언된 passwordEncoder bean 주입
	@Resource(name="passwordEncoder") 
	ShaPasswordEncoder encoder;
	
	public String encoding(String str) {
		return encoder.encodePassword(str, null);
	}
	public String saltEncoding(String str, String salt) {
		return encoder.encodePassword(str, salt);
	}
}





