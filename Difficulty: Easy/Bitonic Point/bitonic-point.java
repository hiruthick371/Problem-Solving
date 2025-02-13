//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findMaximum(arr);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        
        int[]prefix = new int[arr.length];
        int[]suffix = new int[arr.length];
        prefix[0] = 0;
        suffix[suffix.length-1] = 0;
        for(int i=1;i<arr.length;++i){
            if(arr[i]>arr[i-1]) prefix[i] = 1;
            else prefix[i] =0;
        }
        for(int i=arr.length-2;i>=0;--i){
            if(arr[i]>arr[i+1]) suffix[i] = 1;
            else suffix[i] = 0;
        }
        for(int i=0;i<arr.length;++i){
            if(prefix[i]==1 && suffix[i]==1){
                return arr[i];
            }
        }
        boolean asc = true;
        boolean desc = true;
        for(int i=0;i<arr.length;++i){
            if(prefix[i]!=0){
                asc = false;
            }
            if(suffix[i]!=0){
                desc = false;
            }
        }
        if(asc){
            return arr[0];
        }
        return arr[arr.length-1];
    }
}