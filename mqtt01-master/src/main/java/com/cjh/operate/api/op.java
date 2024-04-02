	package com.cjh.operate.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjh.operate.service.insertService;

@RestController
public class op {

	@Autowired
	private insertService insertservice;
	@RequestMapping("/insertInfo") // 请求映射,输入这个路径匹配这个方法
	public void insertInfo() {

		// 1、接收参数
		// 2、实现验证、到数据库中去对比数据（移植service，dao）
		// 3、返回结果类型（map，jsonlib）
		insertservice.insertInfo(23, 34, null, null, null);
		 System.out.println("ok");
		// return null;
	}
}
