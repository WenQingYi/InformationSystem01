package com.itheima.domain;

public class Category {
    private Integer categoryID;
    private String categoryName;
    public Category() {
        super();
    }

    public Category(Integer categoryID, String categoryName) {
        super();
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
