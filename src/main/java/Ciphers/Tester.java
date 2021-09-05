package Ciphers;

import Ciphers.*;
import edu.duke.FileResource;

public class Tester {

   private String key = "dice";
  private String message = "/storage/emulated/0/#BLUEJ/BlueJ2Course2/C4/VigenereTestData/oslusiadas_key17.txt";
  
  
   private void start() {
System.out.println(message);
 // CaesarCoptim();
  CCrackerOptim();
   
   
   
   
  }
  private void CCrackerOptim(){
   /* CaesarCracker c = new CaesarCracker();
    int key =  c.getKey(message);
    System.out.println(key);
      String decrypted = c.decrypt(message);
      System.out.println(decrypted);*/
      
      CaesarCracker c = new CaesarCracker('a');
    int key =  c.getKey(message);
    System.out.println(key);
      String decrypted = c.decrypt(message);
      System.out.println(decrypted);
      
    }
  
  
  
  public void CaesarCoptim(){
    CaesarCipher c = new CaesarCipher(13);
    System.out.println(c.encrypt(message));
    
    
  }
  public void Vigenereoptim(){
   // VigenereCipher c = new VigenereCipher();
    
    
    
  }



  public void messageParser() {

    int index = message.indexOf("/storage");

    if (index == 0) {

      FileResource fr = new FileResource(message);

      message = fr.asString();
     
    }
start();
  }

  public static void main(String[] args) {

    Tester s = new Tester();
    s.messageParser();
  }

}
