class Solution {
    public int romanToInt(String s) {
        String s1 = "IVXLCDM";
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int sum = 0;
        if (s.charAt(s.length() - 1) == 'I')
            sum = sum + I;
        else if (s.charAt(s.length() - 1) == 'V')
            sum = sum + V;
        else if (s.charAt(s.length() - 1) == 'X')
            sum = sum + X;
        else if (s.charAt(s.length() - 1) == 'L')
            sum = sum + L;
        else if (s.charAt(s.length() - 1) == 'C')
            sum = sum + C;
        else if (s.charAt(s.length() - 1) == 'D')
            sum = sum + D;
        else if (s.charAt(s.length() - 1) == 'M')
            sum = sum + M;

        for (int i = s.length() - 2; i >= 0; i--) {
            if (s1.indexOf(s.charAt(i)) < s1.indexOf(s.charAt(i + 1))) {
                if (s.charAt(i) == 'I')
                    sum = sum - I;
                else if (s.charAt(i) == 'V')
                    sum = sum - V;
                else if (s.charAt(i) == 'X')
                    sum = sum - X;
                else if (s.charAt(i) == 'L')
                    sum = sum - L;
                else if (s.charAt(i) == 'C')
                    sum = sum - C;
                else if (s.charAt(i) == 'D')
                    sum = sum - D;
                else if (s.charAt(i) == 'M')
                    sum = sum - M;
            }

            else {
                if (s.charAt(i) == 'I')
                    sum = sum + I;
                else if (s.charAt(i) == 'V')
                    sum = sum + V;
                else if (s.charAt(i) == 'X')
                    sum = sum + X;
                else if (s.charAt(i) == 'L')
                    sum = sum + L;
                else if (s.charAt(i) == 'C')
                    sum = sum + C;
                else if (s.charAt(i) == 'D')
                    sum = sum + D;
                else if (s.charAt(i) == 'M')
                    sum = sum + M;
            }
        }
        return sum;
    }
}