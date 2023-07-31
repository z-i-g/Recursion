public class StringPalindromeCheckingService {
    public static boolean execute(String checkedString) {
        if (checkedString == null)
            return false;
        if (checkedString.length() == 1 || checkedString.length() == 0)
            return true;
        boolean isFirstCharEqualsLast = checkedString.charAt(0) == checkedString.charAt(checkedString.length() - 1);
        return isFirstCharEqualsLast && (checkedString.length() <= 3 || execute(checkedString.substring(1, checkedString.length() - 1)));
    }
}