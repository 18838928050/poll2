/**
 * 
 */
package com.briup.apps.poll1.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll1.Service.ICourseService;
import com.briup.apps.poll1.bean.Course;
import com.briup.apps.poll1.util.MsgResponse;

/**
 * @author： fu @time：2018年6月25日 下午2:45:17 @说明： 一份耕耘，一份收获
 **/
@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;

	@GetMapping("findAllCourse")
	public MsgResponse findAllCourse() {
		List<Course> list;
		try {
			list = courseService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
