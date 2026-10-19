class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 ==1) return false;

        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) st.push(c);
            else if(!st.isEmpty() && map.get(st.peek()) == c) st.pop();
            else return false;
        }

        return st.size()==0;

    }
}
