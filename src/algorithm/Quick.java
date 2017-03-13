package algorithm;


public class Quick {
	public static void sort(int[] a,int start,int end) {
		if(start>=end)return;
			int i=start,j=end;
			boolean flag=false;//��¼�Ƿ��б仯
			int key= a[start];//��¼�м�ֵ
			while(i<j){//�жϴ����������1�������ǣ���������
				while(i<j&&a[j] >= key)j--;//û�д���key����
				if(i<j){a[i]=a[j];i++;flag=true;}//�д���key������if���ȷ������һ���ж�����&&����Ĳ���
				while(i<j&&a[i] < key)i++;
				if(i<j){a[j]=a[i];j--;flag=true;}
			}
			a[i]=key;//����i=j��a[j]=keyҲ��
			show(a);
			if(flag)
			{sort(a,start,i-1);sort(a,i+1,end);} //����Ҳ��i=jҲ��
		
	}

	private static boolean less(int v, int w) {
		return v<w;
	}

/*	private static void exch(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}*/

	private static void show(int[] a) { // �ڵ����д�ӡ����
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static boolean isSorted(int[] a) { // ��������Ԫ���Ƿ���˳��
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}