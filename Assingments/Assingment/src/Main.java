import java.util.Scanner;

public class Main {
     Scanner sc = new Scanner(System.in);
  
     //function to checkPalindrome
     public void checkPalindrome()  {
          	 
    	 int n = sc.nextInt();
    	 int sum = 0, r;
    	 int temp = n;
    	 while (n>0){
    		 r=n%10;
    		 sum = (sum*10)+r;
    		 n = n/10;
    	}
    	if(temp==sum) {
    		System.out.println("Hurrah! It is a Palindrome Number");
    	} 
    	else 
    	{
    		System.out.println("Sorry it's not a Palindrome Number.Try Again!");	
    	}	 
    }



          //function to printPattern

     public void printPattern() {
        int rows=sc.nextInt();
        for (int i=rows-1; i>=0; i--) {
        	for (int j=0; j<=i; j++) {
        	System.out.print("*" + "");
        	}		
       System.out.println();
        }	 
    }



        //function to check no is prime or not

      public void checkPrimeNumber() {
    	  int number= sc.nextInt();
          if(isPrime(number)) {
              System.out.println(number + " is prime number");
          }
          else{
              System.out.println(number + " is a non-prime number");
          }
      }
      static  boolean isPrime(int num)
      {
          if(num<=1)
          {
              return false;
          }
         for(int i=2;i<num/2;i++)
         {
             if((num%i)==0)
                 return  false;
         }
         return true;
      }

        // function to print Fibonacci Series

        public void printFibonacciSeries() {

              //initialize the first and second value as 0,1 respectively.

         int first = 0, second = 1;

      int n = sc.nextInt();
         System.out.print("The first" + n + "fibonacci numbers are:");
         
        for (int i=1; i<=n; ++i) {
        	
        	System.out.print(first + "");
        	int sum = first + second;
        	first=second;
        	second=sum;
        }
        
        }



//main method which contains switch and do while loop

    public static void main(String[] args) {

              Main obj = new Main();

              int choice;

              Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();



choice = sc.nextInt();

switch (choice) {



case 0:

choice = 0;

break;



case 1: {

obj.checkPalindrome();

}

break;



case 2: {



obj.printPattern();

}

break;



case 3: {

obj.checkPrimeNumber();

}

break;



case 4: {



obj.printFibonacciSeries();

}

break;



default:

System.out.println("Invalid choice. Enter a valid no.\n");

}



} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}



}
     
     
     

