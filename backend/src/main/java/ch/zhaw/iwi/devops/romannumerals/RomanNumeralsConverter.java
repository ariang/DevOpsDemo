package ch.zhaw.iwi.devops.romannumerals;
import java.util.LinkedHashMap;  
import java.util.Map;  

public class RomanNumeralsConverter {

    public String convertToRoman(int value) {
        
        LinkedHashMap<String, Integer> romanNumerals = new LinkedHashMap<String, Integer>();  
        //storing roman letters and corresponding decimal values in HashMap  
        romanNumerals.put("M", 1000);  
        romanNumerals.put("CM", 900);  
        romanNumerals.put("D", 500);  
        romanNumerals.put("CD", 400);  
        romanNumerals.put("C", 100);  
        romanNumerals.put("XC", 90);  
        romanNumerals.put("L", 50);  
        romanNumerals.put("XL", 40);  
        romanNumerals.put("X", 10);  
        romanNumerals.put("IX", 9);  
        romanNumerals.put("V", 5);  
        romanNumerals.put("IV", 4);  
        romanNumerals.put("I", 1);  

        //variable for string the result  
        String result = "";  

        //loop iterate over Map  
        for(Map.Entry<String, Integer> entry : romanNumerals.entrySet())  
        {  
        int matches = value/entry.getValue();  
        result = result+repeat(entry.getKey(), matches);  
        value = value % entry.getValue();  
        }  
        return result;  
        }  


        public static String repeat(String s, int n)   
        {  
            if(s == null)   
        {  
        return null;  
        }  

        final StringBuilder sb = new StringBuilder();  

        for(int i = 0; i < n; i++)   
        {  
            sb.append(s);  
        }  
        //converts into string  
        return sb.toString();  
        }  

}
