package com.putaoteng.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.putaoteng.dao.UserDao;
import com.putaoteng.model.User;

@Controller
public class SpringmvcDemo {
	@Resource (name="userDao")
	private UserDao userDao;
	
	@RequestMapping (value="/index.do")
	public ModelAndView sayHi(){
		ModelAndView mav = new ModelAndView();
		List<User> list = new ArrayList<User>();
		
		list = userDao.queryUserAll();
		
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		
		return mav;
	}
}
