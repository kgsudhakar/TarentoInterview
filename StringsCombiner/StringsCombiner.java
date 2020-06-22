package StringsCombiner;

/**
 * Combines given three strings with equal length
 * P = P 1 P 2 P 3 P 4 P 5 … ……… ….. P (n-1) P n
 * Q = Q 1 Q 2 Q 3 Q 4 Q 5 … ……… ….. Q (n-1) Q n
 * R = R 1 R 2 R 3 R 4 R 5 … ……… ….. R (n-1) R n
 *
 * Where N is the length of the string.
 *
 * Combined string will be
 * S = P 1 Q 1 R 1 P 2 Q 2 R 2 … ……… ….. P (n-1) Q (n-1) R (n-1) P n Q n R n
 */
public class StringsCombiner {

    /**
     * Recursively adds the string obtained from the combination of characters at a particular index of each string
     *
     * @param str1 - Input String 1
     * @param str2 - Input String 2
     * @param str3 - Input String 3
     * @param currentIndex - Current Index to process
     * @return Combined String at the respective index
     */    
    public static String combineStrings(String str1, String str2, String str3, int currentIndex) {
        if (currentIndex < str1.length()) {
            String combinedStr = ""+str1.charAt(currentIndex) + str2.charAt(currentIndex) + str3.charAt(currentIndex) +
                    combineStrings(str1, str2, str3, currentIndex + 1);
            return combinedStr;
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "pqrs";
        String str3 = "wxyz";
        System.out.println(combineStrings(str1, str2, str3, 0));
    }
}
