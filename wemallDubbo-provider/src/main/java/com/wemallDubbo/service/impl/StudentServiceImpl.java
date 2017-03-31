package com.wemallDubbo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.wemallDubbo.dao.StudentDao;
import com.wemallDubbo.model.Student;

import com.wemallDubbo.common.Result;
import com.wemallDubbo.service.StudentService;

@com.alibaba.dubbo.config.annotation.Service
@Service(value = "StudentService")
public class StudentServiceImpl implements StudentService{

	@Resource
	StudentDao stuDao;
	
	@Override
	public List<Student> listStu(int start, int end) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("end", end);
		List<Student> list = stuDao.findAll(0, 10);
		return list;
	}

}
