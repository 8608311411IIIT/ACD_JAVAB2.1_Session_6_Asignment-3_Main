/*binary search algorithm is very efficient when the list is in sorted order..In sorted order list time complexity of binary search algorithm is 
   O(logn). whereas for bubble sort algorithm time complexity is O(n)*/
import java.util.*;
class BinarySearch{
       int i;
       int []a=new int[100];//array declartion to store list of numbers
       Scanner sc=new Scanner(System.in);
      
          public void setData(int n){//this method takes data input from the user and store in the array
              int count,temp,j;
              System.out.println("Enter "+n+" numbers in ascending order ie..sorted list of numbers");
              for(i=0;i<n;i++)
                 a[i]=sc.nextInt();
        
            
      }

         public void binSearch(int n,int data){//this method checks whether data which u want to search is in  the list or not and thus give index no
              int beg=0,end=n-1,mid;
              while(beg<=end){
                   mid=(beg+end)/2;
                   if(data<a[mid])
                          end=mid-1;
                      
                       else if(data>a[mid])
                             beg=mid+1;

                           else if(data==a[mid]){//data found at index number mid
                                System.out.println("Data found at index no"+ mid);
                                return;
                           }
              }
              System.out.println("Data not found in the list");
         }
}

public class ProgBinSearch{

      public static void main(String []args){
            int n,data;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of data");
            n=sc.nextInt();//takes input as no of data u want to store
            BinarySearch bs=new BinarySearch();
            bs.setData(n);
            while(true){
                  int choice;
                  System.out.println("select choice   1.search   2.Exit");//option menu
                  choice=sc.nextInt();
                  if(choice==1){
                        System.out.println("Enter data which u want to search");
                        data=sc.nextInt(); 
                        bs.binSearch(n,data);
                  }

                     else if(choice==2)
                          System.exit(0);
                 
                         else//invalid choice
                            System.out.println("Invalid choice..choose correct option");   
            }
       }

}




