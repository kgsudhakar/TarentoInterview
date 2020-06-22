package StringsCombiner;

public class StringsCombiner {

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
