/**
*Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
*Note:
*The length of num is less than 10002 and will be ≥ k.
*The given num does not contain any leading zero.
**/

class Solution {
    String res="";
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";

        StringBuilder sb = new StringBuilder(num);

        for (int j = 0; j < k; j++) {
            int i = 0;
            while (i < sb.length() - 1 && sb.charAt(i) <= sb.charAt(i + 1)) {
                i++;
            }
            sb.delete(i, i + 1);
        }

            while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.delete(0, 1);

        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    } 
}
