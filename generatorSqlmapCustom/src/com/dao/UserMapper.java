package com.dao;

import com.pojo.User;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2019-08-05
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-08-05
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2019-08-05
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2019-08-05
     */
    User selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-08-05
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2019-08-05
     */
    int updateByPrimaryKey(User record);
}