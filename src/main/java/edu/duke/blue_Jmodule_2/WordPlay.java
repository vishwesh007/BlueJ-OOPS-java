package edu.duke.blue_Jmodule_2;
import edu.duke.*;
public class WordPlay {


public boolean isVowel(char ch){
  
  String Vowel = "AEIOUaeiou";
  int idx= Vowel.indexOf(ch);
  if(idx != -1){
    
    
    return true;
  }
  return false;
  
}


public String replaceVowels(String phrase, char che){
  
  StringBuilder AllVowels = new StringBuilder(phrase);
  
  for(int i=0;i<AllVowels.length();i++){
    
    char ch = AllVowels.charAt(i);
   boolean b= isVowel(ch);
    if( b ==true){
     AllVowels.deleteCharAt(i);
      AllVowels.insert(i,che);
     // AllVowels.replace(i,che);
    
    }
    
    
  }
  return AllVowels.toString();
}


public String emphasize (String phrase){
  
 StringBuilder AllVowels = new StringBuilder(phrase);
 
  for(int i=0;i<AllVowels.length();i++){
     
  char ch = AllVowels.charAt(i);
  
  if(isVowel(ch)==true) {
    
    
    if (i % 2 == 0){
     // AllVowels.deleteCharAt(i);
     // AllVowels.insert(i,'+');
     AllVowels.setCharAt(i,'+');
    }
    
    else if(i % 2 == 1){
      
    //  AllVowels.deleteCharAt(i);
      //AllVowels.insert(i,'*');
     AllVowels.setCharAt(i,'*');
    }
  } 
    
    
    
    
  }
  
  
  
  return AllVowels.toString();
  
}

public void WordPlayStart(String path){
  
  FileResource fr = new FileResource(path);
 String message = fr.asString();
//String message = "Hi buddyee!";
 System.out.println( replaceVowels(message,')'));
  System.out.println(emphasize(message));
}

}
