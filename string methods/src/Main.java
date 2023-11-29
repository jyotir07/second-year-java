//WAP in JAVA to demonstrate string handling to wrapper class handling
//Author: Jyotiraditya Singh
import java.lang.String;
import java.util.Random;
import java.io.UnsupportedEncodingException;


class myclass{

    //string generator function (chat_gpt)
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    //integer generator function
    public static int generateRandomInteger(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    //Function to reverse a string
    public static String reverseString(String input) {
        char[] stringArray = input.toCharArray();
        int left = 0;
        int right = stringArray.length - 1;

        // Reversing the string manually
        while (left < right) {
            char temp = stringArray[left];
            stringArray[left] = stringArray[right];
            stringArray[right] = temp;
            left++;
            right--;
        }

        return new String(stringArray);
    }

    public static void main(String[] args) {
        //gerating random strings then using encoding, reverse(), converting byte array into string
        String S4 = "lab experiment";
        System.out.println();
        System.out.println(S4.toUpperCase());
        int desiredLength = 7;
        //generating random integer
        String randomString = generateRandomString(desiredLength);
        int min = 1;
        int max = 700;
        int randonInteger = generateRandomInteger(min, max);
        System.out.println();
        System.out.println("-----Converting Integer to String-----");
        String tostr = Integer.toString(randonInteger);  //converting int to string
        System.out.println("String: " + tostr);
        System.out.println();
        System.out.println("-----Converting Integer to Float-----");
        float tofloat = randonInteger;  //converting into float
        System.out.println("Integer: " + randonInteger);
        System.out.println("Float: " + tofloat);
        double toDouble = randonInteger; //converting into double
        System.out.println("Double: " + toDouble);
        System.out.println();
        //Second Phase completed
        System.out.println("-----Reversing the String-----");
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(randomString);
        System.out.println("Original String: " + randomString);
        reversedString = reversedString.reverse();  //using string builder to reverse a string
        System.out.println("Using reversed: " + reversedString);
        String anotherMethod = reverseString(randomString);  //reversing using the reverseString function
        System.out.println("Without using reverse(): " + anotherMethod);
        System.out.println();

        //byte array to string conversion
        System.out.println("-----Converting Byte to String-----");
        byte[] byteArray = {12, 15, 17, 21, 23, 25, 30};
        try {
            // Convert byte array to string using utf-8 encoding
            String utf8String = new String(byteArray, "UTF-8");
            System.out.println("String using UTF-8: " + utf8String);

            // Convert byte array to string using utf-16 encoding
            String utf16String = new String(byteArray, "UTF-16");
            System.out.println("String using UTF-16: " + utf16String);

            // Convert byte array to string using ascii encoding
            String asciiString = new String(byteArray, "US-ASCII");
            System.out.println("String using ASCII: " + asciiString);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding Exception: " + e.getMessage());
        }

    }
}