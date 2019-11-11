package com.shavi.shoppoint.models;

import java.io.Serializable;


public class GenericProductModel implements Serializable {

    public int cardid;
    public String cardname;
    public String cardimage;
    public String carddiscription;
    public float cardprice;

    public GenericProductModel() {
    }


    public GenericProductModel(String carddiscription, int cardid, String cardimage, String cardname, float cardprice) {

        this.carddiscription = carddiscription;
        this.cardid = cardid;
        this.cardimage = cardimage;
        this.cardname = cardname;
        this.cardprice = cardprice;

    }


    public String getCarddiscription() {
        return carddiscription;
    }

    public void setCarddiscription(String carddiscription) {
        this.carddiscription = carddiscription;
    }

    public int getCardid() {
        return cardid;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
    }

    public String getCardimage() {
        return cardimage;
    }

    public void setCardimage(String cardimage) {
        this.cardimage = cardimage;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }


    public float getCardprice() {
        return cardprice;
    }

    public void setCardprice(float cardprice) {
        this.cardprice = cardprice;
    }


}