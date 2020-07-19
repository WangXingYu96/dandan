package com.dandan.pojo;

import javax.persistence.*;
import java.util.Date;

public class Orders {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_mobile")
    private String receiverMobile;

    @Column(name = "receiver_address")
    private String receiverAddress;

    @Column(name = "total_amount")
    private Integer totalAmount;

    @Column(name = "real_pay_amount")
    private Integer realPayAmount;

    @Column(name = "post_amount")
    private Integer postAmount;

    @Column(name = "pay_method")
    private Integer payMethod;

    @Column(name = "left_msg")
    private String leftMsg;

    private String extand;

    @Column(name = "is_comment")
    private Integer isComment;

    @Column(name = "is_delete")
    private Integer isDelete;

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
     * @return receiver_name
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * @param receiverName
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * @return receiver_mobile
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * @param receiverMobile
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * @return receiver_address
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * @param receiverAddress
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * @return total_amount
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount
     */
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return real_pay_amount
     */
    public Integer getRealPayAmount() {
        return realPayAmount;
    }

    /**
     * @param realPayAmount
     */
    public void setRealPayAmount(Integer realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    /**
     * @return post_amount
     */
    public Integer getPostAmount() {
        return postAmount;
    }

    /**
     * @param postAmount
     */
    public void setPostAmount(Integer postAmount) {
        this.postAmount = postAmount;
    }

    /**
     * @return pay_method
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * @param payMethod
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * @return left_msg
     */
    public String getLeftMsg() {
        return leftMsg;
    }

    /**
     * @param leftMsg
     */
    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg;
    }

    /**
     * @return extand
     */
    public String getExtand() {
        return extand;
    }

    /**
     * @param extand
     */
    public void setExtand(String extand) {
        this.extand = extand;
    }

    /**
     * @return is_comment
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * @param isComment
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    /**
     * @return is_delete
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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