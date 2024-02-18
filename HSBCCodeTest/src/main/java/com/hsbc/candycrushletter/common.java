package com.hsbc.candycrushletter;

public class common {
    public static Integer count_num(StringBuffer str,char s,int p){
        int length=str.length();
        int num=1;
        for(int i=p+1;i<length;i++){
            if(s==str.charAt(i)) num++;
            else break;
        }
        return num;
    }

}
