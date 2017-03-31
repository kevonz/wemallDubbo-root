package com.wemallDubbo.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wemallDubbo.dao.StudentDao;
import com.wemallDubbo.model.Student;
import com.wemallDubbo.service.StudentService;
import com.wemallDubbo.test.SpringTest;

@com.alibaba.dubbo.config.annotation.Service
@Service(value = "StudentService")
public class StudentServiceImpl implements StudentService{

	private static Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Resource
	StudentDao stuDao;
	Long times = System.currentTimeMillis();
	
	@Override
	public List<Student> listStu(int start, int end) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("end", end);
		List<Student> list = stuDao.findAll(0, 10);
		return list;
	}

	@Override
	public List<Student> queryAll() {
		log.info("定时查询学生信息：" + new Date(times));
		List<Student> list = stuDao.queryAll();
		System.out.println(list.get(0).toString());
		return stuDao.queryAll();
	}

}
