package com;

import java.util.ArrayList;

public class LeaderInArray {

	 static ArrayList<Integer> leaders(int arr[], int n){
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        int size= arr.length;
	        
	         for(int i=0;i<size-2;i++){
	        	 int rightMax=0;
	           if(arr[i] >rightMax) {
	        	   rightMax = arr[i];
	            result.add(rightMax);	
	           }
	        }
	        result.add(arr[size-1]);
			return result;
	    }
	 
	 public static void main(String aa[]) {
		 int arr[] = { 1,2,3,4,5,1,3,2,4 };
			int n = arr.length;
			System.out.print("Equilibrium Index : ");
			System.out.println(LeaderInArray.leaders(arr, n));
			 }
}
