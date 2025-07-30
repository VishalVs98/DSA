package Codes;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3};
       nextPermute(arr);
       System.out.println("Next Permutation is : ");
       for(int i=0;i<arr.length;i++) {
    	   System.out.print( arr[i]+" ");
       }
	}
	 public static  void nextPermute(int[] arr) {
	      int i=-1;
	      for(int j=arr.length-2;j>=0;j--){
	        if(arr[j]<arr[j+1]){
	            i=j;
	            break;
	        }
	      } 
	      if(i>=0){
	       for(int k=arr.length-1;k>=0;k--){
	        if(arr[k]>arr[i]){
	            int temp=arr[k];
	            arr[k]=arr[i];
	            arr[i]=temp;
	            break;
	        }
	      }
	      
	      int p=arr.length-1; 
	      int l=i+1;
	     while(l<p){
	        int temp=arr[l];
	            arr[l++]=arr[p];
	            arr[p--]=temp;
	            
	      
	    }
	      }
	      else{
	          for(int m=0;m<=(arr.length/2)-1;m++){
	            int t=arr[m];
	            arr[m]=arr[arr.length-m-1];
	            arr[arr.length-m-1]=t;
	          } 
	        }
	        
	     
	    }

}
