package com.briup.apps.poll1.Service;

import java.util.List;

import com.briup.apps.poll1.bean.Answers;
import com.briup.apps.poll1.bean.extend.AnswersVM;


public interface IAnswersService {
	List<Answers> findAll() throws Exception;

	List<Answers> query(String keywords) throws Exception;

	List<AnswersVM> findAllAnswersVM() throws Exception;

	void save(Answers answers) throws Exception;

	void update(Answers answers) throws Exception;

	void delete(long id) throws Exception;

	void batchDelete(Long[] ids) throws Exception;
}
