package algorithm;

public class AlgorithmExample {
	public static void sort(Comparable[] a) { // ����㷨2.1���㷨2.2���㷨2.3���㷨2.4���㷨2.5���㷨2.7

	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void show(Comparable[] a) { // �ڵ����д�ӡ����
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static boolean isSorted(Comparable[] a) { // ��������Ԫ���Ƿ���˳��
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}