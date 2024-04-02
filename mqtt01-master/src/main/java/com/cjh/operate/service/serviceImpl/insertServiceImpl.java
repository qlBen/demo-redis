package com.cjh.operate.service.serviceImpl;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjh.operate.dao.Dao;
import com.cjh.operate.model.Status;
import com.cjh.operate.service.insertService;

public class insertServiceImpl implements insertService{
	
	@Autowired
	private Dao dao;
	

	@Override
	public void insertInfo(int temperature, int humidity, Status status, Date date, Time time) {
		// TODO Auto-generated method stub
		String receiveData = "temperature:23,humidity:35,Status:ON";
		LocalDateTime currentTime = LocalDateTime.now();
		String DateplusTime = receiveData +"-"+currentTime;
		dao.insertInfo(23, 34, status, date, time);
	}
}
