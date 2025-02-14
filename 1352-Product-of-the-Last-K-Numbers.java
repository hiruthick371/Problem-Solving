class ProductOfNumbers {
    ArrayList<Integer>list;
    public ProductOfNumbers(){
        list = new ArrayList<>();
    }    
    public void add(int num) {
        if(num==0) list.clear();
        else list.add(list.size()==0?num:list.get(list.size()-1)*num);
    }
    
    public int getProduct(int k) {
        if(k>list.size()) return 0;
        else if(k==list.size()) return list.get(list.size()-1);
        return list.get(list.size()-1)/list.get(list.size()-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */