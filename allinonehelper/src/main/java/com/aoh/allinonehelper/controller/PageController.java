package com.aoh.allinonehelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aoh.allinonehelperbackend.dao.CategoryDAO;
import com.aoh.allinonehelperbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing list of category
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}
	@RequestMapping(value= "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value= "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	//methods to load all the products based on category
	@RequestMapping(value= "/show/all/services")
	public ModelAndView showAllServices() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Services");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllServices", true);
		return mv;
	}
	
	//methods to load all the products based on category
		@RequestMapping(value= "/show/category/{id}/services")
		public ModelAndView showCategoryServices(@PathVariable("id") int id) {
			ModelAndView mv = new ModelAndView("page");
			//categoryDAO to fetch the single category
			Category category = null;
			category = categoryDAO.get(id);
			mv.addObject("title", category.getName());
			//passing the list of categories
			mv.addObject("categories", categoryDAO.list());
			
			//passing the single category object
			mv.addObject("category", category);
			
			mv.addObject("userClickCategoryServices", true);
			return mv;
		}

}
