package com.example.demo.service;



import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class PalindromeCheckImpl implements PalindromeCheck{
    Log logger = LogFactory.getLog(getClass());
    @Override
    public boolean isPalindrome(String text) {
        if(StringUtils.isNoneBlank(text)){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(text);
            StringBuilder reversedString = stringBuilder.reverse();
            logger.info(String.format("Reversed String:%s",reversedString.toString()));
            return text.equalsIgnoreCase(reversedString.toString());
        }
        return false;
    }
}
