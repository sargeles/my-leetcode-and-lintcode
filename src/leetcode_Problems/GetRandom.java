package leetcode_Problems;

import java.util.Random;

public class GetRandom {
	ListNode head;

	public GetRandom(ListNode head) {
		this.head = head;
	}

	public int getRandom() {
		Random rand = new Random();
		int val = head.val;
		ListNode cur = head;
		int count = 1;

		while ((cur = cur.next) != null) {
			if (rand.nextInt(++count) == 0)
				val = cur.val;
		}

		return val;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}