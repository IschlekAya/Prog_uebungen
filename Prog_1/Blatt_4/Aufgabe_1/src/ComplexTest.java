public class ComplexTest {
    public static void main(String[] args) {
        Complex testComplex = new Complex(3.0, -4.0);
        Complex otherComplex = new Complex (-6.0, 8.0);
        Complex emptyComplex = new Complex();
        Complex expectedComplex;            // Variable for the expected result of a calculation, refer to the .pdf file containing the results
        Complex result;                     // Variable for the program's result of a calculation

        /*

        // view all complex numbers
        System.out.println("testComplex:");
        testComplex.print();
        System.out.println("otherComplex:");
        otherComplex.print();
        System.out.println("emptyComplex:");
        emptyComplex.print();

         */

        System.out.print("Addition of (" + testComplex + ") and (" + otherComplex + "): ");     // Erkenntnis: wendet die toString()-Methode automatisch an
        result = testComplex.add(otherComplex);
        expectedComplex = new Complex(-3.0, 4.0);
        result.comparison(expectedComplex);

        System.out.print("Subtraction of (" + testComplex + ") and (" + otherComplex + "): ");
        result = testComplex.sub(otherComplex);
        expectedComplex = new Complex(9.0, -12.0);
        result.comparison(expectedComplex);

        System.out.print("Multiplication of (" + testComplex + ") and (" + otherComplex + "): ");
        result = testComplex.mul(otherComplex);
        expectedComplex = new Complex(14.0, 48.0);
        result.comparison(expectedComplex);

        System.out.print("Division of (" + testComplex + ") by (" + otherComplex + "): ");
        result = testComplex.div(otherComplex);
        expectedComplex = new Complex(-0.5, 0.0);
        result.comparison(expectedComplex);

    }

}
