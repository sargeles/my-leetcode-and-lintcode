package leetcodeProblems;

public class ProblemTest {
	public static void main(String[] args){
		int[] a={1,5,8,7,4,9,6,3,2,1,2,3,6,5,4,7,8};
		Single_Number sn=new Single_Number();
		int i=sn.singleNumber(a);
		System.out.print(i);
	}
}