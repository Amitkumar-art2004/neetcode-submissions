class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num : nums){
            if(num > 0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }
        int n1 = pos.size();
        int n2 = neg.size();
        for(int i=0;i<n1;i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }
        for(int i =0;i<n2;i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[n1 + n2];
        while(i < n1 && j < n2){
            if(pos.get(i) <= neg.get(j)){
                ans[k++] = pos.get(i++);
            }else{
                ans[k++] = neg.get(j++);
            }
        }
        while(i<n1){
            ans[k++] = pos.get(i++);
        }
        while(j <n2){
            ans[k++] = neg.get(j++);
        }
        return ans;
    }
}