package com.waterelephant.mallapp.activity.repository;

import com.waterelephant.mallapp.activity.entity.MallCoupon;

public interface MallCouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MallCoupon record);

    int insertSelective(MallCoupon record);

    MallCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallCoupon record);

    int updateByPrimaryKey(MallCoupon record);
}