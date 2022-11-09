package docker;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HController {
 
	@RequestMapping("/emp")
	public String getEmp() {
		return "emp.jsp";
	}
	@RequestMapping("/display")
	public ModelAndView getDis(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("/display.jsp");
		String veid = req.getParameter("eid");
		mv.addObject("meid",veid);
		String vename = req.getParameter("ename");
		mv.addObject("mename",vename);
		String vesal = req.getParameter("esal");
		mv.addObject("mesal",vesal);
		return mv;
	}
}
