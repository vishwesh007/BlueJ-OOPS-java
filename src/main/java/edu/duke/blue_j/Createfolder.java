package edu.duke.blue_j;

import java.io.File;


public class Createfolder {
public String path="";


private  void foldercreate(){
  File f = new File(path);
  
  if(f.mkdirs()){
    
    System.out.println("directory created Successfully with name"+f.getName());
    
   
  }
  else {  System.out.println("directory creation failed");
  }
  
}

public void start(){
  
  foldercreate();
}


}
