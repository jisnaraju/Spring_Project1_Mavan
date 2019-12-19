package com.jisna.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jisna.model.Login;

import com.jisna.model.UserRegister;
import com.jisna.service.UserService;
@Controller

public class Hellocontroller {
	@Autowired
	UserService userService;
		@RequestMapping(value="/")
		public ModelAndView index()
		{
			
			ModelAndView mv=new ModelAndView("index");
		    return mv;
		}
		@RequestMapping(value="Register")
		public String Register()
		{
		return "register";
		}
		@RequestMapping(value="login")
		public String login()
		{
		return "login";
		}
		
		@RequestMapping(value="RegisterProcess",method=RequestMethod.POST)
		public ModelAndView RegisterProcess(HttpServletRequest request,HttpServletResponse response,UserRegister user)
		{
			userService.register(user);
			return new ModelAndView("index","Name",user.getFname());
		}
		@RequestMapping(value="loginProcess",method=RequestMethod.POST)
		public ModelAndView LoginProcess(HttpServletRequest request,HttpServletResponse response,Login login)
		{
			ModelAndView mav=null;
		System.out.println(login.getUname());
		System.out.println(login.getPassword());
			UserRegister user=userService.ValidateUser(login);
			System.out.println(user);
			if(null!=user)
			{
				System.out.println("logined");
				mav=new ModelAndView("Welcome");
				mav.addObject("Firstname", user.getUname());
			}
			else
			{
				mav=new ModelAndView("login");
				mav.addObject("message","User name or password is wrong !");
			}
			return mav;
		}
}
