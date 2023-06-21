import java.util.*;
public class CharCount {
    public static void charCount(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++) {
            if(s.charAt(i)!=' ') {
                char c = s.charAt(i);
                map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
            }
        }
        map.forEach((key, value) -> System.out.print(key + " :: " + value+"\n"));
    }
    public static void main(String[] args) {
        String s = "test string";
        charCount(s);
    }
}
