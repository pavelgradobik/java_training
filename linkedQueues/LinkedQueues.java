package linkedQueues;

public class LinkedQueues implements Queues {

	private Node head = null;
	private Node tail = null;

	@Override
	public void enqueue(Object itemToInsert) {
		// TODO Auto-generated method stub
		Node newNode = new Node(itemToInsert, null);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;

	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		Object itemToInsert = head.data;
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return itemToInsert;
	}

	@Override
	public Object peek() {
		return head.data;
	}

	@Override
	public int size() {
		int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
	}

	
	@Override
	public boolean isEmpty() {
		return head == null;
	}
	
	public String toString() {
        StringBuilder s = new StringBuilder();
        
        for (Node node = head; node != null; node = node.next){
            s.append(head + " ");
            
            }
        return s.toString();
    }
}
