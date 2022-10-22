import static utils.CommonUtils.*;

import java.io.File;

public class MainClass {
    public static void main(String[] args) throws Exception{
        String fileName = "/Users/xslaveus/Documents/testfile.txt";

        File myObj = new File(fileName);

        System.out.println("Path " + myObj.getPath());

        System.out.println("Abs" + myObj.getAbsolutePath());

        printFileSizeNIO(fileName);
        if(!isFileSizeZero(fileName)){
                
        }else {
            //deleteFile(fileName);
        }
    }
}
