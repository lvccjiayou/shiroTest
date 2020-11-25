package com.lvgang.shirotest.dao;

import com.lvgang.shirotest.pojo.TalUser;

import java.util.List;

public interface TalUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TalUser record);

    TalUser selectByPrimaryKey(Integer id);

    List<TalUser> selectAll();

    int updateByPrimaryKey(TalUser record);
}