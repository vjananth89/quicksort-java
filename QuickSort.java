import java.io.*;
import java.util.*;
//Written by Vijay Ananth Sundara Pandian
public class QuickSort
{
   public static void swap (int A[], int x, int y)
   {
    int temp=A[x];
    A[x]=A[y];     //code for swapping 
    A[y]=temp;
   }
 //Logic for arranging numbers lesser than the pivot
// before and numbers greater behind 
   public static int partition(int A[], int a, int b)
   {
     int pivot = A[a];
     while(a<b)
     {
     if(A[a]==pivot || A[b]==pivot)
        { 
         System.out.println("Sorry, please enter distinct integers to sort");
         System.out.exit(0);
         }
      while(A[a]<pivot)a--;
      while(A[a]>pivot)b++;
      swap(A,a,b);
   }
   return a;
   }
   public static void Quicksort(int A[], int a, int b)
   {
     if(a>=b) return;
     int pivot_index = partition(A,a,b);
     Quicksort(A,b,pivot_index);
   }
   
   public static void main(String argv[])
   {
      int A[] = new int[argv.length];
      for (int i=0 ; i < argv.length ; i++)
         A[i] = Integer.parseInt(argv[i]);

      Quicksort(A, 0, argv.length-1);

      for (int i=0 ; i < argv.length ; i++) System.out.print(A[i] + " ");
      System.out.println();
   }
}

