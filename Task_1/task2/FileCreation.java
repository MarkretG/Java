package task2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileCreation {
    public static void fileCreation(String s)
    {
        File file=new File(s);
        FileWriter fileWriter=null;
        try
        {
            if(!file.isFile())
            {
                file.createNewFile();
                System.out.println("file created successfully");
            }
            fileWriter = new FileWriter(s);
            fileWriter.write("programmatically created file." + "\n");
            fileWriter.write("These words are written programmatically." + "\n");
            fileWriter.write("All is well.Be happy &enjoy the moment" + "\n");
            System.out.println("write successfully");

        }
        catch(IOException e)
        {
            System.out.println("Io exception occurred");
        }
        finally
        {
            try {

                if (fileWriter != null)
                    fileWriter.close();
               }
            catch (IOException  i)
            {
                System.out.println("error occurred");
            }

        }


    }
}
