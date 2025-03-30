package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    public long securityID;

    @ManyToOne
    public Portfolio portfolioId;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String category;

    @Column(nullable = false)
    public float purchasePrice;

    @Column(nullable = false)
    public String purchaseDate;

    @Column(nullable = false)
    public float quantity;

    protected Security() {

    }

    public Security(Portfolio portfolioId, String name, String category, float purchasePrice, String purchaseDate, float quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityID() {
        return securityID;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Portfolio newPortfolioId) {
        this.portfolioId = newPortfolioId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float newPurchasePrice) {
        this.purchasePrice = newPurchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String newPurchaseDate) {
        this.purchaseDate = newPurchaseDate;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float newQuantity) {
        this.quantity = newQuantity;
    }

}
