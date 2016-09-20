package algorithm;


public class Quick {
	public static void sort(int[] a,int start,int end) {
		if(start<end){
			int i=start,j=end;
			boolean flag=false;
			int key= a[start];
			while(i<j){
				while(i<j&&a[j] >= key)j--;
				if(i<j){a[i]=a[j];i++;flag=true;}
				while(i<j&&a[i] < key)i++;
				if(i<j){a[j]=a[i];j--;flag=true;}
			}
			a[i]=key;
			show(a);
			if(flag)
			{sort(a,start,i-1);sort(a,i+1,end);}
		}
	}

	private static boolean less(int v, int w) {
		return v<w;
	}

/*	private static void exch(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}*/

	private static void show(int[] a) { // 在单行中打印数组
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static boolean isSorted(int[] a) { // 测试数组元素是否有顺序
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}