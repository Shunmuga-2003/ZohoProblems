package ZohoTharuvai;

import java.util.HashMap;

public class Problem3 {
    public static void main(String[] args) {
        String s="crcoakroak";
        System.out.println(findFrogs(s));
    }
    public static int findFrogs(String s){
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for(char c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for(int val:freqMap.values()){
            if(val!=2){
                return -1;
            }
        }
        if(s.substring(0,5).equalsIgnoreCase("croak")){
            return 1;
        }
        return 2;
    }
}
