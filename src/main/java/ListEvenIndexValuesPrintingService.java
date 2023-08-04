import java.util.List;

public class ListEvenIndexValuesPrintingService {
    public static void execute(List<?> list) {
        executeRecursively(list, 0);
    }

    public static void executeRecursively(List<?> list, int evenIndex) {
        if (list == null || list.isEmpty() || list.size() < evenIndex)
            return;
        System.out.print(list.get(evenIndex) + " ");
        evenIndex = evenIndex + 2;
        executeRecursively(list, evenIndex);
    }
}