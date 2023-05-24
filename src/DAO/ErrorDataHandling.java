/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hoant
 */
public class ErrorDataHandling {
        public static boolean isNumeric(String str) {
	return str.matches("-?\\d+(\\.\\d+)?");
}
        public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        public static boolean isEmail(String emailStr) {
                Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
                return matcher.matches();
        }


        public static boolean isDate(String str){
           if(str.matches("\\d{4}-\\d{2}-\\d{2}"))
               return true;
           if(str.matches("\\d{4}/\\d{2}/\\d{2}"))
               return true;
           return false;
        }
        
        
        // digit + lowercase char + uppercase char + punctuation + symbol
         private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

        private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

        public static boolean isPassword(final String password) {
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
}
