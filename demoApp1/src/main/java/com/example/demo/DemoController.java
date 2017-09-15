package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	 @Autowired
	 public DemoRespository demoRepository;
	 
	 @RequestMapping("/create")
	 public String create(Demo demo) {
		 demo = demoRepository.save(demo);
	  return "Demo for Spring created successfully";
	 }
	 
	@RequestMapping("/all")
	 public List<Demo> readAll() {
	  return demoRepository.findAll();
	}
	
}
