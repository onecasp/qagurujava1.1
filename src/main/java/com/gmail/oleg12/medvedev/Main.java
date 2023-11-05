package com.gmail.oleg12.medvedev;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //byte
        byte aByte = (byte) 100;   //-128 ... 127
        byte bByte = (byte) 26;
        byte cByte = (byte) 30;

        System.out.println("Byte:");
        System.out.println("range: -128 to 127");
        System.out.println("byte + byte (inbound) = " + (bByte + aByte));
        System.out.println("byte + byte (outbound) = " + (cByte + aByte));

        //short
        short aShort = 100; // -32768... 32767
        short bShort = 3214;
        short cShort = 32700;

        System.out.println("\n short:");
        System.out.println("range: -32768 to 32767");
        System.out.println("short + short (inbound) = " + (bShort + aShort));
        System.out.println("short + short (outbound) = " + (cShort + aShort));

        System.out.println("byte + short:");
        System.out.println("byte + short = " + (bShort + bByte));

        // Целочисленные типы данных
        int aInt = 100; //-2147483648 to 2147483647 // 32bits
        int bInt = 231242;
        int cInt = 2147483637;

        System.out.println("\n integer:");
        System.out.println("range: -2147483648 to 2147483647");
        System.out.println("int + int (inbound) = " + (bInt + aInt));
        System.out.println("int + int (outbound) = " + (cInt + bInt));

        System.out.println("int + byte/short:");
        System.out.println("int + short = " + (bShort + bInt));
        System.out.println("int + byte = " + (bByte + bInt));

        long aLong = 100L; //-9223372036854775808 to 9223372036854775807 // 64bits
        long bLong = 32131L;
        long cLong = 9223372036854775707L;

        System.out.println("\n long:");
        System.out.println("range: -9223372036854775808 to 9223372036854775807");
        System.out.println("long + long (inbound) = " + (bLong + aLong));
        System.out.println("long + long (outbound) = " + (cLong + bLong));

        System.out.println("long + byte/short/int:");
        System.out.println("long + byte = " + (bLong + bByte));
        System.out.println("long + short = " + (bLong + bShort));
        System.out.println("long + int = " + (bLong + bInt));

        // Типы данных с плавающей точкой
        float aFloat = 1.1f; //1.40239846e-45f to 3.40282347e+38f
        float bFloat = 124125412.214e30f;
        float cFloat = 3.30282347e+38f;

        System.out.println("\nfloat:");
        System.out.println("range: 1.40239846e-45f to 3.40282347e+38f");
        System.out.println("float + float (inbound) = " + (bFloat + aFloat));
        System.out.println("float + float (outbound) = " + (cFloat + bFloat));

        System.out.println("float + byte/short/int/long:");
        System.out.println("float + byte = " + (bFloat + bByte));
        System.out.println("float + short = " + (bFloat + bShort));
        System.out.println("float + int = " + (bFloat + bInt));
        System.out.println("float + long = " + (bFloat + bLong));

        double aDouble = 1.2d; //4.94065645841246544e-324 to 1.79769313486231570e+308
        double bDouble = 1.19769313486231570e+308d;
        double cDouble = 1.79769313486231570e+308d;

        System.out.println("\ndouble:");
        System.out.println("range: 4.94065645841246544e-324 to 1.79769313486231570e+308");
        System.out.println("double + double (inbound) = " + (bDouble + aDouble));
        System.out.println("double + double (outbound) = " + (cDouble + bDouble));

        System.out.println("double + byte/short/int/long:");
        System.out.println("double + byte = " + (bDouble + bByte));
        System.out.println("double + short = " + (bDouble + bShort));
        System.out.println("double + int = " + (bDouble + bInt));
        System.out.println("double + long = " + (bDouble + bLong));
        System.out.println("double + float = " + (bDouble + bLong));

        // Символьный
        char qChar = '\u0071';
        char aChar = '\u0061';
        char gChar = '\u0067';
        char uChar = '\u0075';
        char rChar = '\u0072';
        char bsChar = '\u00A0';
        char tChar = '\u0074';
        char oChar = '\u006F';
        char pChar = '\u0070';
        char asChar = '\u0021';

        System.out.println("\nchar:");
        System.out.println(
            "char + char = " + qChar + aChar + gChar + uChar + rChar + uChar + bsChar + tChar
                + oChar + pChar + asChar);

        // Логический
        boolean aBoolean = false;
        boolean bBoolean = true;

        System.out.println("\nboolean:");
        System.out.println("boolean :" + aBoolean + bBoolean);

        // Операторы

        System.out.println("\nactions: +");
        System.out.println("see above");

        System.out.println("\nactions: -");
        System.out.println("int - float: 231242 - 1.1f = " + (bInt - aFloat));

        System.out.println("\nactions: *");
        System.out.println("long * short: 100L * 3214 = " + (aLong * bShort));

        System.out.println("\nactions: /");
        System.out.println("double / byte: 1.2d / 26 = " + (aDouble / bByte));

        System.out.println("\nactions: %");
        System.out.println("int / int: 231242 / 100 = " + (bInt % aInt));

        // Логические операторы < > <= >= == !=
        int temperature = 20;
        boolean wind = true;

        if (-10 <= temperature && temperature < 0) {
            System.out.println("The weather is ok, but cold");
        } else if (0 < temperature && temperature <= 10) {
            System.out.println("The weather is ok, and warm");
        } else if (temperature < -10) {
            System.out.println("It is so cold!");
        } else if (temperature > 10 && temperature < 25) {
            System.out.println("It is comfort!");
        } else if (temperature == 0) {
            System.out.println("It is zero!");
        } else if (temperature >= 25) {
            System.out.println("It is hot!");
        }

        String light = "Yellow";

        if (light.equals("Red") || light.equals("Yellow")) {
            System.out.println("Please wait for green light!");
        } else {
            System.out.println("Let's go!");
        }

        System.out.println("\nInt and double:");
        System.out.println("Int - double: 231242 - 1.2d = " + (bInt - aDouble));
        System.out.println("Int * double: 231242 * 1.2d = " + (bInt * aDouble));
        System.out.println("Int / double: 231242 / 1.2d = " + (bInt / aDouble));
        System.out.println("Int % double: 231242 % 1.2d = " + (bInt % aDouble));
    }
}