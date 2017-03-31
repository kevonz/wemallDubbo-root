package com.wemallDubbo.service;

import java.util.List;

import com.wemallDubbo.model.Student;

public interface StudentService {
	
	/**
	 * 查询学生列表
	 * @param start	开始
	 * @param end	结束
	 * @return
	 */
	List<Student> listStu(int start, int end);
	
}
