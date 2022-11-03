package exam;

public class Complex {
    private double re;
    private double im;

    public void Init(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(){
        Init(0,0);
    }

    public Complex(double re, double im){
        Init(re, im);
    }

    public Complex(double re){
        Init(re,0);
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public static Complex add(Complex a,Complex b){
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real,imag);
    }

    public static Complex subtract(Complex a,Complex b){
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real,imag);
    }

    public static Complex multiply(Complex a,Complex b){
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real,imag);
    }

    public static Complex divide(Complex a,Complex b){
        double _re = b.getRe();
        double _im = b.getIm();
        double scale = _re*_re + _im*-_im;
        return multiply(a, new Complex(_re / scale, -_im / scale));
    }

    public String toString() {
        String ifMinusImaginaryPart = getIm() < 0 ? " - " : " + " ;
        return "Complete process. Result is: " + getRe() + ifMinusImaginaryPart + Math.abs(getIm()) + "i";
    }
}
