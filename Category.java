package com.mainServer.Model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "subcategory")
    private String subcategory;

    public Category(String categoryName, String subcategory) {
        this.categoryName = categoryName;
        this.subcategory = subcategory;
    }

    private Category() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
}
