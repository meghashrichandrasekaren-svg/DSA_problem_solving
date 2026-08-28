class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        i=len(a)-1
        j=len(b)-1

        carry=0
        res=""
        while i>=0 or j>=0 or carry:
            sum=carry
            if i>=0:
                sum+=int(a[i])
                i-=1
            if j>=0:
                sum+=int(b[j])
                j-=1    
            res+=str(sum%2)
            carry=sum//2

            
        return res[::-1]    
        
    
        
        
