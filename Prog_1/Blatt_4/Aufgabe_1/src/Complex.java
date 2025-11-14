// class to create complex numbers
public class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {}

    // adds two complex numbers
    public Complex add(Complex other){
        double realResult = this.real + other.real;
        double imaginaryResult = this.imaginary + other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }

    // subtracts two complex numbers
    public Complex sub(Complex other){
        double realResult = this.real - other.real;
        double imaginaryResult = this.imaginary - other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }

    // multiples two complex numbers
    public Complex mul(Complex other){
        double realResult = this.real*other.real - this.imaginary*other.imaginary;
        double imaginaryResult = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realResult, imaginaryResult);
    }

    // divides called complex number by another complex number
    public Complex div(Complex other){
        double realNumerator = this.real*other.real + this.imaginary*other.imaginary;
        double realDenominator = other.real * other.real + other.imaginary * other.imaginary;
        double realResult = realNumerator / realDenominator;

        double imaginaryNumerator = this.imaginary * other.real - this.real * other.imaginary;
        double imaginaryDenominator = other.real * other.real + other.imaginary * other.imaginary;
        double imaginaryResult = imaginaryNumerator / imaginaryDenominator;

        return new Complex(realResult, imaginaryResult);
    }

    // returns a string representation of a complex number
    public String toString(){
        String name = "";
        name += String.valueOf(this.real);
        if (this.imaginary == 0.0) return name; // if imaginary == 0.0, don't even bother adding it
        if(this.imaginary >= 0.0) name += "+";
        name += String.valueOf(this.imaginary) + "i";
        return name;
    }

    // checks if two complex numbers are equal
    public boolean equals(Complex other){
        if (Math.abs(this.real - other.real) >= 1e-12) return false;
        return !(Math.abs(this.imaginary - other.imaginary) >= 1e-12);
    }

    // prints values of a complex
    void print(){
        System.out.println("Real number = " + this.real);
        System.out.println("Imaginary number = " + this.imaginary);
        System.out.println("Resulting complex number: " + this.toString() + "\n");
    }

    // compares given complex to complex expectedValue
    void comparison(Complex expectedComplex) {
        if (this.equals(expectedComplex)) {
            System.out.println("result is (" + this + "). Ok\n");
            return;
        }
        System.out.println("FAILED: expected (" + expectedComplex + "), got (" + this + ")\n");
    }

    /*
    // compares given complex to complex expectedValue
    void comparison(Complex expectedValue){
        System.out.println("Calculated real number = " + this.real);
        System.out.println("Calculated imaginary number = " + this.imaginary);
        System.out.println("Expected real number = " + expectedValue.real);
        System.out.println("Expected imaginary number = " + expectedValue.imaginary);
        System.out.println("Calculated complex number equals expected complex number: " + this.equals(expectedValue) + "\n");
    }

     */
}
