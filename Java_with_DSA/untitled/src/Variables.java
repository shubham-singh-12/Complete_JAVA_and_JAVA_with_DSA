// ======================== CREATING A VARIABLE =========================
// =============================== Syntax ===============================
// dataType variableName = value;

// ============================== Example ===============================
// int userAge = 5;

// ======================================================================
// ======================== CREATING A VARIABLE =========================
// ============================== Example ===============================
//public class Variables {
//    public static void main(String[] args) {
//        int userAge = 5;
//        System.out.println(userAge);                    // 5
//    }
//}

// =========================== More Examples =============================
//public class Variables {
//    static void main(String[] args) {
//        int problemSolved = 120;
//        double completionRate;              // DECLARATION
//        completionRate = 87.5;              // ASSIGNMENT LATER
//        boolean isPremiumMember = true;     // DECLARATION + ASSIGNMENT TOGETHER
//    }
//}

// =========================================================================
// ==================== DECLARATION & INITIALIZATION =====================
// ============================ DECLARATION ==============================
// =============================== Syntax ================================
//public class Variables {
//    static void main(String[] args) {
//        int age;
//    }
//}

// =========================================================================
// ================== USING A VARIABLE WITHOUT A VALUE ===================
// ================================ Code =================================
//public class Variables {
//    static void main(String[] args) {
//        int age;                        // DECLARED, but no value assigned
//        System.out.println(age);        // ERROR: variable age might not have been initialized
//    }
//}

// =========================================================================
// ====================== DECLARATION + ASSIGNMENT =======================
// ================================ Code =================================
//public class Variables {
//    static void main(String[] args) {
//        int userAge;                        // Declaration
//        userAge = 10;                       // Assignment
//        System.out.println(userAge);        // 10
//    }
//}

// =========================================================================
// =========================== INITIALIZATION ============================
// ================================ Code =================================
//public class Variables {
//    static void main(String[] args) {
//        int totalMarks = 20;                // Declaration + Initialization
//        System.out.println(totalMarks);     // 20
//    }
//}

// ========================================================================
// =================== UPDATING (CHANGING) THE VALUE ====================
// ================================ Code ================================
//public class Variables {
//    public static void main(String[] args) {
//        int age = 10;                   // age created with value 10
//        age = 18;                       // value replaced with 18
//        System.out.println(age);        // 18
//    }
//}

// ========================================================================
// ====================== JAVA IS STATICALLY TYPED ======================
//public class Variables {
//    public static void main(String[] args) {
//        int totalContests = 15;                 // ✅ VALID: type declared
//        userAge = 15;                           // ❌ ERROR:
//
//        System.out.println(totalContests);      // 15
//        System.out.println(userAge);            // ERROR
//    }
//}

// =======================================================================
// ========================= TYPE CANNOT CHANGE ==========================
//public class Variables {
//    public static void main(String[] args) {
//        int streak = 30;
//        double streak = 30.5;           // variable streak is already defined
//
//        System.out.println(streak);
//    }
//}

// =======================================================================
// ========================== CASE SENSITIVITY ===========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int weight = 80;
//        int Weight = 90;
//
//        System.out.println(weight);                 // 80
//        System.out.println(Weight);                 // 90
//    }
//}

// =======================================================================
// ========================= STARTING CHARACTER ==========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int height = 1;                 // LOWERCASE start
//        int Height = 2;                 // UPPERCASE start
//        int _height = 3;                // UNDERSCORE start
//        int $height = 4;                // DOLLAR start
//
//        System.out.println(height);             // 1
//        System.out.println(Height);             // 2
//        System.out.println(_height);            // 3
//        System.out.println($height);            // 4
//    }
//}

// =======================================================================
// ======================== SUBSEQUENT CHARACTERS ========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int marks1 = 10;                // Digit at the end
//        int total_marks = 20;           // underscore in the middle
//        int price$ = 30;                // dollar at the end
//        int my_$value1 = 40;            // underscore, dollar and digit mixed.
//
//        System.out.println(marks1);         // 10
//        System.out.println(total_marks);    // 20
//        System.out.println(price$);         // 30
//        System.out.println(my_$value1);     // 40
//    }
//}

// =======================================================================
// ======================== NO RESERVED KEYWORDS =========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int age = 5;            // ✅ OK
//        int class = 5;          // ❌ ERROR: 'class' is a reserved keyword
//
//        System.out.println(age);
//        System.out.println(class);
//    }
//}

// =======================================================================
// ====================== LENGTH OF A VARIABLE NAME ======================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int height = 170;                       // meaningful
//        int weight = 65;                        // meaningful
//        int numberOfStudentsPassed = 50;        // meaningful
//

/// /        works, but tells nothing about its purpose
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        System.out.println(height);                     // 170
//        System.out.println(weight);                     // 65
//        System.out.println(numberOfStudentsPassed);     // 50
//    }
//}

// =======================================================================
// ====================== CONSTANTS: USE UPPERCASE =======================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int DAYS_IN_YEAR = 365;     // convention: constants in ALL CAPS
//        int daysInYear = 365;       // also works, but not the convention
//
//        System.out.println(DAYS_IN_YEAR);       // 365
//        System.out.println(daysInYear);         // 365
//    }
//}

// =======================================================================
// ============================= CAMEL CASE ==============================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int totalMarks = 20;                // camel case
//        int daysInAYear = 365;              // camel case
//
//        System.out.println(totalMarks);     // 20
//        System.out.println(daysInAYear);    // 365
//    }
//}

// =======================================================================
// ============================== LITERALS ===============================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        int activeUsers = 500;
//    }
//}

// =======================================================================
// ======================= FLOATING POINT LITERALS =======================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        double averageScore = 78.6;
//        float discountPercent = 15.5F;
//    }
//}

// =======================================================================
// ========================= SCIENTIFIC NOTATION =========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        double serverLoad = 2.5e3;              // 2.5 * 10^3 = 2500
//
//        System.out.println(serverLoad);         // 2500.0
//    }
//}

// =======================================================================
// ========================= CHARACTER LITERALS ==========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        char grade = 'A';
//        char newLine = '\n';
//        char tabSpace = '\t';
//
//        System.out.println(grade);          // A
//        System.out.println(newLine);
//        System.out.println(tabSpace);
//    }
//}

// =======================================================================
// =========================== STRING LITERALS ===========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        String platformNames = "CodingInJava";
//        String courseTrack = "DSA + Core + Aptitude";
//
//        System.out.println(platformNames);      // CodingInJava
//        System.out.println(courseTrack);        // DSA + Core + Aptitude
//    }
//}

// =======================================================================
// ========================== BOOLEAN LITERALS ===========================
// ================================ Code =================================
//public class Variables {
//    public static void main(String[] args) {
//        boolean isLoggedIn = true;
//        boolean hasCompletedSheet = false;
//
//        System.out.println(isLoggedIn);             // true
//        System.out.println(hasCompletedSheet);      // false
//    }
//}