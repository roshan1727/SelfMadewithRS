import java.util.*;
/*****List Implementation using Array***/

class DynamicArray{
    static final int initialCapacity=16;//static + final(constant)variable
    //instance variable means values changes for each instance of object.
    //change or edit can be done only within this class not from outside the class
    private int arr[];
    private int size;
    private int capacity;
    //creating constructor
    DynamicArray()
    {
        size=0;
        arr=new int[initialCapacity];
        capacity=initialCapacity;
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
            System.out.println("\n5.Exit--\n");
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
                //to exit from the program
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");


            }

        }

    }






}
