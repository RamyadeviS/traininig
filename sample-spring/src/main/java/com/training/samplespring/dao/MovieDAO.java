package com.training.samplespring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.practice.model.MovieModel;

@Repository
public class MovieDAO {
@Autowired
JdbcTemplate jdbcTemplate;
	//crud-DB activities
public void listOfUsers() {
	System.out.println("List of users");
}

public void saveMovie(MovieModel movie) {
	System.out.println("To save movie");
	String save="insert into user1(name,password,id,mobile_no,mail_id,role)values(?,?,?,?,?,?)";
	Object params[]= {movie.getName(),movie.getPassword(),movie.getId(),movie.getMobileNO(),movie.getMailId(),movie.getRole()};
    jdbcTemplate.update(save,params);
}
}
