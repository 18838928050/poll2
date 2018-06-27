package com.briup.apps.poll1.dao;

import com.briup.apps.poll1.bean.QuestionnaireQuestion;
import com.briup.apps.poll1.bean.QuestionnaireQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireQuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    long countByExample(QuestionnaireQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int deleteByExample(QuestionnaireQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int insert(QuestionnaireQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int insertSelective(QuestionnaireQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    List<QuestionnaireQuestion> selectByExample(QuestionnaireQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    QuestionnaireQuestion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int updateByExampleSelective(@Param("record") QuestionnaireQuestion record, @Param("example") QuestionnaireQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int updateByExample(@Param("record") QuestionnaireQuestion record, @Param("example") QuestionnaireQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int updateByPrimaryKeySelective(QuestionnaireQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Tue Jun 26 10:41:33 CST 2018
     */
    int updateByPrimaryKey(QuestionnaireQuestion record);
}