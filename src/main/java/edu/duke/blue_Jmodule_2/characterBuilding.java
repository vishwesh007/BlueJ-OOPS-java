package edu.duke.blue_Jmodule_2;

public class characterBuilding {

  public static void main(String[] args) {
  
  
  String test = "ABCabc1234567890'#:;!'";
  
  for(int i=0;i<test.length();i++){
    char ch= test.charAt(i);
    if (Character.isDigit(ch)){
      System.out.println(ch+ " is digit.");
      }
      if(Character.isAlphabetic(ch)){
        
        System.out.println(ch+" is alphabet.");
        
      }
      if(ch== '#'){
        
        System.out.println(ch+" is hashtag");
        
      }
    
  }

  }

}
