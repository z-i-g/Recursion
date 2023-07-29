import java.util.List;

public class ListLength {
    public static int execute(List<?> calculatedList) {
        if (calculatedList == null || calculatedList.size() == 0)
            return 0;
        calculatedList.remove(0);
        return execute(calculatedList) + 1;
    }
}