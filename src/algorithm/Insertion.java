package algorithm;

public class Insertion {
	public static void sort(Comparable[] a) { // 请见算法2.1、算法2.2、算法2.3、算法2.4、算法2.5或算法2.7
		int N = a.length;
		for (int i = 1; i < N; i++) { // 将 a[i] 插入到 a[i-1]、a[i-2]、a[i-3]...之中
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
				{exch(a, j, j - 1);show(a);}
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