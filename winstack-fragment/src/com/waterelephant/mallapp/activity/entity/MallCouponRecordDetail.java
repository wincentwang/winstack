package com.waterelephant.mallapp.activity.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MallCouponRecordDetail {
    /**
     * 
     */
    private Long id;

    /**
     * coupon_record_id
     */
    private Long couponRecordId;

    /**
     * 面额主键
     */
    private Long couponDetailId;

    /**
     * 客户id
     */
    private Long borrowId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 商城订单id
     */
    private Long billId;

    /**
     * 状态：1未使用；2已使用；3已过期；4锁定
     */
    private Byte status;

    /**
     * 面额
     */
    private BigDecimal amount;

    /**
     * 张数：一条记录代表一张
     */
    private Integer count;

    /**
     * 有效开始时间
     */
    private Date startTime;

    /**
     * 有效结束时间
     */
    private Date endTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 来源类型：1购买；2代扣；3后台手动发放
     */
    private Byte type;

    /**
     * 客户id
     */
    private Long borrowerId;

    /**
     * 活动id
     */
    private Long activityId;

    /**
     * 券id
     */
    private Long couponId;

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
     * coupon_record_id
     * @return coupon_record_id coupon_record_id
     */
    public Long getCouponRecordId() {
        return couponRecordId;
    }

    /**
     * coupon_record_id
     * @param couponRecordId coupon_record_id
     */
    public void setCouponRecordId(Long couponRecordId) {
        this.couponRecordId = couponRecordId;
    }

    /**
     * 面额主键
     * @return coupon_detail_id 面额主键
     */
    public Long getCouponDetailId() {
        return couponDetailId;
    }

    /**
     * 面额主键
     * @param couponDetailId 面额主键
     */
    public void setCouponDetailId(Long couponDetailId) {
        this.couponDetailId = couponDetailId;
    }

    /**
     * 客户id
     * @return borrow_id 客户id
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * 客户id
     * @param borrowId 客户id
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 真实姓名
     * @return real_name 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实姓名
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 商城订单id
     * @return bill_id 商城订单id
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * 商城订单id
     * @param billId 商城订单id
     */
    public void setBillId(Long billId) {
        this.billId = billId;
    }

    /**
     * 状态：1未使用；2已使用；3已过期；4锁定
     * @return status 状态：1未使用；2已使用；3已过期；4锁定
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态：1未使用；2已使用；3已过期；4锁定
     * @param status 状态：1未使用；2已使用；3已过期；4锁定
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 面额
     * @return amount 面额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 面额
     * @param amount 面额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 张数：一条记录代表一张
     * @return count 张数：一条记录代表一张
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 张数：一条记录代表一张
     * @param count 张数：一条记录代表一张
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 有效开始时间
     * @return start_time 有效开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 有效开始时间
     * @param startTime 有效开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 有效结束时间
     * @return end_time 有效结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 有效结束时间
     * @param endTime 有效结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * 来源类型：1购买；2代扣；3后台手动发放
     * @return type 来源类型：1购买；2代扣；3后台手动发放
     */
    public Byte getType() {
        return type;
    }

    /**
     * 来源类型：1购买；2代扣；3后台手动发放
     * @param type 来源类型：1购买；2代扣；3后台手动发放
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 客户id
     * @return borrower_id 客户id
     */
    public Long getBorrowerId() {
        return borrowerId;
    }

    /**
     * 客户id
     * @param borrowerId 客户id
     */
    public void setBorrowerId(Long borrowerId) {
        this.borrowerId = borrowerId;
    }

    /**
     * 活动id
     * @return activity_id 活动id
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 活动id
     * @param activityId 活动id
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 券id
     * @return coupon_id 券id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 券id
     * @param couponId 券id
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
}