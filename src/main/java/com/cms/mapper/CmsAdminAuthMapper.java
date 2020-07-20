package com.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.CmsAdminAuth;

@Mapper
public interface CmsAdminAuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_auth
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cmsAdminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_auth
     *
     * @mbg.generated
     */
    int insert(CmsAdminAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_auth
     *
     * @mbg.generated
     */
    int insertSelective(CmsAdminAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_auth
     *
     * @mbg.generated
     */
    CmsAdminAuth selectByPrimaryKey(Integer cmsAdminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_auth
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsAdminAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_admin_auth
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsAdminAuth record);
}