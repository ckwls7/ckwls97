import java.util.Scanner;

class Sample{
	// Entry point
	public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int kor, eg, math, score ;

       System.out.println("input kor: ");
       kor = scanner.nextInt();

       System.out.println("input eg: ");
       eg = scanner.nextInt();
       
       System.out.println("input math: ");
       math = scanner.nextInt();

       int total = kor + eg + math;

       
       System.out.println("total : "+ total);
       System.out.println("Average :" + total / 3.0);

       int avg =(int) (total / 3.0 * 100 + 0.5);
       System.out.println("Average2 : " +avg/ 100.0);
       System.out.format("Average3  : %.2f\n ", total / 3.0);

	  /*

          int a,b

           System.out.println("input nuber a:"); 	
           a = scanner.nextInt();
	       
	       System.out.println("input number b:");
           b = scanner.nextInt();

	       System.out.println("a > b" + (a > b));
	       System.out.println("a >= b" + (a >= b));
	       System.out.println("a == b" + (a == b));
           System.out.println("a <= b" + (a <= b));
	       System.out.println("a < b" + (a < b));
    
	}
}*/

       }
}
