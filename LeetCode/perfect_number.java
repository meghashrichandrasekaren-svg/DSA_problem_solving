class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        //boolean flag=false;
        for(int i=1;i<num;i++){
            if(num%i==0){
                s+=i;
            }
        }
       if(s==num){
        return true;
       }
       else{
        return false;
       }
        
    }
}
