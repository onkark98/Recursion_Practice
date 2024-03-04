package org.example;

public class ValidPalindrome {

    boolean f(char s[], int i, boolean flag)
    {
        if(i>s.length/2)
            return flag;

        if(s[i] != s[s.length-i-1])
            flag = false;
        return f(s, i+1,flag);
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        String str = "race car";
        str = str.replace(" ","");
        str = str.toLowerCase();
        //System.out.println(str);
        char[] s = str.toCharArray();
        int n = s.length;
        int i = 0;
        boolean flag = true;

        flag = obj.f(s,i, flag);
        System.out.println(flag);
        /*boolean flag = true;
        while(i<=n/2)
        {
            if(s[i] != s[n-i-1])
            {
                flag = false;
                break;
            }
            i++;
        }
        System.out.println(flag);*/
    }
}
