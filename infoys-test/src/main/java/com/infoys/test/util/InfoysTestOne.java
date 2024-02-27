package com.infoys.test.util;


import java.util.HashMap;

public class InfoysTestOne {

    public static void printChar(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        String result = str;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 如果字符已经在HashMap中，则将其次数加1，否则初始化为1
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            if (charCountMap.get(ch) == 3) {
                StringBuilder tmp = new StringBuilder();
                tmp.append(ch);
                result = result.replace(tmp.toString(), "");
                System.out.println(result);
            }
        }
    }

}
