/*
 * methods of Queue
 * Implementing Queue using array
 *
 */

import java.util.Scanner;

class Queue{
	int front = -1;
	int rear = -1;
	int [] queueArr;
	int maxSize;

	Queue(int size){
		queueArr = new int [size];
		maxSize = size;
	}

	void enqueue(int data){
		if(rear == maxSize-1){
			System.out.println("Queue is full");
			return ;
		}
		if(rear == -1){
			front++;
			rear++;
		}	
		else{
			rear++;
		}
		queueArr[rear] = data;
	}
	int dequeue(){
		if(front == -1){
			System.out.println("Queue is Empty ");
			return -1;
		}
		else if(front>rear){
			front = rear = -1;
			System.out.println("Queue is empty ");
			return -1;
		}
		return queueArr[front++];
	}
	boolean empty(){
		if(front == -1)
			return true;
		return false;
	}
	int front(){
		if(front == -1){
			System.out.println("Queue is empty ");
			return -1;
		}
		return queueArr[front];
	}
	int rear(){
		if(rear == -1){
			System.out.println("Queue is Empty ");
			return -1;
		}
		return queueArr[rear];
	}
	void printQueue(){
		for(int i = front; i <= rear;i++){
			System.out.print(queueArr[i]+" ");
		}
	}
}

class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array !");
		int size = sc.nextInt();

		Queue q = new Queue(size);

		char repeat;

		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.print");

			int choice = sc.nextInt();

			switch(choice){
				case 1 :
					{
						System.out.println("Enter the data you want add to queue ");
						int data = sc.nextInt();
						q.enqueue(data);
					}
					break;
				case 2 :
                                        {
						int ret = q.dequeue();
						if(ret!=-1)
							System.out.println(ret + "Popped ");
                                        }
                                        break;
				case 3 :
                                        {
						boolean ret = q.empty();
						if(ret)
							System.out.println("Queue is Empty");
						else
							System.out.println("Queue is not empty ");
                                        }
                                        break;
				case 4 :
                                        {
						System.out.println(q.front());
                                        }
                                        break;
				case 5 :
                                        {
						System.out.println(q.rear());
                                        }
                                        break;
				case 6 :
                                        {
						q.printQueue();
                                        }
                                        break;
				default:
					{
						System.out.println("Please enter valid option");
					}
			}
			
			System.out.println("Do you want to continue ??");
			repeat = sc.next().charAt(0);

		}while(repeat == 'y' || repeat == 'Y');
	}
}
