package edu.duke.blue_Jmodule_2;

import edu.duke.*;
import java.util.Arrays;
import  edu.duke.blue_Jmodule_2.wordLengthassignment1;

public class wordLengthassignment1 {

public void countWordLength(FileResource resource,int[] counts){
  
  for(String word:resource.words()){
    
   int  wordlength = word.length();
    if(! Character.isLetter(word.charAt(wordlength-1))){
      wordlength = wordlength-1;
   
    }
    if(! Character.isLetter(word.charAt(0))){
      wordlength = wordlength -1;
   
    }
    
    if(wordlength>counts.length-1){
      counts[counts.length-1]++;
    }
    else if(wordlength>0){
      counts[wordlength]++;
    }
  }
  
}
public void testCountWordLength(){
 /* String path="/storage/emulated/0/#BLUEJ/BlueJ2/CommonWordsData/romeo.txt";*/
 String path ="/storage/emulated/0/#BLUEJ/BlueJ2/PracticeBreakingCaesarData/lotsOfWords.txt";
 FileResource fr= new FileResource(path);
 
 int [] counts = new int[31];
 countWordLength(fr,counts);
 for (int i=0;i<counts.length;i++){
 if(counts[i]>0){
 System.out.println(counts[i]+" words of length "+(i));
 }
 }
// System.out.println(Arrays.toString(counts));
 System.out.println(indexOfMax(counts)+"is the index with max words length");
}

public int indexOfMax(int[] values){
  
  int maxVal=0;
  int index=0;
  for(int i=0;i<values.length;i++){
    
    if(maxVal<values[i]){
      
      maxVal =values[i];
      index=i;
    }
    
  }
  return index;
}

  public static void main(String[] args) {
wordLengthassignment1 w= new wordLengthassignment1();

w.testCountWordLength();
  }

}
