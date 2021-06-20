package Practice;

//import sun.security.util.Password;
//
///**
// * 7.  Write a return method that can verify if a password is valid or not.
// *               requirements:
// *              1. Password MUST be at least have 6 characters and should not contain space
// *              2. PassWord should at least contain one upper case letter
// *              3. PassWord should at least contain one lowercase letter
// *              4. Password should at least contain one special characters
// *              5. Password should at least contain a digit
// *  if all requirements above are met, the method returns true, otherwise returns  false
// */
//public class ValidPassword {
//    public static boolean password(String password) {
//        // 1. Password MUST be at least have 6 characters and should not contain space
//        if (password.length() < 6) {
//            return true;
//        }
//        // 2. PassWord should at least contain one upper case letter
//        for (int i = 0; i < password.length(); i++) {
//            Character each = password.charAt(i);
//
//        }
//
//
//        //should not contain space
//        if (password.contains(" ")) {
//            return false;
//        }
//
//        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
//        String specialChars = "(!"#$ % & '()*+,-./:;<=>?@[\]^_`{|}~");
//        String digits = "1234567890";
//
//
//        //PassWord should at least contain one upper case letter
//        int count = 0;
//        for (int i = 0; i < password.length(); i++) {
//
//            if (upperCase.contains("" + password.charAt(i))) {
//                count++;
//            }
//
//        }
//        if (!(count >= 1)) {
//            return false;
//        }
//
//        count = 0;
//        //3. PassWord should at least contain one lowercase letter
//        for (int i = 0; i < password.length(); i++) {
//
//            if (lowerCase.contains("" + password.charAt(i))) {
//                count++;
//            }
//
//        }
//        if (!(count >= 1)) {
//            return false;
//        }
//
//
//        count = 0;
//        //4. Password should at least contain one special characters
//        for (int i = 0; i < password.length(); i++) {
//
//            if (specialChars.contains("" + password.charAt(i))) {
//                count++;
//            }
//        }
//        if (!(count >= 1)) {
//            return false;
//        }
//
//
//        count = 0;
//        // 5. Password should at least contain a digit
//        for (int i = 0; i < password.length(); i++) {
//
//            if (digits.contains("" + password.charAt(i))) {
//                count++;
//            }
//
//        }
//        if (!(count >= 1)) {
//            return false;
//        }
//
//        return true;
//    }
//}
