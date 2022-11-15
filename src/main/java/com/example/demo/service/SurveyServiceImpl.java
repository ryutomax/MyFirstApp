package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Survey;
import com.example.demo.dao.SurveyDao;

@Service
public class SurveyServiceImpl implements SurveyService {

	private final SurveyDao dao;

	SurveyServiceImpl(SurveyDao dao){
		this.dao = dao;
	}

	@Override
	public void save(Survey survey) {
		dao.insertInquiry(survey);
	}

	@Override
	public List<Survey> getAll() {
//		if(dao.getAll().isEmpty()) {
//			throw new InquiryNotFoundException("SQL error");
//		}
		return dao.getAll();
	}

}