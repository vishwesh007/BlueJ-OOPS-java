package edu.duke.blue_Jmodule_2;

import edu.duke.FileResource;
import java.util.ArrayList;


public class MostFrequentWordAssignment {


private ArrayList<String> myWords;
private ArrayList<Integer> myFreqs;

public MostFrequentWordAssignment(){
  
  myWords = new ArrayList<String>();
  myFreqs = new ArrayList<Integer>();
  
}


public void findUnique(String path){
  
  myWords.clear();
    myFreqs.clear();
  FileResource fr = new FileResource(path);
  
  for(String word:fr.words()){
    word = word.toLowerCase();
    int index = myWords.indexOf(word);
    if(index==-1){
      myWords.add(word);
      myFreqs.add(1);
      
    }
    
    if(index!= -1){
    int Value = myFreqs.get(index);
      myFreqs.set(index,Value+1);
    }
  }
}



public int findIndexOfMax(){
  int currMax=0;
  int index=0;
  for(int i=0;i<myFreqs.size();i++){
    
    if(currMax<myFreqs.get(i)){
      
      currMax = myFreqs.get(i);
      index =i ;
      
    }
  }
  
  return index;
}

public void findCommonWordLength(){
  ArrayList<Integer> wordlength = new ArrayList<Integer>();
  for(int i=0;i<myWords.size();i++){
    
    String str= myWords.get(i);
    int n  = str.length();
    while(wordlength.size()<=str.length()){
      wordlength.add(0);
    }
    
    int Value = wordlength.get(n);
    wordlength.set(n,Value+1);  
    
  }
  
  for(int i=0;i<wordlength.size();i++){
    
    System.out.println("for "+i+"\twordlength frequency is"+wordlength.get(i));
    
  }
}

public void tester(String path){
  
  findUnique(path);
  System.out.println("Unique word are "+myWords.size());
  for(int i=0;i<myFreqs.size();i++){
    if(myFreqs.get(i)>3){
    System.out.println("Frequency is " +myFreqs.get(i)+" for the word "+myWords.get(i));
    }
  }
  int n= findIndexOfMax();
  System.out.println("Max Frequency is " +myFreqs.get(n)+" for the word "+myWords.get(n));
  findCommonWordLength();
}
}
