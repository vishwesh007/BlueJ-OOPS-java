package edu.duke.blue_j;
import java.io.File;
public class renameFile {

public String path ="";
public String path2 ="";

public void fileRename(){
  
  File file = new File(path); 

          

        // renaming the file and moving it to a new location 

        if(file.renameTo 

           (new File(path2))) 

        { 

            file.delete(); 

            System.out.println("File rename successfully"); 

        } 

        else

        { 

            System.out.println("Failed to move the file"); 

        }

}

public void start(){
  
  
  fileRename();
}

}
