// public class datatypes {
//     public static void main(String[] args) {

//         // ================ INTEGERS DATA TYPES ================
//         // ============== BYTE, SHORT, INT, LONG ===============
//         // ======================= Code ========================
//         byte byteNumber = 5;
//         System.out.println(byteNumber);                 // 5

//         short shortNumber = 10;
//         System.out.println(shortNumber);                // 10

//         int integerNumber = 4000;
//         System.out.println(integerNumber);              // 4000

//         long longNumber = 10000L;
//         System.out.println(longNumber);                 // 10000

//         // =====================================================
//         // ============== FLOATING POINT DATA TYPE =============
//         // ======================= FLOAT =======================
//         // ======================= Code ========================
//         float floatNumber = 10.54F;
//         System.out.println(floatNumber);                // 10.54

//         double doubleNumber = 23.0987D;
//         System.out.println(doubleNumber);               // 23.0987

//         // =====================================================
//         // ================ CHARACTER DATA TYPE ================
//         // ======================== CHAR =======================
//         // ======================= Code ========================
//         char myCharacter = 'a';
//         System.out.println(myCharacter);                // a

//         // =====================================================
//         // ================= BOOLEAN DATA TYPE =================
//         // ====================== BOOLEAN ======================
//         // ======================= Code ========================
//         boolean myBoolean = false;
//         System.out.println(myBoolean);                  // false
//     }
// }



// ==============================================================
// =============== ALTERNATE WAYS TO WRITE VALUES ===============
// ============================ Code ============================
// public class datatypes {
//     public static void main(String[] args) {
//         // Binary Representation of 5
//         byte n1 = 0b101;
//         System.out.println(n1);                 // 5

//         // Octal Representation of 5
//         byte n2 = 05;
//         System.out.println(n2);                 // 5

//         // Hexadecial Representation of 5
//         byte n3 = 0x5;
//         System.out.println(n3);                 // 5

//         // Hexadecimal Representation of 10
//         byte n4 = 0xA;
//         System.out.println(n4);                 // 10

//         // Hexadecimal Representation of 15
//         byte n5 = 0xF;
//         System.out.println(n5);                 // 15
//     }
// }



// ==============================================================
// =============== SCIENTIFIC NOTATION FOR double ===============
// ============================ Code ============================
// public class datatypes {
//     public static void main(String[] args) {
//         double myDoubleNumber = 6.022e23;
//         System.out.println(myDoubleNumber);         // 6.022E23
//     }
// }



// ==============================================================
// ================= UNDERSCORE IN LARGE NUMBER =================
// ============================ Code ============================
// public class datatypes {
//     public static void main(String[] args) {
//         // Indian Style: 12 crore 34 lakh 56 thousands 7 hundred eightynine
//         long bigNumber = 12_34_56_789L;
//         System.out.println(bigNumber);              // 123456789
//     }
// }



// ==============================================================
// ====================== COMMON MISTAKES =======================
// ============================ Code ============================
public class datatypes {
    public static void main(String[] args) {
        // ================== Common Mistakes ===================
        float firstNumber = 10._54f;
        float secondNumber = 10_.54f;
        System.out.println(firstNumber);
        System.out.println(secondNumber);


        double firstDouble = 6.022_e23;
        double secondDouble = 6.022e_23;
        System.out.println(firstDouble);
        System.out.println(secondDouble);
    }
}