//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            int k = Integer.parseInt(br.readLine());
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function template for JAVA

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        int[]leftMax = new int[arr.length];
        int[]rightMax = new int[arr.length];
        leftMax[0] = arr[0];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=1;i<arr.length;++i){
            leftMax[i] = (i%k==0)?arr[i]:Math.max(leftMax[i-1],arr[i]);
            int j=arr.length-i-1;
            rightMax[j] = (j%k==0)?arr[j]:Math.max(rightMax[j+1],arr[j]);
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0;i<arr.length-k+1;++i){
            ans.add(Math.max(rightMax[i],leftMax[i+k-1]));
        }
        return ans;
    }
}