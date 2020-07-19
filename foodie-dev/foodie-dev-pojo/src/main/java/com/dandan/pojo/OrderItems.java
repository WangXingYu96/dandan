package com.dandan.pojo;

import javax.persistence.*;

@Table(name = "order_items")
public class OrderItems {
    @Id
    private Integer id;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_img")
    private String itemImg;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_spec_id")
    private String itemSpecId;

    @Column(name = "item_spec_name")
    private String itemSpecName;

    private Integer price;

    @Column(name = "buy_counts")
    private Integer buyCounts;

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
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * @return item_img
     */
    public String getItemImg() {
        return itemImg;
    }

    /**
     * @param itemImg
     */
    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
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
     * @return item_spec_name
     */
    public String getItemSpecName() {
        return itemSpecName;
    }

    /**
     * @param itemSpecName
     */
    public void setItemSpecName(String itemSpecName) {
        this.itemSpecName = itemSpecName;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return buy_counts
     */
    public Integer getBuyCounts() {
        return buyCounts;
    }

    /**
     * @param buyCounts
     */
    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }
}