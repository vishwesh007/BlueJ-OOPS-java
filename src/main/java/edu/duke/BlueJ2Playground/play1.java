package edu.duke.BlueJ2Playground;

public class play1 {




  public static void main(String[] args) {
  String message ="import java dot io dot";
  
  StringBuilder sb = new StringBuilder(message);
  int idx = sb.indexOf("dot");
  
sb.replace(idx-1,idx+4,".");

System.out.println(sb.toString());
  }

}
