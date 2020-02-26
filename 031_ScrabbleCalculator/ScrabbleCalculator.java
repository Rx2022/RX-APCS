import java.util.Scanner;
//import the scanner
public class ScrabbleCalculator
{
    public static void main(String[] args)
    {
    // these are the variable of each letter's score and the time each letter can be used
    int bT=2;
    int cT=2;
    int fT=2;
    int hT=2;
    int jT=1;
    int kT=1;
    int mT=2;
    int pT=2;
    int qT=1;
    int vT=2;
    int wT=2;
    int xT=1;
    int yT=2;
    int zT=1;
    int aT=9;
    int dT=4;
    int eT=12;
    int gT=3;
    int iT=9;
    int lT=4;
    int nT=6;
    int oT=8;
    int rT=6;
    int sT=4;
    int tT=6;
    int uT=4;
    int blankT=2;

    int a=1;
    int e=a;
    int i=a;
    int o=a;
    int u=a;
    int l=a;
    int n=a;
    int s=a;
    int t=a;
    int r=a;

    int d=2;
    int g=d;

    int b=3;
    int c=b;
    int m=c;
    int p=b;

    int f=4;
    int h=f;
    int v=f;
    int w=f;
    int y=f;

    int k=5;

    int j=8;
    int x=j;

    int q=10;
    int z=q;

//these variables help to count each letter in the word
    int bC=0;
    int cC=0;
    int fC=0;
    int hC=0;
    int jC=0;
    int kC=0;
    int mC=0;
    int pC=0;
    int qC=0;
    int vC=0;
    int wC=0;
    int xC=0;
    int yC=0;
    int zC=0;
    int aC=0;
    int dC=0;
    int eC=0;
    int gC=0;
    int iC=0;
    int lC=0;
    int nC=0;
    int oC=0;
    int rC=0;
    int sC=0;
    int tC=0;
    int uC=0;
    int blankC=0;




    String build="";
    boolean isBuilt=true;

    Scanner scan=new Scanner(System.in);
    //ask the user to type in a word
    System.out.println("Type a word");
    String word=scan.nextLine();
    int length=word.length();
    int score=0;
   
     

     //count the letters in the word, if the one letter is used more than the time it can appear, it's not built
     for(int ber=0;ber<length;ber++)
     {
     if(word.substring(ber,ber+1).equalsIgnoreCase("a"))
     {
      aC++;
       if(aC>aT)
       {
            build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
            break;
            
       }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("b"))
     {
          bC++;
          if(bC>bT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("c"))
     {
          cC++;
          if(cC>cT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("d"))
     {
          dC++;
          if(dC>dT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("e"))
     {
          eC++;
          if(eC>eT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("f"))
     {
          fC++;
          if(fC>fT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("g"))
     {
          gC++;
          if(gC>gT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("h"))
     {
          hC++;
          if(hC>hT)
          {
               build="This word is not built.";
            System.out.println(build);
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("i"))
     {
          iC++;
          if(iC>iT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("j"))
     {
          jC++;
          if(jC>jT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("k"))
     {
          kC++;
          if(kC>kT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("l"))
     {
          lC++;
          if(lC>lT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("m"))
     {
          mC++;
          if(mC>mT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("n"))
     {
          nC++;
          if(nC>nT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("o"))
     {
          oC++;
          if(oC>oT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("p"))
     {
          pC++;
          if(pC>pT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("q"))
     {
          qC++;
          if(qC>qT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("r"))
     {
          rC++;
          if(rC>rT)
          {
               System.out.println("This word is not build.");
               isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("s"))
     {
          sC++;
          if(sC>sT)
          {
               System.out.println("This word is not build.");
               isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("t"))
     {
          tC++;
          if(tC>tT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("u"))
     {
          uC++;
          if(uC>uT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("v"))
     {
          vC++;
          if(vC>vT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("w"))
     {
          wC++;
          if(wC>wT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("x"))
     {
          xC++;
          if(xC>xT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("y"))
     {
          yC++;
          if(yC>yT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase("z"))
     {
          zC++;
          if(zC>zT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
     else if(word.substring(ber,ber+1).equalsIgnoreCase(" "))
     {
          blankC++;
          if(blankC>blankT)
          {
               build="This word is not built.";
            System.out.println(build);
            isBuilt=false;
               break; 
          }
     }
}

       
     
     
     
     
     
     
 //if the word is built, add the score of letters it have together    
if(isBuilt)  
{
for(int num=0;num<length;num++)
{    
if(word.substring(num,num+1).equalsIgnoreCase("a")) 
       {
         score+=a;
       }
      else if(word.substring(num,num+1).equalsIgnoreCase("b"))
         {
              score+=b;
         }
      else if(word.substring(num,num+1).equalsIgnoreCase("c"))
         {
              score+=c;
         }
     else if(word.substring(num,num+1).equalsIgnoreCase("d"))
     {
          score+=d;
     }
      else if(word.substring(num,num+1).equalsIgnoreCase("e"))
     {
          score+=e;
     }
      else if(word.substring(num,num+1).equalsIgnoreCase("f"))
      {
           score+=f;
      }
      else if(word.substring(num,num+1).equalsIgnoreCase("g"))
      {
           score+=g;
      }
      else if(word.substring(num,num+1).equalsIgnoreCase("h"))
     {
          score+=h;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("i"))
     {
          score+=i;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("j"))
     {
          score+=j;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("k"))
     {
          score+=k;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("l"))
     {
          score+=l;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("m"))
     {
          score+=m;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("n"))
     {
          score+=n;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("o"))
     {
          score+=o;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("p"))
     {
          score+=p;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("q"))
{
     score+=q;
}
     else if(word.substring(num,num+1).equalsIgnoreCase("r"))
     {
          score+=r;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("s"))
     {
          score+=s;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("t"))
     {
          score+=t;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("u"))
     {
          score+=u;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("v"))
     {
          score+=v;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("w"))
     {
          score+=w;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("x"))
     {
          score+=x;
     }
     else if(word.substring(num,num+1).equalsIgnoreCase("y"))
     {
          score+=y;
     }
     else
     {
          score+=z;
     }
     }
          System.out.println(score);
          //print out the score
      }
      scan.close();
      //close the scanner
     }
}
   
    
    