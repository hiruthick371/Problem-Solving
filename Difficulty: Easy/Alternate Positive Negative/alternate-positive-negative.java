//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int posCount=0;
        int negCount=0;
        for(int num:arr){
            if(num>=0) posCount++;
            else negCount++;
        }
        int[]pos = new int[posCount];
        int[]neg = new int[negCount];
        int j=0,k=0;
        for(int i=0;i<arr.size();++i){
            if(arr.get(i)>=0){
                pos[j++] = arr.get(i);
            }
            else{
                neg[k++] = arr.get(i);
            }
        }
        int i = 0;
        j=0;
        k=0;
        while(j<posCount && k<negCount){
            arr.set(i++,pos[j++]);
            arr.set(i++,neg[k++]);
        }
        while(j<posCount){
            arr.set(i++,pos[j++]);
        }
        while(k<negCount){
            arr.set(i++,neg[k++]);
        }
       
      
    }
}