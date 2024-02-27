package com.infoys.test.util;


import java.util.HashMap;

public class InfoysTestTwo {

    public static void printChar(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); ) {
            char ch = str.charAt(i);
            // 如果字符已经在HashMap中，则将其次数加1，否则初始化为1
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            if (charCountMap.get(ch) == 3) {
                int lastAsciiCode = Integer.valueOf(ch) - 1;
                char letter = (char) lastAsciiCode;
                StringBuilder tmp = new StringBuilder();
                for (int j = 0; j < 3; j++) {
                    tmp.append(ch);
                }
                if (Character.isLetter(letter)) {
                    str = str.replace(tmp.toString(), String.valueOf(letter));
                } else {
                    str = str.replace(tmp.toString(), "");
                }
                i = 0;
                charCountMap = new HashMap<>();
                System.out.println(str);
            } else {
                i++;
            }
        }
    }

}
