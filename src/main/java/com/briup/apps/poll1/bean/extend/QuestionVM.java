/**
 * 
 */
package com.briup.apps.poll1.bean.extend;

import java.util.List;

import org.apache.ibatis.annotations.Options;

/**
 @author： fu    @time：2018年6月26日 上午10:14:50 
 @说明： 一份耕耘，一份收获
**/
public class QuestionVM {
private Long id;
private String name;
private String questionType;
private List<Options> options;//一个题目对应的所有选项
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQuestionType() {
	return questionType;
}
public void setQuestionType(String questionType) {
	this.questionType = questionType;
}
public List<Options> getOptions() {
	return options;
}
public void setOptions(List<Options> options) {
	this.options = options;
}

}
