package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;
    @Column(nullable = false)
    private int creationDate;

    @OneToOne(mappedBy = "portfolio")
    private Client client;

    // constructors
    protected Portfolio() {
    }

    public Portfolio(int creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    // getters and setters
    public Long getPortfolioId() {
        return portfolioId;
    }
    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

