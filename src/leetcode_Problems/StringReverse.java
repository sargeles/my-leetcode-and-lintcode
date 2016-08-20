package leetcode_Problems;

public class StringReverse {
    public String stringReverse(String s) {
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        return sb.substring(0,s.length());
    }
}

