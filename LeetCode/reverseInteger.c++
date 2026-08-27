class Solution {
public:

    int reverse(int x) {
        int rev = 0; 
        while (x != 0) {
            int digit=x%10;
            
            // Check for overflow/underflow before updating ans
            if ((rev > INT_MAX / 10) || (rev < INT_MIN / 10)) {
                return 0; // Return 0 if reversing x would cause overflow/underflow
            }
            
            rev = rev * 10 + digit; // Append the digit to the reversed number
            x = x / 10; // Remove the last digit from x
        }
        return rev; // Return the reversed number
    }
};
    
