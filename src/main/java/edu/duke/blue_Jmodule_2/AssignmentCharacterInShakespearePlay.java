package edu.duke.blue_Jmodule_2;

import edu.duke.FileResource;
import java.util.ArrayList;


public class AssignmentCharacterInShakespearePlay {


private ArrayList<String> myCharacter;
private ArrayList<Integer> myFreqs;



public AssignmentCharacterInShakespearePlay(){
  
  myCharacter = new ArrayList<String>();
  myFreqs = new ArrayList<Integer>();
  
  
}

public void update (String person){
  
  int index= myCharacter.indexOf(person);
  if(index==-1){
    
    myCharacter.add(person);
    myFreqs.add(1);
    
    
  }
 else if(index!=-1){
   
   int Value= myFreqs.get(index);
   myFreqs.set(index,Value+1);
   
   
 }
 
 
}
public void findAllCharacter(String path){
  
  myCharacter.clear();
  myFreqs.clear();
  FileResource fr= new FileResource(path);
  for(String str:fr.lines()){
    int index = str.indexOf(".");
    if(index != -1){
      
      update(str.substring(0,index));
      
      
    }
    
    
  }
 
  
  
  
}
public void Tester(String path){
  
 findAllCharacter(path);
  int MaxIndex = findIndexOfMax();
  for (int i=0;i<myCharacter.size();i++){
    if(myFreqs.get(i)>MaxIndex/2){
      
      System.out.println(myCharacter.get(i)+" \t\t"+myFreqs.get(i));
      
      
    }
  }
  int Maxindex = freqsMax();
CharacterWithNumParts(10,15);
CharacterWithNumParts(2,Maxindex);
}

public int findIndexOfMax(){
  
  int Currmax=0;
  int index=0;
  for(int i=0;i<myFreqs.size();i++){
    
    if(Currmax<myFreqs.get(i)){
      
      Currmax = myFreqs.get(i);
      index=i;
      
    }
  }
  return  index;
}

public int freqsMax(){
  
  int Currmax=0;
  int index=0;
  for(int i=0;i<myFreqs.size();i++){
    
    if(Currmax<myFreqs.get(i)){
      
      Currmax = myFreqs.get(i);
      index=i;
      
    }
  }
  return  Currmax;
}


public void CharacterWithNumParts(int num1,int num2){
  
  
  

  
  for (int i=0;i<myCharacter.size();i++){
    if(myFreqs.get(i) >= num1 && myFreqs.get(i) <= num2){
      
      System.out.println(myCharacter.get(i)+"\t"+myFreqs.get(i));
      
      
    }
  }
}

}
