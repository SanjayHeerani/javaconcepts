import java.util.Scanner;

class Example{
    private int a[];
    private int count;
    int n,m,i,p;
    Scanner sc = new Scanner(System.in);
    int e[];
    Example(int length){
     a = new int[length];
    }
    void INSERT(int Interger){
        int b[];
        System.out.println("Enter Index Where You Want To Input Interger: ");
        m = sc.nextInt();
        b = new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i<m){
                b[i] = a[i];
            }else if(i==m){
                b[i] = Interger;
            }else{
                b[i] = a[i-1];
            }
        }
        System.out.println("ARRAY WITH INSERTED INTEGER:\n ");
        for(int i=0;i<n+1;i++){
         System.out.print(b[i]+" ,");
        }   
    }
    void APPEND(int INTERGER){
        int i;
     int c[] = new int[a.length+1];
     for(i=0;i<a.length;i++){
      c[i] = a[i];
     }
     c[c.length-1] = INTERGER; 
     System.out.println("\nARRAY WITH APPENDED ELEMENT:\n ");
     for(i=0;i<c.length;i++){
      System.out.print(c[i] +",");
     }
   }
   void REMOVE(){
    int i;
    int d[] = new int[a.length-1];
    System.out.println("\nENTER ELEMENT YOU WANT TO REMOVE: ");
    m = sc.nextInt();
    for(i=0;i<a.length;i++){
        if(i<m){
            d[i] = a[i];
        }else if(i==m)
            continue;
        else{
          d[i-1] = a[i];
        }
     }
     System.out.println("\nARRAY WITH REMOVED ELEMENT: ");
     for(i=0;i<d.length;i++){
        System.out.print(d[i]+ ",");
     }
   }
   void DELETE(int ele){
    int i;
    e = new int[a.length-1];
    for(i=0;i<a.length;i++){
     e[i] = a[i];
    }
    
    // e[e.length-1] = INTERGER; 
    System.out.println("\nARRAY WITH DELETED ELEMENT: ");
    for(i=0;i<e.length;i++){
     System.out.print(e[i] +",");
    }
  }
  void TRAVER(){
    System.out.println(" \nARRAY WITH TRAVERSVE ELEMENTS");
    for(int i=0;i<a.length;i++){
      System.out.print(a[i] +" ,");
    }
  }
}
public class MYCLASS{
    public static void main(String[] args){
    Example ex = new Example(10);
     Scanner sa = new Scanner(System.in);
     while(true){
        System.out.println("\nEnter EXIT IF YOU WANT TO CLOSE OR ENTER ANOTHER KEY TO CONTINUE PROGRAM...\n");
        String e = sa.nextLine();
        if(e.equalsIgnoreCase("exit")){
            break;
    }
     System.out.println("Enter A commend: (1)INSERT (2)APPEND (3)REMOVE (4)DELETE (5)TRAVE");
     String key = sa.nextLine();
     switch(key){
     case "1":
     ex.INSERT(240);
     break;
     case "2": 
     ex.APPEND(2500);
     break;
     case "3":
     ex.REMOVE();
     break;
     case "4":
     ex.DELETE(10);
     break;
     case "5":
     ex.TRAVER();
     break;
  }
}
System.out.println("PROGRAM CLOSED...!");
System.out.println("THANKS FOR USING SANJAY CODE...");
}
}
