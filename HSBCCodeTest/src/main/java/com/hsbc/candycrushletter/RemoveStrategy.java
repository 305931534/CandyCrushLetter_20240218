package com.hsbc.candycrushletter;

import static com.hsbc.candycrushletter.common.count_num;

/**
 * using Dynamic Programming to solve the problem.
 * characters are identical, remove them from the string.
 */
public class RemoveStrategy implements BaseStrategy {
    @Override
    public String eliminate(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int eliminate_num;
        for (int i = 0; i < stringBuffer.length(); i++) {
            eliminate_num = count_num(stringBuffer, stringBuffer.charAt(i), i);
            if (eliminate_num >= 3) {
                while (eliminate_num >= 1) {
                    stringBuffer.deleteCharAt(i);
                    eliminate_num--;
                }
                break;
            }
        }
        return stringBuffer.length() == str.length() ? stringBuffer.toString() : eliminate(stringBuffer.toString());
    }
}
