class Solution {
    public int reverse(int x) { 
        ArrayList<Integer> digits = new ArrayList<>();
        boolean isNeg = false;
        if (x < 0){       
            isNeg = true;
            x = -x;
        }           
        while (x > 0){       
            digits.add(x % 10);
            x = x / 10;
        } 
        long out = 0;
        for (int i = 0; i < digits.size(); i++){  
            out = out * 10;
            out += digits.get(i);
            if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE)   
                return 0;
        } 
        if (isNeg){ 
            out = -out;
        } 
        return (int)out; 
    }
}
