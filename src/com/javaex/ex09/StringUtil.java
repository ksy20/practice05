package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       String result="" ;//문자열 더할떈 이렇게
       
       for (int i=0; i<strArray.length; i++) {
    	   result = result+strArray[i];
       }
    	return result;
        //메소드 내용작성
    	
    	
        
    }

}
