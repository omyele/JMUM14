package com.tnsif.framework;

public abstract class ShopAcc {

        //data members
        private int accNo;
        private String accNm;
        private float Charges;

        //getter and setter
        public int getAccNo() {
            return accNo;
        }
        public void setAccNo(int accNo) {
            this.accNo = accNo;
        }
        public String getAccNm() {
            return accNm;
        }
        public void setAccNm(String accNm) {
            this.accNm = accNm;
        }
        public float getCharges() {
            return Charges;
        }
        public void setAccBal(float Charges) {
            this.Charges = Charges;
        }

        //constructor
        public ShopAcc(int accNo, String accNm, float Charges) {
            super();
            this.accNo = accNo;
            this.accNm = accNm;
            this.Charges = Charges;
        }


        public void BookProduct(float Price)
        {
            System.out.println("BookProduct price is "+ (Charges-1000.0));
        }


        public void Items(float quantity)
        {
            System.out.println("Items is "+(Charges+quantity));
        }

        @Override
        public String toString() {
            return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", Charges=" + Charges + "]";
        }






    }

