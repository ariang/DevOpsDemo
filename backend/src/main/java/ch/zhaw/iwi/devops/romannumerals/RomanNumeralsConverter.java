package ch.zhaw.iwi.devops.romannumerals;

public class RomanNumeralsConverter {
    
    public String convertToRoman(int value) {
        if(value==1){
            return "I";
        }
        if(value==2){
            return "II";
        }
        if(value==3){
            return "III";
        }
        else{
            return "value not known";
        }
        }
}