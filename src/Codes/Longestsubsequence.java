package Codes;

import java.util.HashSet;
import java.util.Set;

public class Longestsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5,11,21,22,23,24,25,26,27,28,29};
        System.out.println("Longest Subsequence is : "+longestConsecutive(arr));
	}
	public  static int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer> st=new HashSet<>();
        int longest=1;
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(int k:st){
            if(!st.contains(k-1)){
                int count=1;
                int x=k;
            
            while(st.contains(x+1)){
                x=x+1;
                count=count+1;
            }
            
            longest=Math.max(longest,count);
        }
        }
        return longest;
    }

}
