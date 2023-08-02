import java.util.List;

public class ListEvenValuesPrintingService {
    public static void execute(List<Integer> list) {
        if (list == null || list.isEmpty())
            return;
        if (list.get(0) % 2 == 0)
            System.out.print(list.get(0) + " ");
        list.remove(0);
        execute(list);
    }
}