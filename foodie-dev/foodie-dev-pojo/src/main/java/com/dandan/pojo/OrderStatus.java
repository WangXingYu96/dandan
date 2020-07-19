package com.dandan.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "order_status")
public class OrderStatus {
    @Id
    private Integer id;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "pay_time")
    private Date payTime;

    @Column(name = "deliver_time")
    private Date deliverTime;

    @Column(name = "success_time")
    private Date successTime;

    @Column(name = "close_time")
    private Date closeTime;

    @Column(name = "comment_time")
    private Date commentTime;

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
     * @return order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
     * @return pay_time
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * @return deliver_time
     */
    public Date getDeliverTime() {
        return deliverTime;
    }

    /**
     * @param deliverTime
     */
    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    /**
     * @return success_time
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * @param successTime
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * @return close_time
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * @param closeTime
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * @return comment_time
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * @param commentTime
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}