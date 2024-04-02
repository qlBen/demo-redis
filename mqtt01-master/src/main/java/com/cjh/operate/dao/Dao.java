package com.cjh.operate.dao;

import java.sql.Date;
import java.sql.Time;

import com.cjh.operate.model.Status;

public interface Dao {
	
	/*
	 * 插入数据
	 */
	public void insertInfo(int temperature,int humidity, Status status,Date date,Time time);
	

}
