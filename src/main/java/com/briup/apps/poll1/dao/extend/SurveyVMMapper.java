/**
 * 
 */
package com.briup.apps.poll1.dao.extend;

import java.util.List;

/**
 @author： fu    @time：2018年6月29日 上午9:15:43 
 @说明： 一份耕耘，一份收获
 * @param <SurveyVM>
**/
public interface SurveyVMMapper<SurveyVM> {

	
	List<SurveyVM> seleteAll();
}
