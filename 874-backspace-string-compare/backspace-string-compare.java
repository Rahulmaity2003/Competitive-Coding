class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !s1.empty()) {
                s1.pop();
            } else if (s.charAt(i) != '#') {
                s1.push(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && !s2.empty()) {
                s2.pop();
            } else if (t.charAt(i) != '#') {
                s2.push(t.charAt(i));
            }
        }
        while (!s1.empty()) {
            str1 += s1.pop();
        }
        while (!s2.empty()) {
            str2 += s2.pop();
        }
        return str1.equals(str2);
    }
}