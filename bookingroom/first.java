import java.util.*;
class Main {
  public static void main(String[] args) {
    int k=0;
    int total=0;
    int advance=0;
    Main m=new Main();
    Scanner sc = new Scanner(System.in);
    System.out.println("---------------------------------");
    System.out.println("Welcome To Manali HoneyMoon Hotel");
    System.out.println("---------------------------------");
    while(true){
      System.out.println("1.Want to Book Rooms");
      System.out.println("2.Want to Vacate");
      System.out.println("3.Exit the Application");
      System.out.println("Enter the choice(1/2/3):");
      int ch=sc.nextInt();
      switch(ch){
        case 1:
          
           System.out.println("Enter the number of persons:");
           int n=sc.nextInt();
           ArrayList<String> name=m.addDetails(n);
           k=name.size();
           System.out.println("The names are:");
           for(String s:name)
           {
             System.out.println(s);
           }
           System.out.println("The Cost for "+n+" is:");
           total=m.totalBill(n);
           System.out.println(total);
           System.out.println("how much you want to pay as Advance");
            advance=m.advance();
           System.out.println("---ENJOY THE RETREAT---");
           System.out.println();
           break;
      case 2:
         
          if(k==0)
          {
            System.out.println("---YOU HAVE NOT BOOKED THE ROOM YE---.");
            System.out.println();
            continue;
          }
          else{
          System.out.println("The remaining Balance is");
          int ad=total-advance;
          System.out.println(ad);
          System.out.println("---HAPPY JOURNEY---");
          }
          System.out.println();
          break;
      case 3:
           System.out.println("---THANK YOU FOR USING THE APPLICATION---");
           System.exit(0);
      }
    }

  }

  public ArrayList<String> addDetails(int n)
  {
    Scanner sc=new Scanner(System.in);
    
    ArrayList<String> list=new ArrayList<String>();
    for(int i=1;i<=n;i++)
    {
      System.out.println("Enter the name of "+i+" person");
      String name=sc.nextLine();
      list.add(name);
    }
    
    return list;
  }

  public int totalBill(int n){
    int total=n*1000;
    return total;
  }
  
  public int advance()
  {
    Scanner sc=new Scanner(System.in);
    int ad=sc.nextInt();

    return ad;
    
  }

}