import java.util.*;
/*****List Implementation using Array***/
//to work generic we use that <>line number 4,98
class DynamicArray{
    static final int initialCapacity=16;//static + final(constant)variable
    //instance variable means values changes for each instance of object.
    //change or edit can be done only within this class not from outside the class
    private int arr[];
    private int size;
    private int capacity;
    //creating constructor,initailizing the values to the declared variables
    //constructor name always same as class name
    @SuppressWarnings("unchecked")
    DynamicArray()
    {
        size=0;
        arr= new int[initialCapacity];
        capacity=initialCapacity;
    }
    //creating a method add
    //to add data's in an array
    public void add(int val)
    {
        if(size==capacity) {
            expandArray();
        }
        //storing the value in the array size
        arr[size++]=val;
    }
    //to expand the capacity of the array using the java.util.arrays.copyof function
    private void expandArray(){
        capacity*=2;
        //to create a a new array with new size for the created array varaible
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public  void  display()
    {
        System.out.println("Elements in the list are: ");
        //creating loop to traverse the array til the size of array.
        for(int index=0;index<size;index++)
        {
            System.out.print(arr[index]+" ");
        }
    }
    //inserting at the given postion
    public void insertAtPostion(int pos,int val)
    {
        if(size==capacity)
            expandArray();
        //traversing from back
        for(int index=size-1;index>=pos;index--)
        {
            //storing the index value to its next position (shifting data)
            arr[index+1]=arr[index];
        }
        //now at the particular postion there is no data so updating with the given value
        arr[pos]=val;
        size++;
    }
    public void deleteElement(int pos){
        //using for loop nd deleting the value at the given postion
        for(int index=pos+1;index<size;index++)
        {
            arr[index-1]=arr[index];
        }
        size--;
        //if the size of the array is excess then we can shrink if the capacity is greater than initalcapacity and 3 times the size
        if(capacity>initialCapacity && capacity>3*size) {
            shrinkArray();
        }
    }
    public void shrinkArray(){
        capacity/=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void searchElemnt(int val)
    {
        //traverving the array and searching the given element in the array
        for(int index=0;index<size;index++)
        {
            if(arr[index]==val)
            {
                System.out.println("the given element is present in the array");
                break;
            }
            else {
                System.out.println("not present in the array");
                break;
            }
        }
    }
}
public class Arrays {
    public static void main(String[] args) {
        int val,pos;
        Scanner scan=new Scanner(System.in);
        //creating Object for the class DynamicArray
        DynamicArray list=new DynamicArray();
        while(true){
            System.out.println("\n-----list menu-------\n");
            System.out.println("\n1.Insert at End\n");
            System.out.println("\n2.Display the list\n");
            System.out.println("\n3.Insert at specific position\n");
            System.out.println("\n4.Delete from specific position\n");
            System.out.println("\n5.Search element\n");
            System.out.println("\n6.Exit--\n");
            System.out.println("\nEnter your choise:\t");
            //getting value
            int choice=scan.nextInt();
            //using switch case to do operation
            switch (choice)
            {
                //insert at end
                case 1:
                    System.out.println("Enter the element to insert: ");
                    val=scan.nextInt();
                    list.add(val);
                    break;
                //display the list
                case 2:
                    list.display();
                    break;
                //insert at specific postion
                case 3:
                    System.out.println("Enter the postion the element need to insert(postion stats at 0):");
                    pos = scan.nextInt();
                    //if user enter negative postions
                    if(pos<0)
                    {
                        System.out.println("Entered invalid position");
                        break;
                    }
                    System.out.println("Enter the element to insert: ");
                    val=scan.nextInt();
                    list.insertAtPostion(pos,val);
                    break;
                //
                case 4:
                    System.out.println("Enter the postion the element need to delete(postion stats at 0):");
                    pos = scan.nextInt();
                    if(pos<0)
                    {
                        System.out.println("Entered invalid position");
                        break;
                    }
                   list.deleteElement(pos);
                    break;
                case 5:
                    System.out.println("Enter the element need to search");
                    val=scan.nextInt();
                    list.searchElemnt(val);
                    break;
                //to exit from the program
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }






}
