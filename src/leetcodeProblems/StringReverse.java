package leetcodeProblems;

public class StringReverse {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
    public String reverseString(String s) {
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        return sb.substring(0,s.length());
    }
}

