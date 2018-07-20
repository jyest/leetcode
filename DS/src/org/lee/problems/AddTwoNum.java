package org.lee.problems;

public class AddTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNum an = new AddTwoNum();
		an.test();
		
		ListNode nodeA0 = new ListNode(2);
		ListNode nodeA1 = new ListNode(4);
		ListNode nodeA2 = new ListNode(3);
		
		nodeA0.next = nodeA1;
		nodeA1.next = nodeA2;
		
		ListNode nodeB0 = new ListNode(5);
		ListNode nodeB1 = new ListNode(6);
		//ListNode nodeB2 = new ListNode(4);
		
		nodeB0.next = nodeB1;
		//nodeB1.next = nodeB2;
		
		ListNode result = an.addTwoNumbers(nodeA0, nodeB0);
		
		ListNode currentNode = result;
		while (currentNode!=null) {
			System.out.println(currentNode.val);
			currentNode = currentNode.next;
		}
		
	
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummpyHead = new ListNode(0);
        ListNode currentNode = dummpyHead;
        
        boolean carryOverToNextNode = false;
        
        
        while ( ( (l1!=null)||(l2!=null) )  ||  carryOverToNextNode == true){
            
            int l1Num = (l1==null) ? 0: l1.val;
            int l2Num = (l2==null) ? 0: l2.val;
            
            int sum = carryOverToNextNode? (l1Num + l2Num+1):  (l1Num + l2Num);
            if (sum>9){
                carryOverToNextNode = true;
                sum = sum - 10;
            }else{
                carryOverToNextNode = false;
            }
            
            currentNode.next = new ListNode(sum);
            currentNode = currentNode.next;
            
            l1 = l1==null? null:l1.next;
            l2 = l2==null? null:l2.next;
 
        }
        
        return dummpyHead.next;
        
    }
    
    
	
	void test() {
		ListNode node0 = new ListNode(7);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(5);
		
		node0.next = node1;
		node1.next = node2;
		
		//System.out.println(node0.val);
		//System.out.println(node0.next);
		//System.out.println(node0.val);
	}
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; } 
	}
}


