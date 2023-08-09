import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileSearchService {

    public static List<String> execute(String directoryPath) {
        if (directoryPath == null || directoryPath.isEmpty())
            throw new IllegalArgumentException("The parameter is null or empty");

        File directory = new File(directoryPath);
        if (directory.isFile())
            throw new IllegalArgumentException("The parameter must be the address of the directory");
        return executeRecursively(directory);
    }

    private static List<String> executeRecursively(File directory) {
        List<String> filesList = new ArrayList<>();
        for (File currentFile : Objects.requireNonNull(directory.listFiles())) {
            if (currentFile.isFile())
                filesList.add(currentFile.getName());

            if (currentFile.isDirectory())
                filesList.addAll(executeRecursively(currentFile));
        }
        return filesList;
    }

//    public static List<String> execute(String directoryPath) {
//        if (directoryPath == null || directoryPath.isEmpty())
//            throw new IllegalArgumentException("The parameter is null or empty");
//
//        File directory = new File(directoryPath);
//        if (directory.isFile())
//            throw new IllegalArgumentException("The parameter must be the address of the directory");
//        return executeRecursively(directory, new ArrayList<>());
//    }
//
//    private static List<String> executeRecursively(File directory, List<String> filesList) {
//        for (File currentFile : Objects.requireNonNull(directory.listFiles())) {
//            if (currentFile.isFile())
//                filesList.add(currentFile.getName());
//
//            if (currentFile.isDirectory())
//                executeRecursively(currentFile, filesList);
//        }
//        return filesList;
//    }
}