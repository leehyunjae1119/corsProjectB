package com.cors.lhj;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cors.lhj.vo.CustomerVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);


		return "home";
	}

	// ------------------------------------------------------------------------
	
//	@RequestMapping(value="corsAction.do")
//	@ResponseBody
//	public CustomerVO corsAction(String name) {
//		CustomerVO customerVO = new CustomerVO();
//		
//		customerVO.setName(name);
//		customerVO.setEmail("danepo91@wips.co.kr");
//		
//		return customerVO;
//	}


}
