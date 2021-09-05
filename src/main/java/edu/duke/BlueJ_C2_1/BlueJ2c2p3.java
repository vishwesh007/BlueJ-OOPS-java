package edu.duke.BlueJ_C2_1;

import edu.duke.BlueJ_C2_1.BlueJ2c2p3;
import edu.duke.BlueJ_C2_1.vigenereCipherv2;
import edu.duke.FileResource;

import Ciphers.CaesarCipher;

public class BlueJ2c2p3 {

  private String key = "dice";
  private String message = "sasta Past";
  
  
   private void start() {
System.out.println(message);
  Startvigenere();
   
   
   
   
   
  }
  
  public void CaesarCoptim(){
    CaesarCipher c = new CaesarCipher(13);
    System.out.println(c.encrypt(message));
    
    
  }
  public void Vigenereoptim(){
   // VigenereCipher c = new VigenereCipher();
    
    
    
  }

  public void Startvigenere() {
    vigenereCipherv2 v = new vigenereCipherv2(key);

    v.vigenereCipher2starter(message);
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

    BlueJ2c2p3 s = new BlueJ2c2p3();
    s.messageParser();
  }
}
