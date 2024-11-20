public class QueueData {
    public static void main(String[] args) {
        
    }
}
class QueueData{
    int capacity;
    int front;
    int rear;
    int currentSize;
    int queueArr[];

QueueData(int capacity){
    this.capacity= capacity;
    front=0;
    rear=-1;
    queueArr= new queueArr[this.capacity];

    }
    public bollean isFull(){
        if(currentSize ==capacity){
        System.out.println("Empty");
        return-1;
        }
        return queueArr[front];
    }
    //add data to arr/ enqueue
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Full");

        }
        else{
            rear++;
            if(rear== capacity-1){
                rear=0;
            }
                queueArrArr[rear]=data;
                currentSize ++;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return-1;

        }
        else{
            front ++;
            currentSize --;
            if(fron ==capaity -1){
                return queueArr[front -1];
                
                }
                else{
                    return queueArr[front -1];

                }
                }
            }
        }
    