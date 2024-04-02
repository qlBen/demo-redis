package com.cjh.operate.service;

import java.sql.Date;
import java.sql.Time;

import com.cjh.operate.model.Status;

public interface insertService {
	
	public void insertInfo(int temperature,int humidity,Status status,Date date,Time time);

}
