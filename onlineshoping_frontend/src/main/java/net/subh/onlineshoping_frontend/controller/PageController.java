package net.subh.onlineshoping_frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author SUBHU
 */
@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		//all controllers in the Spring Web MVC framework return a ModelAndView instance.
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("title","Home");
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
}
