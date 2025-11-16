import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int i=0;
        int rev=0;
        while (i<num) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
if (temp==rev){
     System.out.println("Palindrome");
        }
else{
    System.out.println("not palindrome");
}
    }}*/




      /*  Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        int digit;
        for(int i=0;i<=num;i++){
        digit = num%10;
        sum=sum+digit;
        num/=10;
        }
        System.out.println(sum);
    }} */

    /*    Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int i=0;
        int rev=0;
        while (i<num) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev);}}  */

/* Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
for(int i=num;i>0;i--){
    for(int j=0;j<i;j++){
       System.out.print("*");}

       System.out.println();
        }}} */

      /*  Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");}

            System.out.println();
        }}}   */
    /* int rows=3;
    int cols=5;
    for (int i=1;i<=rows;i++){
    for (int j=1;j<=cols;j++){
        if( i==j || i+j==cols + 1)
        {System.out.print("* ");
    }
        else
            System.out.print(" ");}
    System.out.println();}}} */

    /* Q)   remove all vowels from string and replace them with zeros
     Scanner sc=new Scanner(System.in);
     String str= sc.nextLine();
      String stri =str.replaceAll("[AEIOUaeiou]","0");
     System.out.println(stri);}}  */

    //(with condition using charat mathod)

  /*  Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
    String result=" ";
    for(int i=0;i<=str.length()-1;i++){
        char ch=str.charAt(i);
        if(ch=='A' || ch=='E' || ch=='I' ||  ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            result = result + "0";
        }
        else{
            result += ch;
        }
    }System.out.println(result);}}*/
// Q) a program to count all the words in a sentence.
// Q) count the frequency of each charater in a string.
// Q) remove duplicate characters frm a string.

//Q) MAXIMUM DIFFERNECE IN AN ARRAY.
 /*Scanner sc= new Scanner(System.in);
 int n=sc.nextInt();
   int[] arr= new int[n];


        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
 for(int i=0;i<n;i++){
     if(arr[i]>max){
         max=arr[i];}}

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];}}
        int diff=max-min;
        System.out.println(diff);
        }
      }  */
// Q) TAKE 0 at random index and shift it at rightmost position in an array. ((DOUBT))
     /* Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];

  for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
  int pos=0;
  for(int i=0;i<n;i++){
      if(arr[i]!=0){
          arr[pos]=arr[i];
          pos++;
      }}
      while(pos<n){
          arr[pos]=0;
          pos++;
      }
      for(int num:arr){
      System.out.println(Arrays.toString(arr));
  }}}*/
    // Q) Kth largest elemenet in an array
       /* Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();}

           Arrays.sort(arr);   // we have to import Arrays too for this metgod to work
        int klargest= arr[n-k];
        System.out.println(klargest);}} */




