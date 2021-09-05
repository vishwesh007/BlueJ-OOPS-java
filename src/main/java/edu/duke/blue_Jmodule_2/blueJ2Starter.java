package edu.duke.blue_Jmodule_2;


import edu.duke.FileResource;
import edu.duke.blue_Jmodule_2.AssignmentCharacterInShakespearePlay;
import edu.duke.blue_Jmodule_2.CaesarCipher;
import edu.duke.blue_Jmodule_2.CaesarCipherv2;
import edu.duke.blue_Jmodule_2.CaesarDecrypter;
import edu.duke.blue_Jmodule_2.CaesarDecrypterv2;
import edu.duke.blue_Jmodule_2.WordPlay;
import edu.duke.blue_Jmodule_2.blueJ2Starter;
import edu.duke.blue_Jmodule_2.commonWordTested;
import edu.duke.commonWord.CommonWords;



public class blueJ2Starter {

  public static void main(String[] args) {
blueJ2Starter b = new blueJ2Starter();
//b.CaeserCipherStart();
//b.wordPlaymain();
//b.decryptCCipher();
//b.decryptCCipherv2();
//b.RollingPlay();
//b.Shakespeare();
//b.dualCcstarter();
//b.decryptDualCcipher();
//b.DualdecryptCaesarcipherwithkey();
//b.CaeserCipherStartv2();
b.MostfrequentWord();
//b.ShakespeareCharacters1();

  }
  
  /*file resource has limitations don't pass huge flie in caesar cipher it crashes like romeo.txt*/
  /* 1for file path 0 for string*/

public void CaeserCipherStartv2(){
int key=15;
  CaesarCipherv2 c= new CaesarCipherv2(key);
   
 //String path ="/storage/emulated/0/#BLUEJ/BlueJ2Course2/course1/PracticeBreakingCaesarData/mysteryTwoKeysPractice.txt";
String path= "Can you imagine life WITHOUT the internet AND computers in your pocket?";
 
 c.Caesarv2starter(path,key,0);
}

public void CaeserCipherStart(){
  CaesarCipher c= new CaesarCipher();
  int key=0;
  String path ="/storage/emulated/0/#BLUEJ/BlueJ2/PracticeBreakingCaesarData/mysteryTwoKeysPractice.txt";
 c.CaesarStarter(path,key);
   //System.out.println(c.decryptCaehelper(path,key));
   
 
}


public void wordPlaymain(){
  
  WordPlay w =new WordPlay();
  
  w.WordPlayStart("/storage/emulated/0/#BLUEJ/BlueJ2/PracticeBreakingCaesarData/mysteryTwoKeysPractice.txt");
 // w.WordPlayStart();
  
}




public void decryptCCipher(){
  
  CaesarDecrypter c= new CaesarDecrypter();
  String path ="/storage/emulated/0/#BLUEJ/BlueJ2/PracticeBreakingCaesarData/enDec.txt";
  FileResource fr = new FileResource(path);
  String encrypted =fr.asString();
  
  System.out.println(c.decryptCaesar(encrypted));
  
  
  
  
  
}


public void decryptCCipherv2(){
  
  CaesarDecrypterv2 c= new CaesarDecrypterv2();
  String path ="/storage/emulated/0/#BLUEJ/BlueJ2/PracticeBreakingCaesarData/enDec.txt";
  FileResource fr = new FileResource(path);
  String encrypted =fr.asString();
  
  System.out.println(c.decryptCaesarv2(encrypted));
  
  
  
  
  
}




public void decryptDualCcipher(){
  
 CaesarDecrypter c= new CaesarDecrypter();
String path ="/storage/emulated/0/#BLUEJ/BlueJ2Course2/course1/mysteryTwoKeysQuiz.txt";
  FileResource fr = new FileResource(path);
  String encrypted =fr.asString();
 //String encrypted= "Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!";
 String decrypted= c.dualcaesarCipherDecrypt(encrypted);
  System.out.println(decrypted);
}



public void RollingPlay(){
  
  DiceRolling d= new DiceRolling();
  d.simulate(1);
  
  
}

public void Shakespeare(){
  
  CommonWords n = new CommonWords();
  
  n.countShakespeare();
}

public void dualCcstarter(){

  /*String path ="/storage/emulated/0/#BLUEJ/BlueJ2/message2.txt";
  
  FileResource fr = new FileResource(path);
  
  String message = fr.asString();*/
  String message ="Can you imagine life WITHOUT the internet AND computers in your pocket?";
  
  int key1= 21;
int key2 = 8;
/*int Oddkey = key2;
int Evenkey = key1*/
CaesarCipher cc = new CaesarCipher();

cc.dualcaesarCipher(message,key2,key1);
}
 
 public void DualdecryptCaesarcipherwithkey(){
   CaesarDecrypter c= new CaesarDecrypter();
   String message ="Hfs cpwewloj loks cd Hoto kyg Cyy";
  int key1 = 14;
  int key2 =24;
   c.DecryptDualCcwithkeys(message,key1,key2);
 }


public void MostfrequentWord(){
  
  MostFrequentWordAssignment f= new MostFrequentWordAssignment();
  String path="/storage/emulated/0/#BLUEJ/BlueJ2Course2/tester.txt";
  f.tester(path);
  
}

public void ShakespeareCharacters1(){
  
  AssignmentCharacterInShakespearePlay n= new AssignmentCharacterInShakespearePlay();
  //String path="/storage/emulated/0/#BLUEJ/BlueJ2/Course2/ProgrammingRandomStoryData/macbeth.txt";
  String path ="/storage/emulated/0/#BLUEJ/BlueJ2/Course2/likeit.txt";
  n.Tester(path);
  
}

}




