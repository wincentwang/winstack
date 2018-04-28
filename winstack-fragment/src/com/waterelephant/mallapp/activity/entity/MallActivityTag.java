package com.waterelephant.mallapp.activity.entity;

import java.util.Date;

public class MallActivityTag {
    /**
     * 主键
     */
    private Long id;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动标签分类ID
     */
    private Long tagId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 活动ID
     * @return activity_id 活动ID
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 活动ID
     * @param activityId 活动ID
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 活动标签分类ID
     * @return tag_id 活动标签分类ID
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 活动标签分类ID
     * @param tagId 活动标签分类ID
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
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
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}