package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Autowired //按眉积己 镭瘤富磊!!!!!
	Student student;
	
	@Autowired
	Worker worker;

	@RequestMapping("/")
	public String home(Model model) {
		logger.info("student, worker");
		
		student.getStudentInfo();
		worker.getWorkerInfo();
		
		return "home";
	}
	
}
