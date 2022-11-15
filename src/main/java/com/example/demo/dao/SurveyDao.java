package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Survey;

public interface SurveyDao {

void insertInquiry(Survey servey);
	
	List<Survey> getAll();
}
