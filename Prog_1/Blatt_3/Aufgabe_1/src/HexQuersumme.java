public class HexQuersumme {
    static final char[] hexValue = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; // index = hexadecimal value

    // returns digit sum of a decimal integer
    public static int getDigitSum(int i){
        int digitSum = 0;
        while (i != 0){
            digitSum += i%10;
            i /= 10;
        }
        return digitSum;
    }

    // Turns a decimal integer to hexadecimal String
    public static String toHex(int x){
        String mirrorHex = "";
        String hex = "";
        // creates a string hexadecimal in reverse order (16^0 -> 16^n)
        while(x != 0){
            mirrorHex += hexValue[x%16];
            x /= 16;
        }
        // reverses mirrorhex and writes it to hex
        for (int j = mirrorHex.length()-1; j >= 0; j--){
            hex += mirrorHex.charAt(j);
        }

        return hex;
    }

    // returns digit sum of a string hexadecimal number as string hexadecimal number
    public static String getHexDigitSum(String x){
        int decimalDigitSum = 0;
        // calculates the decimal value of the digit sum of x
        for (int i = 0; i < x.length(); i++){
            for (int j = 0; j < 16; j++){
                if (x.charAt(i) == hexValue[j]) {
                    decimalDigitSum += j;
                    continue;
                }
            }
        }

       return toHex(decimalDigitSum);
    }

}
