/**
 * 
 */
package com.briup.apps.poll1.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll1.Service.ISurveyService;
import com.briup.apps.poll1.bean.Survey;
import com.briup.apps.poll1.bean.extend.SurveyVM;
import com.briup.apps.poll1.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 @author： fu    @time：2018年6月29日 上午8:25:36 
 @说明： 一份耕耘，一份收获
**/
@Api(description="课调相关接口")
@RestController
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired
	private ISurveyService surveyService;
	
	@ApiOperation(value="保存或更新课调",notes="只需要输入courseId,userId,clazzId,quesitionnaireId")
	@PostMapping(value="saveOrUpdateSurvey")
public MsgResponse	saveOrUpdateSurvey(Survey survey) {
		try {
			surveyService.saveOrUpdate(survey);
			return MsgResponse.success("保存或修改成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
}
	
	
	@ApiOperation(value="查询所有课调",notes="级联查询出课调关联的课程，班级，讲师，问卷")
	@GetMapping(value="findAllSurveyVM")
public MsgResponse	findAllSurveyVM() {
		try {
			List<SurveyVM> list=surveyService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
}
	@ApiOperation(value="通过Id查询课调",notes="只需要输入courseId,userId,clazzId,quesitionnaireId")
	@GetMapping(value="findSurveyById")
public MsgResponse	findSurveyById(long id) {
		try {
			SurveyVM surveyvm=surveyService.findById(id);
			return MsgResponse.success("success", surveyvm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
}
}
