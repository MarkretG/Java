package task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void fileCreation(String s)
    {
        File file=new File(s);
        boolean result;
        try
        {
            result=file.createNewFile();
            if(result)
                System.out.println("file created successfully");
            else
                System.out.println("file name already exit");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {

            FileWriter fileWriter = new FileWriter(s);
            fileWriter.write("programmatically created file."+"\n");
            fileWriter.write("These words are written programmatically."+"\n");
            fileWriter.write("All is well.Be happy &enjoy the moment"+"\n");
            fileWriter.close();
            System.out.println("write successfully");
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }

    }
}
