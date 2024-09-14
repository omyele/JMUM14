package com.tnsif.framework;

public interface ShopFactory {

        PrimeAcc getNewPrimeAccount(int accNo,String accNm,float accBal,boolean isPrime);

        NormalAcc getNewNormalAccount(int accNo,String accNm,float accBal,float deliveryCharges);

    }

