package edu;

import edu.Genestarter;
import edu.YouTubeLink;


public class Genestarter {

  public static void main(String[] args) {
Genestarter g= new Genestarter();
//String dnaPath="/storage/emulated/0/#BLUEJ/Files/dna/GRch38dnapart.fa";
String dna1 = "oneAtGMyGeneOneAATGGGGTAATGATAGAACCCGGYGGGGTAGGGCTGCCCATGendOneTAAnonCodingDnaTAGTGAZZZtaaTwoATGMyGeneTwoCATGGGGTAATGATAGCCatgCCCFalseStartTAATGATGendTwoTAGnonCodingDNATAACCCThreeATGMyGeneThreeATGGGGTAATGATAGATGccendThreeTAAnonCodingDNAccTAAfalsecccFourATGMyGeneFourATGGGGTAATGATAGCendFourTAGnonCodingdnaFiveAtgMyGeneFiveATGGGGTAATGATAGCendFiveTGAnonCodingdnaSixATGmyGeneSixATATGGGGTAATGATAGAendSixTAAnoncodingdnaSevenATGMyGeneSevenCcATGGGGTAATGATAGendSeventaAnoncodingdnaEightATGmyGeneEightATGGGGTAATGATAGGGendEighttaAnoncodingdnaCcccWrongtgaCtaaCtagCCcgNineATgmyGeneNineATGGGGTAATGATAGTaaAendNineTAAnonCodingDnaCcccTenATGmyGeneTenGATGGGGTAATGATAGCCHasFakeATGFAKEatgcendTentaanonCodingDnaCtagCtganonCodingDnaxxxElevenATGmyGeneElevenCATGGGGTAATGATAGTAAxxGeneATGTAACATGTAAATGCendElevenTAAnonCodingDnaxTAGxtgaTwelveATGmyGeneTwelveCATGGGGTAATGATAGCTheLastGeneIsATGTAGendTwelvetgaATGTAG";

String dna2 = "ATGGTA";
String []Arr = {"1","2"};
for(int i= 0;i<2;i++){

g.passGeneString("dna"+Arr[i]);
/*this should pass string as variable like in
the use of count Shakespeare
*/
}


//g.passGeneFile(dnaPath);

  }
  
  
  
  public void LinksFinder(String Link,String Keyword){
  
  
    YouTubeLink YL = new YouTubeLink();
    

YL.LinkFinder(Link,Keyword);
    
  }
  
  public void passGeneFile(String s){
    
    GeneFinder GF = new GeneFinder();

GF.startGeneFinder(s);
}
    public void passGeneString(String s){
      
      GeneFinder GF = new GeneFinder();
      GF.TestingGene(s);
      
    }
   public void StringName(){
     
     
   }
  }
  



