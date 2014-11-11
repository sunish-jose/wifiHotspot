package com.wifi.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wifi.model.User;
import com.wifi.service.BaseService;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Autowired
	private BaseService baseService;
	
	@RequestMapping(method=RequestMethod.GET, params="newUser")
	public String createNewUser(Model model){
		model.addAttribute(new User());
		return "user/edit";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addNewUser(@Valid User user, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "user/edit";
		}
		user.setCreationDate(new Date());
		baseService.createEntity(user);
		return "redirect:/"+user.getFullName();
	}

}
