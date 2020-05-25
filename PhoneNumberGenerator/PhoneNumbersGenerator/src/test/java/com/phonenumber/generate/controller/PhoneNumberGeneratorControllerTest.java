package com.phonenumber.generate.controller;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class PhoneNumberGeneratorControllerTest {

	PhoneNumberGeneratorController phoneNumberGeneratorController = new PhoneNumberGeneratorController();

	@Test
	public void testGeneratePhoneNumbers() {
		List<String> list = phoneNumberGeneratorController.generatePhoneNumbers("12345678");
		assertTrue(!list.isEmpty());
	}

}
