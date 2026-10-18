class Solution {
    public int scoreOfString(String s) {
        
        int sum=0;
        for(int i=0; i<s.length()-1; i++){
            sum+=Math.abs(getAscii(s.charAt(i))-getAscii(s.charAt(i+1)));
        }
        return sum;
    }
}

int getAscii(char c){
    return (int)c;
}