package Data_Structures.LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode convertArrayToList(int[] arr) {
          ListNode dummy = new ListNode();
          ListNode current = dummy;
          for (int i : arr) {
              current.next = new ListNode(i);
              current = current.next;
          }
          return dummy.next;
    }
    public static void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class Leetcode_21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
            return list1 == null ? list2 : list1;
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};
        ListNode l1 = ListNode.convertArrayToList(arr1);
        ListNode l2 = ListNode.convertArrayToList(arr2);

        ListNode.printListNode(mergeTwoLists(l1,l2));

    }
}
