package leetcode_Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReconstructQueue {
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] != o2[0] ? -o1[0] + o2[0] : o1[1] - o2[1];
			}
		});
		List<int[]> list = new LinkedList<int[]>();
		for(int[] ii:people)
			list.add(ii[1],ii);
		return list.toArray(new int[people.length][]);
	}
}
