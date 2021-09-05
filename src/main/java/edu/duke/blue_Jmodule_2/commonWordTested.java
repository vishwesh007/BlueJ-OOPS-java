package edu.duke.blue_Jmodule_2;
import edu.duke.*;

public class commonWordTested {
public String[] getCommonWords(){
  
  
  FileResource fr = new FileResource("/storage/emulated/0/#BLUEJ/BlueJ2/CommonWords/data/common.txt");
  
  int i=0;
  String [] Arr = new String[20] ;
  for(String S:fr.words()){
    S=S.toLowerCase();
    Arr[i] = S;
    i++;
    if(i==20){
      break;
    }
    
    
  }
  
  return Arr;
}

public int NoOfWord(String Se){
  
  
  int count= 0;
  String [] Arr= {"caesar.txt","errors.txt","hamlet.txt","likeit.txt","macbeth.txt","romeo.txt"};
  
  
  for(int i=0;i<Arr.length;i++){
    
    
    FileResource fr = new FileResource("/storage/emulated/0/#BLUEJ/BlueJ2/CommonWords/data/"+Arr[i]);
    
    for(String S:fr.words()){
      
      
      S=S.toLowerCase();
      if(S.equals(Se)){
        
        count++;
      }
      
      
    }
    //System.out.println("done with " + Arr[i]);
  }
  
  return count;
  
}



public static void main (String[] args){
  
  commonWordTested n= new commonWordTested();
  
  String [] commWord = n.getCommonWords();
  for(int i=0;i<commWord.length;i++){
    int j=0;
    
    j= n.NoOfWord(commWord[i]);
    
    System.out.println("Common word "+commWord[i]+" is " +j);
    
  }
}

}
