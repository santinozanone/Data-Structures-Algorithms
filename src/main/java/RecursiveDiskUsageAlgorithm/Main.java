package RecursiveDiskUsageAlgorithm;

import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
       //System.out.println(calculateSize("C:\\Users\\losmelli\\Documents\\GitHub"));
        System.out.println(calculateSize("C:\\Users\\losmelli\\Documents\\Imagenes de Android"));
    }

    public static long calculateSize(String pathString){
        File file = new File(pathString);
        //System.out.println(pathString);
        if (file.isDirectory()){
            long totalSize = 0L;
            for (int i = 0; i< Objects.requireNonNull(file.list()).length; i++){
                String fileName = Objects.requireNonNull(file.list())[i];
                String path = pathString + "\\"+fileName;

                long size =  calculateSize(path);
                totalSize = totalSize + (size);
                System.out.println(path + " " + size);
            }
            return totalSize  ;
        }
        return file.length();
    }
}
