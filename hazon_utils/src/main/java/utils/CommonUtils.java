package utils;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CommonUtils {

    public static void printFileSizeNIO(String fileName) {

        Path path = Paths.get(fileName);
        try {
            // size of a file (in bytes)
            long bytes = Files.size(path);
            System.out.println(String.format("%,d bytes", bytes));
            System.out.println(String.format("%,d kilobytes", bytes / 1024));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int getNumberOfLines(String fileName) throws IOException {
        List<String> fileStream = Files.readAllLines(Paths.get(fileName));
        int noOfLines = fileStream.size();
        System.out.println(String.format("%,d Lines", noOfLines));
        return noOfLines;
    }

    public static boolean isFileSizeZero(String fileName)throws IOException{
        Path path = Paths.get(fileName);
        long bytes = Files.size(path);
        System.out.println(String.format("%,d bytes", bytes));
        return bytes>0;
    }

    public static boolean isFileExists(String fileName)throws IOException{
        Path path = Paths.get(fileName);
        boolean exists = Files.exists(path);
        System.out.println(String.format("%,d exists", exists));
        return exists;
    }

    public static boolean deleteFile(String fileName)throws IOException{
        Path path = Paths.get(fileName);
        boolean fileDeleted = Files.deleteIfExists(path);
        System.out.println(String.format(" fileDeleted"+ fileDeleted));
        return fileDeleted;
    }

}
