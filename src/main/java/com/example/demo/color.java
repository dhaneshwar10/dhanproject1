package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class color {
	private String Favcolour="Green";
	@GetMapping("/")
	public String getMyFav() {
		return "My favourite colour is "+Favcolour;
	}
}
