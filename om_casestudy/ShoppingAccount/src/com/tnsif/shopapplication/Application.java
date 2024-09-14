package com.tnsif.shopapplication;

import com.tnsif.framework.ShopFactory;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.NormalAcc;

public class Application {

    public static void main(String[] args) {
        ShopFactory bank=new GSShopFactory();

        PrimeAcc p1=new GSPrimeAcc(20,"Piyush",2000.0f,true);
        p1.BookProduct(500.0f);
        System.out.println(p1);

        NormalAcc n1=new GSNormalAcc(21,"Sujal",1000.0f,50.0f);
        n1.Items(200.0f);
        System.out.println(n1);

    }

}
