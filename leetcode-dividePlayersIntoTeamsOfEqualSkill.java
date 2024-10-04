class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left = 0;
        int right = skill.length-1;
        long sum = 0;
        long prod = 1;
        long tempsum = skill[right] + skill[left];
        while(left<=right){
            if(tempsum!=skill[right] + skill[left]) return -1;
            else tempsum = skill[right] + skill[left];
            prod=(skill[right]*skill[left]);
            sum+=prod;
            right--;
            left++;
        }
        return sum;
    }
}