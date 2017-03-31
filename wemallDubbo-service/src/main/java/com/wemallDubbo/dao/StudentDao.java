package com.wemallDubbo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.wemallDubbo.model.Student;

/**
 * 编写访问数据库的接口
 * Student  
 * @author liyintao 2017年3月24日 星期三 下午17:01:00
*/

public interface StudentDao 
{
	/**
	 * 查询学生信息
	 * @param start
	 * @param end
	 * @return
	 */
    List<Student> findAll(@Param("start") int start, @Param("end") int end);
}