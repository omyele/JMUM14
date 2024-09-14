package com.tnsif.framework;

    public class PrimeAcc extends ShopAcc{

        private boolean isPrime;
        private static final float deliveryCharges=0.0f;

        //constructor
        public PrimeAcc(int accNo, String accNm, float Charges, boolean isPrime) {
            super(accNo, accNm, Charges);
            this.isPrime = isPrime;
        }

        public boolean isPrime() {
            return isPrime;
        }

        public void setPrime(boolean isPrime) {
            this.isPrime = isPrime;
        }

        public static float getDeliveryCharges() {
            return deliveryCharges;
        }
        //withdraw-override
        public void BookProduct(float amount)
        {
            System.out.println("Prime Product with the Booked price is " + amount + ". No delivery charges applied.");
        }

        @Override
        public String toString() {
            return "SavingAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
                    + ", getAccBal()=" + getCharges() + "]";
        }

}
