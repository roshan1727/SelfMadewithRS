/*
* -----single linked list------
*
*
* */
public class singleLinkedList {
            //defining the head and tail for the Node
            private Node head;
            private Node tail;

            //to maintain the size of the linkedlist
            private int size;
            //creating constructor for the singleLinkedList
            public   singleLinkedList(){
                //initializing the value of size
                    this.size=0;
            }
            //insert at beginning
            public void insertAtBegining(int val){
                Node newNode=new Node(val);
                newNode.next=head;//insert at begin
                head=newNode;

                //checking tail is NULL,if null then both the head and tail points the same node,traverse till end so that we can point to the last value as tail
                if(tail==null){
                    tail=head;
                }
                size+=1;
            }

            //insert at end
            public  void inserAtLast(int val){
                if(tail==null)
                {
                    insertAtBegining(val);
                    return;
                }
                Node newNode=new Node(val);
                tail.next=newNode;//insrt at end
                tail=newNode;
                size+=1;
            }
            //insert at a specific postion
            public void inser(int val,int index){
                //if at zeroth pos then call insertAtBegining method
                if(index==0){
                    insertAtBegining(val);
                    return;
                }
                //if at nth postion then call inserAtLast method
                if(index==size)
                {
                    inserAtLast(val);
                    return;
                }
                //traverse til the N-1 value using a temp reference variable
                Node temp=head;
                for(int indexx=1;indexx<index;indexx++)
                {
                    temp=temp.next;
                }
                //create a new Node to store the value of the given data
                Node newNode=new Node(val,temp.next);
                temp.next=newNode;
                size+=1;
            }

            //display the lnkedlist
            public  void display(){
                //creatinng a trmp variable to travers nd not to change the structure of the node
                //first the address of the head node will be shifted to temp variable
                Node temp=head;
                while (temp!=null)
                {

                    System.out.print(temp.data +"-> ");
                    temp=temp.next; //in the node part the next node addrress will be present so we need to assign that to the temp vaiable
                }
                System.out.println("END");
//                System.out.println(size);

            }



            //first creating a node
            //leeping everything in private
            private class Node{
                //node contains data (Integer type) && next(reference variable of type Node)
                private int data;
                private Node next;
            //creating constructor for the data part
            public Node(int data)
            {
                this.data=data;
            }
            //creating constructor for the data nd the node part
            public Node(int data,Node next){
                this.data=data;
                this.next=next;
            }
            }






}

