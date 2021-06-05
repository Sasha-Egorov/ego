package com.HW_25_TTD;

public class RomanNumerals {

    public String solution(int n) {
        String s="";
        for(int i=0; n!=0;i++){
            while(n/1000!=0){
                n=n-1000;
                s=s+"M";
            }

            while(n/900!=0){
                n=n-900;
                s=s+"CM";
            }
            while(n/500!=0){
                n=n-500;
                s=s+"D";
            }
            while(n/400!=0){
                n=n-400;
                s=s+"CD";
            }
            while(n/100!=0){
                n=n-100;
                s=s+"C";
            }
            while(n/90!=0){
                n=n-90;
                s=s+"XC";
            }
            while(n/50!=0){
                n=n-50;
                s=s+"L";
            }
            while(n/40!=0){
                n=n-40;
                s=s+"XL";
            }
            while(n/10!=0){
                n=n-10;
                s=s+"X";
            }
            while(n/9!=0){
                n=n-9;
                s=s+"IX";
            }
            while(n/5!=0){
                n=n-5;
                s=s+"V";
            }
            while(n/4!=0){
                n=n-4;
                s=s+"IV";
            }
            while(n/1!=0){
                n=n-1;
                s=s+"I";
            }

        }
        return s;
    }
}