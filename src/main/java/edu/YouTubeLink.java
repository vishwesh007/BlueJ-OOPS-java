package edu;

import edu.duke.*;

public class YouTubeLink {

  public void LinkFinder(String S, String Keyword) {
    int n = 0;
    URLResource ur = new URLResource(S);
    
    for (String p : ur.words()) {
    
      n = LinkLogic(p,n,Keyword);
              }
      
    

    System.out.println("No. of links are " + n);
  }

public int LinkLogic(String p, int n,String Keyword){
  
  int pos = 0;
      String q = p.toLowerCase();
      pos = q.indexOf(Keyword);

      if (pos != -1) {

        int Lpos = p.lastIndexOf("\"", pos);
        int hpos = p.indexOf("\"", pos);
        if (hpos != -1 && Lpos != -1) {
          System.out.println(p.substring(Lpos, hpos + 1));
          n++;
          }
          }
  return n;
}




  public static void main(String[] args) {

    String Link = "https://www.dukelearntoprogram.com/course2/data/manylinks.html";

    // String Link ="https://m.youtube.com";
    //   String Link= "https://m.youtube.com/watch?v=3oYGKEBDdIA";

   YouTubeLink yl = new YouTubeLink();
   String Keyword = "youtube.com";
    yl.LinkFinder(Link, Keyword);
  }
}
