package com.dandan.pojo;

import javax.persistence.*;

public class Category {
    @Id
    private Integer id;

    private String name;

    private Integer type;

    @Column(name = "father_id")
    private Integer fatherId;

    private String logo;

    private String slogan;

    @Column(name = "cat_image")
    private String catImage;

    @Column(name = "bg_color")
    private String bgColor;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return father_id
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * @param fatherId
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return slogan
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * @param slogan
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * @return cat_image
     */
    public String getCatImage() {
        return catImage;
    }

    /**
     * @param catImage
     */
    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    /**
     * @return bg_color
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * @param bgColor
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}