package edu.duke.blue_j;

import java.io.File;
import java.io.IOException;


public class fileCreation {

  private void file(String path) {

try{
File f = new File(path);
if (f.createNewFile()){
  
  System.out.println("file created successfully "+f.getName());
  
}else{
  
  System.out.println("file exists");
  
  
  
}

}catch (IOException e){
  
  System.out.println("error occured");
  
  e.printStackTrace();
}

  }
  
  public void start(String path){
    
    file(path);
  }

}
