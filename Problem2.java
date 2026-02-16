package ZohoTharuvai;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        String s="Keep calm and carry on";
        String [] arr = s.toLowerCase().split(" ");
        Arrays.sort(arr, (a,b) ->  a.length() - b.length());
        String ans = String.join(" ", arr);
        System.out.println( Character.toUpperCase(ans.charAt(0)) + ans.substring(1));

    }
}
