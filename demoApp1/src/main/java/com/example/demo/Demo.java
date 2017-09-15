package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="demo")
public class Demo {

    @Id
    public String id;
    public String title;

    public Demo() {}

    public void setTitle(String title){
    	this.title = title;
    }
    public String getTitle(){
    	return title;
    }
	
}
