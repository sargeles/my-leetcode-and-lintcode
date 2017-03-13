package algorithm;


public class Quick {
	public static void sort(int[] a,int start,int end) {
		if(start>=end)return;
			int i=start,j=end;
			boolean flag=false;//纪录是否有变化
			int key= a[start];//纪录中间值
			while(i<j){//判断传入区间大于1，即，非，单个数。
				while(i<j&&a[j] >= key)j--;//没有大于key的数
				if(i<j){a[i]=a[j];i++;flag=true;}//有大于key的数，if语句确保是上一个判断走了&&后面的部分
				while(i<j&&a[i] < key)i++;
				if(i<j){a[j]=a[i];j--;flag=true;}
			}
			a[i]=key;//这里i=j，a[j]=key也行
			show(a);
			if(flag)
			{sort(a,start,i-1);sort(a,i+1,end);} //这里也是i=j也行
		
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