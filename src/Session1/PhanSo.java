package Session1;

public class PhanSo {
        int tuSo;
         int mauSo;

         public PhanSo() {
             tuSo = 0;
             mauSo = 1;
         }
         public PhanSo(int tu, int mau) {
             super();
             this.tuSo = tu;
             this.mauSo = mau;
    }

        public int getTuSo() {
            return tuSo;
        }

        public void setTuSo(int tuSo) {
            this.tuSo = tuSo;
        }

        public int getMauSo() {
            if (mauSo == 0) {
                return tuSo;
            } else {
                return mauSo;
            }
        }


        public void setMauSo(int mauSo) {
            if (mauSo == 0) {
                this.mauSo = tuSo;
            } else {
                this.mauSo = mauSo;
            }
        }
        //Ham hien thi 2 phan so
        public void hienthi() {
            if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
            } else {
                System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
            }
        }
        //Ham nghich dao 2 phan so
        public void nghichdao() {
            int tg = tuSo;
            tuSo = mauSo;
            mauSo = tg;
         }
         //Ham rut gon 2 phan so
         public void rutgon() {
             int a = tuSo;
             int b = mauSo;
             int r = a % b;
             while (r != 0) {
                 a = b;
                 b = r;
                 r = a % b;
             }
             tuSo /= b;
             mauSo /= b;
         }
         //Ham cong 2 phan so
         public PhanSo add(PhanSo ps2) {
             int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
             int ms = mauSo * ps2.mauSo;
             return new PhanSo(ts, ms);
         }
         //Ham tru 2 phan so
         public PhanSo sub(PhanSo ps2) {
             int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
             int ms = mauSo * ps2.mauSo;
             return new PhanSo(ts, ms);
         }
         // Ham nhan 2 phan so
         public PhanSo mul(PhanSo ps2) {
             int ts = tuSo * ps2.tuSo;
             int ms = mauSo * ps2.mauSo;
             return new PhanSo(ts, ms);
         }
         // Chia 2 phan so
         public PhanSo div(PhanSo ps2) {
             int tg = ps2.tuSo;
             ps2.tuSo = ps2.mauSo;
             ps2.mauSo = tg;

             int ts = tuSo * ps2.tuSo;
             int ms = mauSo * ps2.mauSo;
             return new PhanSo(ts, ms);
         }
}
