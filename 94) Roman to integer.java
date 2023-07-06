import java.util.*;

public class Solution {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('M', 1000);
        romanNumerals.put('D', 500);
        romanNumerals.put('C', 100);
        romanNumerals.put('L', 50);
        romanNumerals.put('X', 10);
        romanNumerals.put('V', 5);
        romanNumerals.put('I', 1);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = romanNumerals.get(s.charAt(i));
            int nextValue = romanNumerals.get(s.charAt(i + 1));
            if (nextValue > value) {
                ans -= value;
            } else {
                ans += value;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}