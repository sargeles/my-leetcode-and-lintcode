package algorithm;

public class Selection {
	public static void sort(Comparable[] a) { // ��a[]����������
		int N = a.length; // ���鳤��
		for (int i = 0; i < N; i++) { // ��a[i]��a[i+1..N]����С��Ԫ�ؽ���
			int min = i; // ��СԪ�ص�����
			for (int j = i + 1; j < N; j++)
				if (less(a[j], a[min]))
					min = j;
			{exch(a, i, min);show(a);}
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