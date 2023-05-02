package com.company.atm.model;

public class Card {
    private Integer cardId;
    private Integer pinCode;
    private String expDate;
    private Double balance;
    private String ownDate;

    public Card() {
    }

    public Card(Integer cardId, Integer pinCode, String expDate, Double balance, String ownDate) {
        this.cardId = cardId;
        this.pinCode = pinCode;
        this.expDate = expDate;
        this.balance = balance;
        this.ownDate = ownDate;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getOwnDate() {
        return ownDate;
    }

    public void setOwnDate(String ownDate) {
        this.ownDate = ownDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", pinCode=" + pinCode +
                ", expDate='" + expDate + '\'' +
                ", balance=" + balance +
                ", ownDate='" + ownDate + '\'' +
                '}';
    }
}
