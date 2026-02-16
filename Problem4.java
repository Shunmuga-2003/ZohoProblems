package ZohoTharuvai;

public class Problem4 {
    public static void main(String[] args) {
       String s="aacceccaaa";
        System.out.println(shortestPalindrome(s));
    }
    public static String shortestPalindrome(String s){
        int left=0;
        for(int right=s.length()-1;right>=0;right--){
            if(s.charAt(right)==s.charAt(left)){
                left++;
            }
        }
        if(left==s.length()) return s;

        String nonpalindrome=s.substring(left);
        StringBuilder answer=new StringBuilder(nonpalindrome).reverse();
        return answer.append(shortestPalindrome(s.substring(0,left))).append(nonpalindrome).toString();
    }
}
