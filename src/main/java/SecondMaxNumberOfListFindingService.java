import java.util.List;

public class SecondMaxNumberOfListFindingService {
    public static int execute(List<Integer> list) {
        return executeRecursively(list, 0, 0, 1);
    }

    private static int executeRecursively(List<Integer> list, int maxElement, int secondMaxElement, int iterateIndex) {
        if (list == null || list.isEmpty() || list.size() == 1)
            throw new RuntimeException("List is empty or null or contains one element");

        if (list.size() == 2)
            return Math.min(list.get(0), list.get(1));

        if (iterateIndex + 1 >= list.size())
            return Math.min(maxElement, secondMaxElement);

        if (maxElement <= list.get(iterateIndex + 1)) {
            secondMaxElement = maxElement;
            maxElement = list.get(iterateIndex + 1);
        }

        if (secondMaxElement <= list.get(iterateIndex + 1))
            secondMaxElement = list.get(iterateIndex + 1);

        return executeRecursively(list, maxElement, secondMaxElement, iterateIndex + 1);
    }

//    private static int executeRecursively(List<Integer> list, int maxElementIndex, int secondMaxElementIndex, int iterateIndex) {
//        if (list == null || list.isEmpty() || list.size() == 1)
//            throw new RuntimeException("List is empty or null or contains one element");
//
//        if (list.size() == 2)
//            return Math.min(list.get(maxElementIndex), list.get(secondMaxElementIndex));
//
//        if (iterateIndex + 1 >= list.size())
//            return Math.min(list.get(maxElementIndex), list.get(secondMaxElementIndex));
//
//        if (list.get(maxElementIndex) < list.get(secondMaxElementIndex)) {
//            maxElementIndex = secondMaxElementIndex;
//            secondMaxElementIndex--;
//        }
//
//        if (list.get(maxElementIndex) <= list.get(iterateIndex + 1)) {
//            secondMaxElementIndex = maxElementIndex;
//            maxElementIndex = iterateIndex + 1;
//        }
//
//        if (list.get(secondMaxElementIndex) <= list.get(iterateIndex + 1)) {
//            secondMaxElementIndex = iterateIndex + 1;
//        }
//
//        return executeRecursively(list, maxElementIndex, secondMaxElementIndex, iterateIndex + 1);
//    }
}