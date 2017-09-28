package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/*public class HelloController implements Controller{
	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception{
		logger.info("handleRequest被调用");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World");
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		return mv;
	}
//	public ModelAndView handleSession(HttpSession session) throws Exception{
//		logger.info("handleRequest2被调用");
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("message2", "Hello World");
//		mv.setViewName("/WEB-INF/content/welcome.jsp");
//		return mv;
//	}
}*/
@Controller
@SessionAttributes("message")//将model中的message属性加入到HttpSession对象中
@RequestMapping(value="/hello")
public class HelloController{
	private static final Log logger = LogFactory.getLog(HelloController.class);
	@RequestMapping(value="/hello2")
	public ModelAndView hello2(HttpSession httpSession,HttpServletRequest httpServletRequest){
		logger.info("hello2 方法被调用");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World");
		mv.addObject("message2", "ZZ");
		mv.addObject("message3", httpSession.getAttribute("message"));
		mv.addObject("message4",httpServletRequest.getParameter("text"));
		mv.addObject("msg", "hello2");
		mv.setViewName("welcome2");
		return mv;
	}
	@RequestMapping(value="/hello3")
	public ModelAndView hello3(HttpSession httpSession,HttpServletRequest httpServletRequest){
		logger.info("hello3 方法被调用");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World");
		mv.addObject("message2", "ZZ");
		mv.addObject("message3", httpSession.getAttribute("message"));
		mv.addObject("message4",httpServletRequest.getParameter("text"));
		mv.addObject("msg", "hello3");
		mv.setViewName("welcome3");
		return mv;
	}
}
