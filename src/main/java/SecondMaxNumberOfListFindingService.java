import java.util.List;

public class SecondMaxNumberOfListFindingService {
    public static int execute(List<Integer> list) {
        if (list == null || list.isEmpty() || list.size() == 1)
            throw new RuntimeException("List is empty or null or contains one element");

        int maxElement = Math.max(list.get(0), list.get(1));
        int secondMaxElement = Math.min(list.get(0), list.get(1));

        return executeRecursively(list, maxElement, secondMaxElement, 1);
    }

    private static int executeRecursively(List<Integer> list, int maxElement, int secondMaxElement, int iterateIndex) {
        if (iterateIndex + 1 >= list.size())
            return secondMaxElement;

        if (secondMaxElement <= list.get(iterateIndex + 1))
            secondMaxElement = list.get(iterateIndex + 1);

        if (maxElement <= list.get(iterateIndex + 1)) {
            secondMaxElement = maxElement;
            maxElement = list.get(iterateIndex + 1);
        }

        return executeRecursively(list, maxElement, secondMaxElement, iterateIndex + 1);
    }
}