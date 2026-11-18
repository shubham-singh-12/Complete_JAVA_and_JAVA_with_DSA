// ======================= JAVA IS STATICALLY TYPED =======================
// ================================= Code =================================
//public class Datatypes {
//    static void main(String[] args) {
//        double mockAccuracy = 84.5;         // ✅ VALID: type declared
//        actualAccuracy = 84.5;              // ❌ ERROR: if the variable was never declared with a type
//    }
//}


// ========================================================================
// =========================== REFERENCE TYPES ============================
// =========================== String (Example) ===========================
//public class Datatypes {
//    static void main(String[] args) {
//        String userName = "Shubham Singh";
//        System.out.println(userName);               // Shubham Singh
//    }
//}

// ========================================================================
// ================= PRIMITIVE DATA TYPES (INTEGER TYPES) =================
// ================================ Code  =================================
//public class Datatypes {
//    static void main(String[] args) {
//        byte num_1 = 100;               // byte range: -128 to 127
//        short num_2 = 500;              // short range: -32768 to 32767
//        int num_3 = 50000;              // int range:(-2^31 to (2^31 - 1))
//        long num_4 = 8100000000L;       // long range: (-2^63 to (2^63 - 1))
//
//        System.out.println(num_1);              // 100
//        System.out.println(num_2);              // 500
//        System.out.println(num_3);              // 50000
//        System.out.println(num_4);              // 8100000000
//    }
//}


// ========================================================================
// ============= PRIMITIVE DATA TYPES (FLOATING POINT TYPES) ==============
// ================================= Code =================================
//public class Datatypes {
//    static void main(String[] args) {
//        float num_5 = 3.14159f;
//        double num_6 = 3.141592653589793d;
//
//        System.out.println(num_5);          // 3.14159
//        System.out.println(num_6);          // 3.141592653589793
//    }
//}

// ========================================================================
// ==================== PRIMITIVE DATA TYPE (BOOLEAN) =====================
// ================================= Code =================================
//public class Datatypes {
//    static void main(String[] args) {
//        boolean eligibleToVote = true;
//
//        System.out.println(eligibleToVote);         // true
//    }
//}

// ============================== Error Case ==============================
//public class Datatypes {
//    static void main(String[] args) {
//        boolean eligibleToVote = 1;
//
//        System.out.println(eligibleToVote);         // java: incompatible types: int cannot be converted to boolean
//    }
//}


// ========================================================================
// ================= PRIMITIVE DATA TYPE (CHARACTER TYPE) =================
// ================================= Code =================================
//public class Datatypes {
//    static void main(String[] args) {
//        char userFirstCharacter = 's';                  // s char goes inside SINGLE quotes
//
//        System.out.println(userFirstCharacter);         // s
//    }
//}

// =========================== Unicode Example ============================
//public class Datatypes {
//    static void main(String[] args) {
//        char gradeLevel = 'A';
//        char symbol = '\u2606';         // Unicode for a star symbol
//
//        System.out.println(gradeLevel);         // A
//        System.out.println(symbol);             // ☆
//    }
//}

// =======================================================================
// =================== ADDING A NUMBER TO A CHARACTER ===================
// ================================ Code ================================
public class Datatypes {
    public static void main(String[] args) {
        char firstCharacter = 'a';

        System.out.println(firstCharacter + 2);             // 99
        System.out.println((char) (firstCharacter + 2));    // c
    }
}