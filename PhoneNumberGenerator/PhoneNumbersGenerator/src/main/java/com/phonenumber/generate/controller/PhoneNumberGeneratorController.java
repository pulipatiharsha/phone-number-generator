package com.phonenumber.generate.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phoneNumber")
public class PhoneNumberGeneratorController {
	private final static Map<String, List<String>> NUMBER_MAP = new HashMap<>();

	static {
		addNumber("2", new String[] { "a", "b", "c" });
		addNumber("3", new String[] { "d", "e", "f" });
		addNumber("4", new String[] { "g", "h", "i" });
		addNumber("5", new String[] { "j", "k", "l" });
		addNumber("6", new String[] { "m", "n", "o" });
		addNumber("7", new String[] { "p", "q", "r", "s" });
		addNumber("8", new String[] { "t", "u", "v" });
		addNumber("9", new String[] { "w", "x", "y", "z" });
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/generate", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<String> generatePhoneNumbers(@RequestParam("phoneNumber") String phoneNumber) {
		List<String> phoneNmbers = new LinkedList<>();
		int i = 0;
		for (Character c : phoneNumber.toLowerCase().toCharArray()) {
			if(NUMBER_MAP.keySet().contains(String.valueOf(c))) {
				for (String numChar : NUMBER_MAP.get(String.valueOf(c))) {
					String resultNumber = phoneNumber.substring(0, i) + numChar
							+ phoneNumber.substring(i + 1, phoneNumber.length());
					phoneNmbers.add(resultNumber);
				}
			}
			i++;
		}
		return phoneNmbers;
	}

	private static void addNumber(String key, String... val) {
		List<String> numberList = new ArrayList<String>(val.length);
		Collections.addAll(numberList, val);
		NUMBER_MAP.put(key, numberList);
	}

}
