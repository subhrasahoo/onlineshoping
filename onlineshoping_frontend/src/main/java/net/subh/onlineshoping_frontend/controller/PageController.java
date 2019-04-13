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
		mv.addObject("greeting","welcome to spring web mvc");
		return mv;
	}
	/*@RequestMapping(value ="/test")
	public ModelAndView test(@RequestParam(value="greeting" ,required=false)String subhugreeting) {
	*//**	RequestMapping : used to get the value from query string
		"greeting" hs to be ther in query string or else 404 error.
		But if u dont want even if greeting is not there it should show some thing then use required=false *//*
		if(subhugreeting==null)
			subhugreeting="hello subhu what's up";
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("valueToBeshown",subhugreeting);
		return mv;
	}*/
	/*@RequestMapping(value ="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String subhugreeting) {
	*//**	PathVariable :in order to make url clean and make it more SEO friendly we need to access the value from
	 * the path *//*
		if(subhugreeting==null)
			subhugreeting="hello subhu what's up";
		ModelAndView mv = new ModelAndView("page");//"page" is the logical view name
		mv.addObject("valueToBeshown",subhugreeting);
		return mv;
	}*/
}
