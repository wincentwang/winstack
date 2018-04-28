package com.waterelephant.mallapp.activity.repository;

import com.waterelephant.mallapp.activity.entity.MallActivityTag;

public interface MallActivityTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MallActivityTag record);

    int insertSelective(MallActivityTag record);

    MallActivityTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallActivityTag record);

    int updateByPrimaryKey(MallActivityTag record);
}