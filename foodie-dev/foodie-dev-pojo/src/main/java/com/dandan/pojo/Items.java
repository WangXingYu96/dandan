package com.dandan.pojo;

import javax.persistence.*;
import java.util.Date;

public class Items {
    @Id
    private Integer id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "cat_id")
    private Integer catId;

    @Column(name = "root_cat_id")
    private Integer rootCatId;

    @Column(name = "sell_counts")
    private Integer sellCounts;

    @Column(name = "on_off_status")
    private Integer onOffStatus;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    private String content;

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
     * @return cat_id
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * @param catId
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * @return root_cat_id
     */
    public Integer getRootCatId() {
        return rootCatId;
    }

    /**
     * @param rootCatId
     */
    public void setRootCatId(Integer rootCatId) {
        this.rootCatId = rootCatId;
    }

    /**
     * @return sell_counts
     */
    public Integer getSellCounts() {
        return sellCounts;
    }

    /**
     * @param sellCounts
     */
    public void setSellCounts(Integer sellCounts) {
        this.sellCounts = sellCounts;
    }

    /**
     * @return on_off_status
     */
    public Integer getOnOffStatus() {
        return onOffStatus;
    }

    /**
     * @param onOffStatus
     */
    public void setOnOffStatus(Integer onOffStatus) {
        this.onOffStatus = onOffStatus;
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
}