package com.wemallDubbo.service;

import java.util.List;

import com.wemallDubbo.model.Student;

public interface StudentService {
	
	/**
	 * 分页查询学生列表
	 * @param start	开始
	 * @param end	结束
	 * @return
	 */
	List<Student> listStu(int start, int end);
	
	/**
	 * 查询所有学生信息
	 * @return
	 */
	List<Student> queryAll();
}
