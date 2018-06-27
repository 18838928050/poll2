/**
 * 
 */
package com.briup.apps.poll1.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll1.Service.IQuestionService;
import com.briup.apps.poll1.bean.Question;
import com.briup.apps.poll1.bean.QuestionExample;
import com.briup.apps.poll1.bean.extend.QuestionVM;
import com.briup.apps.poll1.dao.QuestionMapper;
import com.briup.apps.poll1.dao.extend.QuestionVMMapper;

/**
 @author： fu    @time：2018年6月26日 上午9:27:34 
 @说明： 一份耕耘，一份收获
**/
@Service
public class QuestionServiceImpl implements IQuestionService {
	@Autowired
private QuestionMapper	questionMapper;
	@Autowired
private QuestionVMMapper questionVMMapper;
	@Override
	public List<Question> findAll() throws Exception {
		QuestionExample example=new QuestionExample();
		return questionMapper.selectByExample(example);
	}
	@Override
	public List<QuestionVM> findAllQuestinVM() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
