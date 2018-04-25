package com.waterelephant.mallapp.activity.repository;

import com.waterelephant.mallapp.activity.entity.MallCouponRecordDetail;

public interface MallCouponRecordDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MallCouponRecordDetail record);

    int insertSelective(MallCouponRecordDetail record);

    MallCouponRecordDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallCouponRecordDetail record);

    int updateByPrimaryKey(MallCouponRecordDetail record);
}