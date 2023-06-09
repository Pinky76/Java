import java.util.*;
public class StringImplementation {
    public int CountVowels(String s){
        int count = 0;
        char[] vowels = {'a','e','i','o','u'};
        System.out.println("Given String is "+s);
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public String isAnagramCheck(String s1, String s2){
        s1 = s1.replaceAll("\\s","");
        s2 = s2.replaceAll("\\s","");
        if(s1.length() != s2.length()){
            return s1+ " and " + s2 + " are not Anagrams";
        }
        else{
            char[] charString1 = s1.toCharArray();
            char[] charString2 = s2.toCharArray();
            Arrays.sort(charString1);
            Arrays.sort(charString2);
            if(String.valueOf(charString1).equalsIgnoreCase(String.valueOf(charString2))){
                return s1+ " and " + s2 + " are Anagrams";
            }
            else{
                return s1+ " and " + s2 + " are not Anagrams";
            }
        }
    }
    public String reverseWords(String s){
        String words[]=s.split("\\s");
        String reverseWord="";
        for(String s1:words){
            StringBuilder sb=new StringBuilder(s1);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }
    public boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3 = s1 + s1;
        System.out.println(s3);
        return s3.contains(s2);
    }
    public static void main(String[] args) {
    System.out.println("Method to check if the given a string, write a program to find number of vowels in that string.");
    StringImplementation sObj = new StringImplementation();
    System.out.println("Total Number of Vowels in the given String is "+sObj.CountVowels("Implementation") +"\n");
    System.out.println("Method to check if two strings are Anagram or not");
    System.out.println(sObj.isAnagramCheck("research","searcher"));
    System.out.println(sObj.isAnagramCheck("researc","searcher"));
    System.out.println(sObj.isAnagramCheck("a gentleman","elegant man") + "\n");
    System.out.println("Sentence is : \t Java J2EE Reverse Me");
    System.out.println("Reverse of each word in sentence is : \t"+ sObj.reverseWords("Java J2EE Reverse Me") + " \n");
    System.out.println("Method to check if one string is rotation of another string");
    if (sObj.checkRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee")) {
        System.out.println("Yes JavaJ2eeStrutsHibernate is rotation of StrutsHibernateJavaJ2ee" );
    } else {
        System.out.println("No StrutsHibernateJavaJ2ee is not rotation of JavaJ2eeStrutsHibernate");
    }
    }
}