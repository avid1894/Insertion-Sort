/*
 * Insertion sort of elements in an array (ascending order)
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author avid1894
 */
public class InsertionSort 

{
   //Function to shift and insert elements to result in a sorted array
    static int[] ShiftInsert(int[] temp,int poi, int right, int left)
    {
        for(int k=right;k>left; k--)
        {
            temp[k]=temp[k-1];
        }
        temp[left]=poi;
        
       System.out.println("Array after each sort is");
        for(int i=0; i<temp.length; i++)
        {
          System.out.print(temp[i] + " ");  
        }
        System.out.println();
        return temp;
        
    }
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scan.nextInt();
        int[]  arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
       int poi=0;
      
       for(int k=0;k<n;k++)
       { 
            for(int i=1; i<n; i++)
                  {
                      poi=arr[i];
                      for(int j=i-1;j>=0; j-- )
                         {
                            if(arr[i]>=arr[j])
                                 {
                    
                                    }
                              else
                   // if( poi<poj)
                             {
                             arr=ShiftInsert(arr,poi,i,j);
                             }
                         }
                    }
        }
        System.out.println("Array after final sorting is");
        for(int i=0; i<arr.length; i++)
        {
          System.out.print(arr[i] + " ");  
        }
        System.out.println();
        
}
}