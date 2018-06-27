/**
 * 
 */
package com.briup.apps.poll1.Service;

import java.util.List;

import com.briup.apps.poll1.bean.Clazz;
import com.briup.apps.poll1.bean.extend.ClazzVM;

/**
 @author： fu    @time：2018年6月26日 上午9:26:43 
 @说明： 一份耕耘，一份收获
**/
public interface IClazzService {
List<Clazz> findAll() throws Exception;
List<ClazzVM> findAllClazzVM() throws Exception;
void deleteById(Long id) throws Exception;
void update(Clazz clazz)throws Exception;
void save(Clazz	clazz) throws Exception;
void batchDelete(List<Long> id);
List<Clazz> query(String keywords);
}
