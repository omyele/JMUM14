package com.tnsif.shopapplication;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

    public GSNormalAcc(int accNo, String accNm, float Charges, float deliveryCharges) {
        super(accNo, accNm, Charges, deliveryCharges);

    }

    public void Items(float amount)
    {
        System.out.println("Booked Price of GS Normal product: " + amount + ". Delivery charges applied: " + getDeliveryCharges());
    }

    @Override
    public String toString() {
        return "GSNormalAcc [toString()=" + super.toString() + "]";
    }



}
