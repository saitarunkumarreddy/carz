package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	@RequestMapping("/reqStudentSpringForm")
	public String displayStudentSpringForm(Model m){		
		m.addAttribute("student", new StudentData());
		return "studntspring";
	}
	
	@RequestMapping("/reqStudentResultSpring")
	public String displayStudentResult(@ModelAttribute("student")StudentData sd,Model m){
		//System.out.println(sd.getStname());
		
		sd.setResult("PASS");
		for(int i:sd.getMarks()){
			if(i<35)
				sd.setResult("FAIL");
		}
		if(sd.getResult().equals("PASS")){
			int tot=0;
			for(int x:sd.getMarks())
				tot+=x;
			sd.setTotal(tot);
			sd.setAvg(sd.getTotal()/5);
			if(sd.getAvg()>=90)
				sd.setGrade("A+");
			else if(sd.getAvg()>=80)
				sd.setGrade("A");
			else if(sd.getAvg()>=70)
				sd.setGrade("B+");
			else if(sd.getAvg()>=60)
				sd.setGrade("B");
			else
				sd.setGrade("C");	
		}
		else{
			sd.setTotal(0);
			sd.setAvg(0);
			sd.setGrade("NA");
		}
		m.addAttribute("st", sd);
		return "studentresultspring";
	
}
	}
