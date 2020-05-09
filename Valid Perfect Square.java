/**
*Given a positive integer num, write a function which returns True if num is a perfect square else False.
*Note: Do not use any built-in library function such as sqrt.
**/

//A number is a perfect square if it follows the pattern 1+3+5+7+9....

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1)
            return false;
        for(int i=1;num>0;i+=2)
        {
            num-=i;
        }
        return (num==0);
        
    }
}
