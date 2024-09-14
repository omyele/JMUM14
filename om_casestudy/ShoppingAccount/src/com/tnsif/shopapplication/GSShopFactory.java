package com.tnsif.shopapplication;

    import com.tnsif.framework.ShopFactory;
    import com.tnsif.framework.NormalAcc;
    import com.tnsif.framework.PrimeAcc;

    public class GSShopFactory implements ShopFactory {

        @Override
        public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float Charges, boolean isPrime) {
            PrimeAcc p1=new PrimeAcc(accNo,accNm,Charges,isPrime);
            return p1;
        }

        @Override
        public NormalAcc getNewNormalAccount(int accNo, String accNm, float Charges, float deliveryCharges) {
            NormalAcc n1=new NormalAcc(accNo,accNm,Charges,deliveryCharges);
            return n1;
        }

    }

