package edu;

import edu.GeneFinder;
import edu.duke.*;


public class GeneFinder {

public int chooseCodon(int staclength,int scstart, String dna,String stopc1,String stopc2,String stopc3){
     GeneFinder p= new GeneFinder();
        int intrstop=scstart+staclength;
    int a1=p.checkCodon(intrstop,dna,stopc1,scstart);
    int a2=p.checkCodon(intrstop,dna,stopc2,scstart);
    int a3=p.checkCodon(intrstop,dna,stopc3,scstart);
int c=0;
int b1=a1<a2?a1:a2;
int b2=a2<a3?a2:a3;
  
       c= b1<b2?b1:b2;
        
      return c;  
    }
    
public StorageResource FindGene(String dna){
String dna1=dna.toUpperCase();
String stac= "ATG";
String stopc1="TAA";
String stopc2="TAG";
String stopc3="TGA";
int a=0;
int n=0;
int c=0;

int staclength=stac.length();
StorageResource GeneList= new StorageResource();
while(a<dna.length()){
    
    
    
     
    int scstart= dna1.indexOf(stac,a);
    if(scstart== -1){
        //return "no genes Left as no atg";
        break;
    }
    
   c=chooseCodon(staclength,scstart,dna1,stopc1,stopc2,stopc3);
    if(c !=9999999 ){
    //System.out.println("DNA CODE IS "+dna.substring(scstart,c+3));
    n++;
    GeneList.add(dna.substring(scstart,c+3));
    
}
    
    
    a=c+3;
}
    
    System.out.println("no. of genes are "+n);
    return GeneList;
    //return "code ends";
    
}

public int checkCodon(int intrstop, String dna1,String stopc,int scstart)
{
    int diff=0;
    int scstop=0;
  do{
       scstop= dna1.indexOf(stopc,intrstop);
      if(scstop==-1){
          return 9999999;
        }
     diff = scstop-scstart;
    intrstop= scstop+1;}while(diff % 3!=0);
    return scstop;
    
}

public void printGenes(StorageResource Genelist){
int GG =0;

    for(String g:Genelist.data()){
    if (g.length()>60){
      GG++;
      }
 
        System.out.println(g);
        
        
        
    }
    System.out.println("Genes with length higher than 60   "+GG);
        
}


public void CGRatio(StorageResource GeneList){
  int HighCg=0;
 
  for (String gene : GeneList.data()){
    
    int c = findNucleotide(gene,"C");
    
    int g = findNucleotide(gene,"G");
    int cpg = c+g;
    double dc =cpg;
    double cg = dc/(gene.length());
    
    if (cg>0.35){
      
      HighCg +=1;
    }
    }
  System.out.println(" no. of genes with high cg are"+HighCg);
}


public void CGRatio(String dna){
  int HighCg=0;
 double cg =0;

    
    int c=findNucleotide(dna,"C");
    
    int g = findNucleotide(dna,"G");
    double dc= c;
     cg = dc/g;
    if (cg>0.35){
      
      HighCg +=1;
    }
    
  System.out.println("High cg no. of genes are"+HighCg);
}

public void findNumberOfCodon(String dna){
  
 String Codon= "CTG";
 // int n=0;
  int update =0;
  int pos=0;
  int CTG=0;
  
  
  String dna1 = dna.toUpperCase();
  
    while (pos<(dna1.length())){
     
      update = dna1.indexOf(Codon,pos);
      
      if (update != -1){
        
        
        CTG+= 1;
      }
      if (update == -1){
        
        break ;
      }
      pos =update+Codon.length();
      
      
   }
    
  
  
  
  System.out.println("CTG NO. "+CTG);
  
}

public int findNucleotide(String dna,String Nucleotide){
  int CTG =0;
  int pos =0;
  int update = 0;
  String dna1 = dna.toUpperCase();
  
    while (pos<(dna1.length())){
     
      update = dna1.indexOf(Nucleotide,pos);
      
      if (update != -1){
        
        
        CTG+= 1;
      }
      if (update == -1){
        
        break ;
      }
      pos =update+Nucleotide.length();
      
      
   }
   
   
  return CTG;
}

public void longestGene(StorageResource GeneList){
  int n=0;
  for(String gene : GeneList.data()){
    
    if (gene.length()>n){
      n= gene.length();
    }
  }
  
  System.out.println("highest gene length is "+n);
  
}

public  void startGeneFinder(String s){
   
   
   // String dna1="sATGATTTsAaGTAATAATAGATT";
  // String s = "/storage/emulated/0/#BLUEJ/Files/dna/";
   
    FileResource fr= new FileResource(s);
    
   
   String dna1=fr.asString();
  
     
  
     StorageResource GeneList =FindGene(dna1);
    printGenes(GeneList);
    
   CGRatio(GeneList);
    findNumberOfCodon(dna1);
    longestGene(GeneList);
    
    
}

public void TestingGene(String dna1){


StorageResource GeneList =FindGene(dna1);
    printGenes(GeneList);
    
   CGRatio(GeneList);
    findNumberOfCodon(dna1);
    longestGene(GeneList);
}




}