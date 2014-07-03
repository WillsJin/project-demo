package com.yali.design.mapper.gen;

import com.yali.design.mapper.gen.entity.TIdUser;
import com.yali.design.mapper.gen.entity.TIdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TIdUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int countByExample(TIdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int deleteByExample(TIdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int insert(TIdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int insertSelective(TIdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    List<TIdUser> selectByExample(TIdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    TIdUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int updateByExampleSelective(@Param("record") TIdUser record, @Param("example") TIdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int updateByExample(@Param("record") TIdUser record, @Param("example") TIdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int updateByPrimaryKeySelective(TIdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b2g.t_id_user
     *
     * @mbggenerated Wed Mar 19 14:31:37 CST 2014
     */
    int updateByPrimaryKey(TIdUser record);
}