//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result = new Solution().subsetSums(arr);
            Collections.sort(result);
            // Printing the result in space-separated format
            for (int i = 0; i < result.size(); i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();    // Print new line after each test case
            System.out.println("~"); // Print new line after each test case
        }
    }
}

// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int sum = 0;
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        subset(list,new ArrayList<Integer>(),arr,0);
      
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<list.size();++i){
            sum= 0;
            for(int j=0;j<list.get(i).size();++j){
                sum+=list.get(i).get(j);
            }
            ans.add(sum);
        }
        return ans;
    }
    private void subset(ArrayList<ArrayList<Integer>>list,List<Integer>li,int[]arr,int index){
        if(index>=arr.length){
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(arr[index]);
        subset(list,li,arr,index+1);
        li.remove(li.size()-1);
        subset(list,li,arr,index+1);
    }
}