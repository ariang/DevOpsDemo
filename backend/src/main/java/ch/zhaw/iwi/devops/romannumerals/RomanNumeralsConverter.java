package ch.zhaw.iwi.devops.romannumerals;

public class RomanNumeralsConverter {
    
    public String convertToRoman(int value) {
        if(value==1){
            return "I";
        }
        else {
            return "value not known";
        }
        }
}
