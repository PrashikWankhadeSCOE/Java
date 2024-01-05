import java.util.Scanner;

class CircularQueue{	
	int front = -1;
	int rear = -1;
	int maxSize;
	int arr[];
	CircularQueue(int size){
		maxSize = size;
		arr = new int[size];
	}

	void enqueue(int data){
		if(((front == 0) && (rear == maxSize-1)) || ((rear+1)%maxSize == front)){
			System.out.println("Queue full");
			return;
		}
		else if(front == -1){
			front = rear = 0;
		}
		else if(front!=0 && rear == maxSize -1){
			rear = 0;
		}
		else {
			rear++;
		}
		arr[rear] = data;
	}
	int dequeue(){
		if(front == -1){
			System.out.println("Queue is empty ");
			return -1;
		}
		else{
			int ret = arr[front];
			if(front == rear){
				front = rear = -1;
			}
			else if(front == maxSize-1){
				front = 0;
			}
			else{
				front++;
			}
			return ret;
		}
	}
	void printall(){
		if(front == -1){
			System.out.println("String is empty");
			return;
		}
		if(front<rear){
			for(int i = front;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}
		}
		else{
			for(int i = front;i<maxSize;i++){
				System.out.print(arr[i]+" ");
			}
			for(int i = 0;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();

		CircularQueue cq = new CircularQueue(size);

		char ch;
		do{	
			System.out.println("Chose from below ");
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.printall");

			int choice = sc.nextInt();

			switch(choice){
				case 1 : 
					{
					System.out.println("Enter the data you want to push ");
					int data = sc.nextInt();
					cq.enqueue(data);
					break;
				}	
				case 2 :
					{
					int x = cq.dequeue();
					if(x!=-1)
						System.out.println(x+" popped");
					break;
				}
				case 3 :
					{
					cq.printall();
					break;
				}
				default :
					{
					System.out.println("Wrong input given ");
					break;
				}
			}
			System.out.println("Do you wannt to continue ? ");
			ch = sc.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}
}
