class Solution {
    public boolean canAliceWin(int n) {
        int stones = 10;
        int who = 0;
        while(n>0){
            if(n<stones){
                return who==1;
            }
            who=1-who;
            n-=stones;
            stones--;
        }

    return who==1;
        
    }
}