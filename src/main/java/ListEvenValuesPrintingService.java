import java.util.List;

public class ListEvenValuesPrintingService {

    public static void execute(List<Integer> list) {
        executeRecursively(list, 0);
    }

    private static void executeRecursively(List<Integer> list, int startIndex) {
        if (list == null || list.isEmpty())
            return;
        if (list.size() <= startIndex)
            return;
        if (list.get(startIndex) % 2 == 0)
            System.out.print(list.get(startIndex) + " ");
        startIndex++;
        executeRecursively(list, startIndex);
    }
}