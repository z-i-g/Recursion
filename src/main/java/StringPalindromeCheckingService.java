public class StringPalindromeCheckingService {
    public static boolean execute(String checkedString) {
        if (checkedString == null)
            return false;
        if (checkedString.length() == 1 || checkedString.length() == 0)
            return true;
        if (checkedString.charAt(0) != checkedString.charAt(checkedString.length() - 1))
            return false;
        if (checkedString.length() <= 3 )
            return true;
        checkedString = checkedString.substring(1, checkedString.length() - 1);
        return execute(checkedString);
    }
}