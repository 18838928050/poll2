package com.briup.apps.poll1.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll1.Service.IGradeService;
import com.briup.apps.poll1.bean.Grade;
import com.briup.apps.poll1.bean.GradeExample;
import com.briup.apps.poll1.bean.extend.GradeVM;
import com.briup.apps.poll1.dao.GradeMapper;
import com.briup.apps.poll1.dao.extend.GradeVMMapper;


@Service

public class GradeServiceImpl implements IGradeService{
	@Autowired
	private GradeMapper gradeMapper;
	@Autowired
	private GradeVMMapper gradeVMMapper;

	@Override
	public List<Grade> findAll() throws Exception {
		
		GradeExample example = new GradeExample();
		
		return gradeMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<GradeVM> findAllGradeVM() throws Exception {
		return gradeVMMapper.selectAll();
	}
	
	@Override
	public List<Grade> query(String keywords) throws Exception {
		
		GradeExample example = new GradeExample();
		example.createCriteria().andNameLike(keywords);
		return gradeMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public void save(Grade grade) throws Exception {
		gradeMapper.insert(grade);
		
		
	}

	@Override
	public void update(Grade grade) throws Exception {
		gradeMapper.updateByPrimaryKey(grade);
		
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		gradeMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void batchDelete(long[] ids) throws Exception {
		for(long id : ids){
			gradeMapper.deleteByPrimaryKey(id);
		}
	}


}
