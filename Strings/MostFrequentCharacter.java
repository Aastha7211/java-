package Strings;

import java.util.Arrays;

public class MostFrequentCharacter {
    public static char mostFrequent(String s){
        int maxFreq=-1;

        char ans =s.charAt(0);
        char[]arr=s.toCharArray();
        Arrays.sort(arr);
        int i=0;
        int j=0;
        int n=s.length();
        while(j<n) {

            if (arr[i] == arr[j]) {
                j++;
            } else {
                int freq = j - i;
                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
    int freq= j-i;
         if(freq>=maxFreq){
        freq=maxFreq;
        ans=arr[i];

    }

    return ans;
            }
            public static void main (String[] args){
        String s="aaaabbbbbbbc";
        //mostFrequent(s);
        System.out.print(mostFrequent(s));
            }
        }


