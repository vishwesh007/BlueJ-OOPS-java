package edu.duke.blue_j;

import java.io.File;


public class DeleteFile {
public String path="";

public void fileDelete(){
  
  
    
    File f =new File(path);
    if(f.delete()){
    System.out.println("delete file success " +f.getName());
    
       
    }
    else {
      
      System.out.println("delete error");
    }
    

  
  
}


public void start(){
  
  fileDelete();
  
}



}
