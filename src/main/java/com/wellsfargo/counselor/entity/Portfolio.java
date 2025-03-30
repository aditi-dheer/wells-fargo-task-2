package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @ManyToOne
    Client clientId;

    @Column(nullable = false)
    String creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Client getClientId() {
        return this.clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public String getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public long getPortfolioID() {
        return portfolioID;
    }

}
