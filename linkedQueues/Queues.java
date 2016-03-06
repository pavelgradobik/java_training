package linkedQueues;

public interface Queues {
	
	void enqueue (Object itemToInsert); // элемент в конец очереди
	Object dequeue(); // удаление первого элемента 
	Object peek();  // возврат первого элемента без извлечения
	int size(); // размер кол-во элементов
	
	boolean isEmpty(); // пустая или нет
	

}
