public class Sum {
    public static int execute(Integer number) {
        String stringRepresentation = number.toString();
        if (stringRepresentation.length() == 1)
            return number;
        Integer truncatedNumber = Integer.parseInt(stringRepresentation.substring(0, stringRepresentation.length() - 1));
        int lastDigit = Integer.parseInt(stringRepresentation.substring(stringRepresentation.length() - 1));
        return lastDigit + execute(truncatedNumber);
    }
}