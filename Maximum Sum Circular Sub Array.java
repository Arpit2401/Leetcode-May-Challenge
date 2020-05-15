/**
*Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.
*Here, a circular array means the end of the array connects to the beginning of the array.  
*(Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)
*Also, a subarray may only include each element of the fixed buffer A at most once.  
*(Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)
**/


class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int k=i,j=0;j<A.length;j++,k++)
            {
                if(k>=A.length)
                    k-=A.length;
                sum+=A[k];
                if(max<=sum)
                    max=sum;
            }
          } 
     return max;
    }
}
