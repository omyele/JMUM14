package com.tnsif.framework;

public class NormalAcc extends ShopAcc {

    private final float deliveryCharges;

    //constructor
    public NormalAcc(int accNo, String accNm, float Charges, float deliveryCharges) {
        super(accNo, accNm, Charges);
        this.deliveryCharges = deliveryCharges;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }

    public void bookProduct(float price)
    {
        System.out.println("Normal Product with the Booked price "+(this.getCharges()+price));
    }

    @Override
    public String toString() {
        return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
                + ", getCharges()=" + getCharges() + "]";
    }



}