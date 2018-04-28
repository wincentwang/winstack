package com.waterelephant.mallapp.activity.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MallCoupon {
    /**
     * 
     */
    private Long id;

    /**
     * 优惠券名称
     */
    private String couponName;

    /**
     * 最小借款金额
     */
    private BigDecimal minLoanAmount;

    /**
     * 最大借款金额
     */
    private BigDecimal maxLoanAmount;

    /**
     * 购买价格
     */
    private BigDecimal price;

    /**
     * 有效期（天数）
     */
    private Integer validityDay;

    /**
     * 购买须知
     */
    private String introduce;

    /**
     * 新用户标识
     */
    private Integer newUserTag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除：0正常；1删除
     */
    private Byte isDelete;

    /**
     * 状态：0有效；1无效
     */
    private Byte state;

    /**
     * 操作人id
     */
    private Long optUser;

    /**
     * 优惠券类型 1:商城优惠券，2：新人券，3：满减券
     */
    private Integer type;

    /**
     * 优惠券图片
     */
    private String img;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 优惠券名称
     * @return coupon_name 优惠券名称
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 优惠券名称
     * @param couponName 优惠券名称
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    /**
     * 最小借款金额
     * @return min_loan_amount 最小借款金额
     */
    public BigDecimal getMinLoanAmount() {
        return minLoanAmount;
    }

    /**
     * 最小借款金额
     * @param minLoanAmount 最小借款金额
     */
    public void setMinLoanAmount(BigDecimal minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    /**
     * 最大借款金额
     * @return max_loan_amount 最大借款金额
     */
    public BigDecimal getMaxLoanAmount() {
        return maxLoanAmount;
    }

    /**
     * 最大借款金额
     * @param maxLoanAmount 最大借款金额
     */
    public void setMaxLoanAmount(BigDecimal maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    /**
     * 购买价格
     * @return price 购买价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 购买价格
     * @param price 购买价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 有效期（天数）
     * @return validity_day 有效期（天数）
     */
    public Integer getValidityDay() {
        return validityDay;
    }

    /**
     * 有效期（天数）
     * @param validityDay 有效期（天数）
     */
    public void setValidityDay(Integer validityDay) {
        this.validityDay = validityDay;
    }

    /**
     * 购买须知
     * @return introduce 购买须知
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 购买须知
     * @param introduce 购买须知
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * 新用户标识
     * @return new_user_tag 新用户标识
     */
    public Integer getNewUserTag() {
        return newUserTag;
    }

    /**
     * 新用户标识
     * @param newUserTag 新用户标识
     */
    public void setNewUserTag(Integer newUserTag) {
        this.newUserTag = newUserTag;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 是否删除：0正常；1删除
     * @return is_delete 是否删除：0正常；1删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除：0正常；1删除
     * @param isDelete 是否删除：0正常；1删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 状态：0有效；1无效
     * @return state 状态：0有效；1无效
     */
    public Byte getState() {
        return state;
    }

    /**
     * 状态：0有效；1无效
     * @param state 状态：0有效；1无效
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 操作人id
     * @return opt_user 操作人id
     */
    public Long getOptUser() {
        return optUser;
    }

    /**
     * 操作人id
     * @param optUser 操作人id
     */
    public void setOptUser(Long optUser) {
        this.optUser = optUser;
    }

    /**
     * 优惠券类型 1:商城优惠券，2：新人券，3：满减券
     * @return type 优惠券类型 1:商城优惠券，2：新人券，3：满减券
     */
    public Integer getType() {
        return type;
    }

    /**
     * 优惠券类型 1:商城优惠券，2：新人券，3：满减券
     * @param type 优惠券类型 1:商城优惠券，2：新人券，3：满减券
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 优惠券图片
     * @return img 优惠券图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 优惠券图片
     * @param img 优惠券图片
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}