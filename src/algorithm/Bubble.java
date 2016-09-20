package algorithm;

public class Bubble {
	public static void sort(Comparable[] a) { 
		int flag;
		for(int i=0;i<a.length-1;i++){
			flag=0;
			for(int j=0;j<a.length-i-1;j++)
				if(less(a[j+1],a[j]))
					{exch(a,j,j+1);flag=1;show(a);}
			if(flag==0)
				break;
			}
					
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void show(Comparable[] a) { // 在单行中打印数组
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static boolean isSorted(Comparable[] a) { // 测试数组元素是否有顺序
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}