package com.tnsif.shopapplication;

    import com.tnsif.framework.PrimeAcc;

    public class GSPrimeAcc extends PrimeAcc{

        private static final float deliveryCharges=0;

        public GSPrimeAcc(int accNo, String accNm, float Charges, boolean isPrime) {
            super(accNo, accNm, Charges, isPrime);
        }

        //withdraw-override
        public void BookProduct(float amount)
        {
            System.out.println("Booked Price of GS Prime product: " + amount + ". Delivery charges applied: " + getDeliveryCharges());
        }

        @Override
        public String toString() {
            return "GSPrimeAcc [toString()=" + super.toString() + "]";
        }

}
