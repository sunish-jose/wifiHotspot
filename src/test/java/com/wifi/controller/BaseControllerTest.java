package com.wifi.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.ui.ModelMap;
public class BaseControllerTest {
	String view_index ="index";
	
	@Test
	public void testWelcom() {
		BaseController baseController = new BaseController();
		ModelMap modelMap = new ModelMap();
		String actual = baseController.welcome(modelMap);
		assertEquals(view_index, actual);
	}
	
}
