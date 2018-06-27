/**
 * 
 */
package com.briup.apps.poll1.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll1.Service.IClazzService;
import com.briup.apps.poll1.bean.Clazz;
import com.briup.apps.poll1.bean.extend.ClazzVM;
import com.briup.apps.poll1.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author： fu @time：2018年6月25日 下午2:45:17 @说明： 一份耕耘，一份收获
 **/
@RestController
@Api(description="clazz相关接口")
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private IClazzService iClazzService;
	@GetMapping("findAllClazzVM")
	@ApiOperation(value="查询所有的班级信息",notes="每个班级信息中包含班级所属年级和班级所属的班主任的信息")
	public MsgResponse findAllClazzVM() {
	
		try {
			List<ClazzVM> list = iClazzService.findAllClazzVM();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation("查询所有的班级信息")
	@GetMapping("findAllClazz")
	public MsgResponse findAllClazz(){
		try {
			List<Clazz> list = iClazzService.findAll();
			
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
}
	// 关键字查询
	@ApiOperation("根据关键字查看clazz信息")
	@GetMapping("query")
	public MsgResponse query(String keywords) {
		try {
			List<Clazz> list = iClazzService.query(keywords);
			return MsgResponse.success("成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation("修改clazz信息")
	@GetMapping("update")
	public MsgResponse update(Clazz clazz) {
		try {
			iClazzService.update(clazz);
			return MsgResponse.success("成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	/*
	
		
		
		@ApiOperation("保存clazz信息")
		@GetMapping("/update")
		public String save(Clazz clazz) {
			
			try {
				iClazzService.save(clazz);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "保存成功";
			
		}*/
}
