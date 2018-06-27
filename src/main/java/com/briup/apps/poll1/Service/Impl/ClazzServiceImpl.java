/**
 * 
 */
package com.briup.apps.poll1.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll1.Service.IClazzService;
import com.briup.apps.poll1.bean.Clazz;
import com.briup.apps.poll1.bean.ClazzExample;
import com.briup.apps.poll1.bean.extend.ClazzVM;
import com.briup.apps.poll1.dao.ClazzMapper;
import com.briup.apps.poll1.dao.extend.ClazzVMMapper;

/**
 @author： fu    @time：2018年6月26日 上午9:27:34 
 @说明： 一份耕耘，一份收获
**/
@Service
public class ClazzServiceImpl implements IClazzService {
	@Autowired
private ClazzMapper clazzMapper;
	@Autowired
private ClazzVMMapper clazzVMMapper;
	@Override
	public List<Clazz> findAll() throws Exception {
		ClazzExample example=new ClazzExample();
		return clazzMapper.selectByExampleWithBLOBs(example);
	}

	/* (non-Javadoc)
	 * @see com.briup.apps.poll1.Service.IClazzService#findAllClazzVM()
	 */
	@Override
	public List<ClazzVM> findAllClazzVM() throws Exception {
		// TODO Auto-generated method stub
		return clazzVMMapper.selectAll();
	}

	/* (non-Javadoc)
	 * @see com.briup.apps.poll1.Service.IClazzService#deleteById(java.lang.Long)
	 */
	@Override
	public void  deleteById(Long id) throws Exception {
clazzMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.briup.apps.poll1.Service.IClazzService#update(com.briup.apps.poll1.bean.Clazz)
	 */
	@Override
	public void update(Clazz clazz) throws Exception {
	clazzMapper.updateByPrimaryKey(clazz);
		
	}

	/* (non-Javadoc)
	 * @see com.briup.apps.poll1.Service.IClazzService#batchDelete(java.lang.Long)
	 */
	@Override
	public void batchDelete(List<Long> ids) {
for (Long id : ids) {
	clazzMapper.deleteByPrimaryKey(id);
	
}		
	}

	/* (non-Javadoc)
	 * @see com.briup.apps.poll1.Service.IClazzService#query(java.lang.String)
	 */
	@Override
	public List<Clazz> query(String keywords) {
		ClazzExample example=new ClazzExample();
		example.createCriteria().andNameLike(keywords);
		return clazzMapper.selectByExampleWithBLOBs(example);
	}

	/* (non-Javadoc)
	 * @see com.briup.apps.poll1.Service.IClazzService#save(com.briup.apps.poll1.bean.Clazz)
	 */
	@Override
	public void save(Clazz clazz) throws Exception {
clazzMapper.insert(clazz);		
	}
}
