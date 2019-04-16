package net.subh.onlineshoping_frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.subh.onlineshoping_backend.dao.CategoryDAO;
import net.subh.onlineshoping_backend.dto.Category;

/**
 * @author SUBHU
 */
@Controller
public class PageController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		//all controllers in the Spring Web MVC framework return a ModelAndView instance.
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("title","Home");
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome",true);
		return mv;
	}
	@RequestMapping(value = "/about" )
	public ModelAndView about() {
		//all controllers in the Spring Web MVC framework return a ModelAndView instance.
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value = "/contact" )
	public ModelAndView contact() {
		//all controllers in the Spring Web MVC framework return a ModelAndView instance.
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	/**
	 * method to load all products and based on category
	 */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		//all controllers in the Spring Web MVC framework return a ModelAndView instance.
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("title","All Products");
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		//all controllers in the Spring Web MVC framework return a ModelAndView instance.
		
		//categoryDAO to fetch a single category
		Category category = null;
		category = categoryDAO.get(id);
		
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("title",category.getName());
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		//passing the single category object
		mv.addObject("category", category);
				
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
}
