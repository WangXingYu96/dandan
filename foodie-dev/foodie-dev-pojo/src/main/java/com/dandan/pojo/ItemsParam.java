package com.dandan.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "items_param")
public class ItemsParam {
    @Id
    private Integer id;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "produc_place")
    private String producPlace;

    @Column(name = "foot_period")
    private String footPeriod;

    private String brand;

    @Column(name = "factory_name")
    private String factoryName;

    @Column(name = "factory_address")
    private String factoryAddress;

    @Column(name = "packaging_method")
    private String packagingMethod;

    private String weight;

    @Column(name = "storage_method")
    private String storageMethod;

    @Column(name = "eat_method")
    private String eatMethod;

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
     * @return produc_place
     */
    public String getProducPlace() {
        return producPlace;
    }

    /**
     * @param producPlace
     */
    public void setProducPlace(String producPlace) {
        this.producPlace = producPlace;
    }

    /**
     * @return foot_period
     */
    public String getFootPeriod() {
        return footPeriod;
    }

    /**
     * @param footPeriod
     */
    public void setFootPeriod(String footPeriod) {
        this.footPeriod = footPeriod;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return factory_name
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * @param factoryName
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    /**
     * @return factory_address
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * @param factoryAddress
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    /**
     * @return packaging_method
     */
    public String getPackagingMethod() {
        return packagingMethod;
    }

    /**
     * @param packagingMethod
     */
    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    /**
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return storage_method
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * @param storageMethod
     */
    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    /**
     * @return eat_method
     */
    public String getEatMethod() {
        return eatMethod;
    }

    /**
     * @param eatMethod
     */
    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod;
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