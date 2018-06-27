/**
 * 
 */
package com.briup.apps.poll1.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll1.Service.IQuestionService;
import com.briup.apps.poll1.bean.extend.QuestionVM;
import com.briup.apps.poll1.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

/**
 * @author： fu @time：2018年6月25日 下午2:45:17 @说明： 一份耕耘，一份收获
 **/
@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private IQuestionService iQuestionService;
	/*@PostMapping("batchDelete")
	public MsgResponse batchDelete(long[] ids){
		try {
			List<Long> idList=new ArrayList<>();
			for (Long id : ids) {
				idList.add(id);
			}
			iClazzService.batchDelete(idList);
			return MsgResponse.success("批量删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
*/
	@GetMapping("findAllQuestionVM")
	@ApiOperation(value="查询所有的信息",notes="每个题目信息下包含该题目")
	public MsgResponse findAllQuestionVM() {
		List<QuestionVM> list;
		try {
			list = iQuestionService.findAllQuestinVM();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
