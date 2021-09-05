package edu;

import edu.Debug1;


public class Debug1 {

  public void FindABC (String input){
int index = input.indexOf("abc");
while(true){
  
  if (index==-1|| index >=input.length()-3){
    
    System.out.println("index after updating"+index);
    
    break;
  }
  
  String found = input.substring(index+1,index+4);
  System.out.println(index);
  System.out.println(found);
  index = input.indexOf("abc",index+3);
  
  
  
}
  }

public static  void main(String[] args){
String s= "abcabcabcabca"; 
//String s= "abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj";
Debug1 d = new Debug1();
d.FindABC(s);


}
}
