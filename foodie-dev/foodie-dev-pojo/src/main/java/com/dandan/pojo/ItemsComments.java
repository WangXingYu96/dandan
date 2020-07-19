package com.dandan.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "items_comments")
public class ItemsComments {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_spec_id")
    private String itemSpecId;

    @Column(name = "sepc_name")
    private String sepcName;

    @Column(name = "comment_level")
    private Integer commentLevel;

    private String content;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return item_id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return item_spec_id
     */
    public String getItemSpecId() {
        return itemSpecId;
    }

    /**
     * @param itemSpecId
     */
    public void setItemSpecId(String itemSpecId) {
        this.itemSpecId = itemSpecId;
    }

    /**
     * @return sepc_name
     */
    public String getSepcName() {
        return sepcName;
    }

    /**
     * @param sepcName
     */
    public void setSepcName(String sepcName) {
        this.sepcName = sepcName;
    }

    /**
     * @return comment_level
     */
    public Integer getCommentLevel() {
        return commentLevel;
    }

    /**
     * @param commentLevel
     */
    public void setCommentLevel(Integer commentLevel) {
        this.commentLevel = commentLevel;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return updated_time
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}