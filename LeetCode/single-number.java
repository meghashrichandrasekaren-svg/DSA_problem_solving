class Solution {
    public int singleNumber(int[] a) {
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){

                    c=c+1;

                }
            }
           
            
             if(c==1){
                return a[i];
        }
        }
        return 0;
    }
}
