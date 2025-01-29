//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String>list = new ArrayList<>();
        generate(list,s.toCharArray(),0);
        return list;
    }
    private static void generate(ArrayList<String>list,char[]arr,int index){
        if(index==arr.length){
            String ans="";
            for(int i=0;i<arr.length;++i){
                ans+=arr[i];
            }
            list.add(ans);
            return ;
        }
        for(int i=index;i<arr.length;++i){
            int j;
            for(j = index;j<arr.length;++j){
                if(arr[i]==arr[j]) break;
            }
            if(j!=i) continue;
            swap(arr,index,i);
            generate(list,arr,index+1);
            swap(arr,index,i);
        }
    }
    private static void swap(char[] arr,int index,int i){
        
        char temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}