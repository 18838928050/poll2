/**
 * 
 */
package com.briup.apps.poll1.Service;

import java.util.List;

import com.briup.apps.poll1.bean.Question;
import com.briup.apps.poll1.bean.extend.QuestionVM;

/**
 @author： fu    @time：2018年6月25日 上午10:25:53 
 @说明： 一份耕耘，一份收获
**/
public interface IQuestionService  {
	List<Question> findAll() throws Exception;
	List<QuestionVM> findAllQuestinVM() throws Exception;
}