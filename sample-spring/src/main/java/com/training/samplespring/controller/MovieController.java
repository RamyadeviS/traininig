package com.training.samplespring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.practice.model.MovieModel;
import com.training.samplespring.dao.MovieDAO;

@Controller
public class MovieController {
	@Autowired
	MovieDAO movieDao;

	// handler
	@RequestMapping("/")
	public String home() {
		System.out.println("through controller");
		return "HomePage.jsp";
	}

	@PostMapping("/home")
	public String homePage() {
		System.out.println("through controller");
		return "MovieRegister.jsp";
	}

	@PostMapping("/register")
	public String register(@RequestParam("name") String name, @RequestParam("password") String password,
			@RequestParam("id") int id, @RequestParam("mobile_no") Long mobileNo, @RequestParam("mail_id") String mailId,
			@RequestParam("role") String role) {
		System.out.println("saving user records");
		MovieModel movie = new MovieModel();
		movie.setName(name);
		movie.setPassword(password);
		movie.setId(id);
		movie.setMobileNO(mobileNo);
		movie.setMailId(mailId);
		movie.setRole(role);
		movieDao.saveMovie(movie);
		return "HomePage.jsp";

	}
}