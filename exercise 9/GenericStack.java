// 3.Program to create a generic stack and do the Push and Pop operations.

import java.util.*;

class Stack<T> 
{									
	ArrayList<T> elements;
	Stack(int capacity )
	{
		elements = new ArrayList<T>(capacity);  
	}
	void push( T element)		 //to push element						
	{
		elements.add(element);
	}
	T pop()	                        // to pop last eneterd element
	{
		return elements.remove(elements.size()-1);				
	}
         public void display(){
    
            System.out.println("STACK: " + elements);
        }
}

class GenericStack
{
public static void main(String [] args)
{
  int size,top=-1,ch,n;
  Scanner sn=new Scanner(System.in);
  System.out.print("Enter size of stack:");
  size=sn.nextInt();
  Stack<Integer> stack=new Stack<Integer>(size); 

  System.out.println("OPTIONS:");       
  System.out.println("***********");
  System.out.println("1.PUSH");
  System.out.println("2.POP");
  System.out.println("3.EXIT\n");
  System.out.println("Select your option:");
  ch=sn.nextInt();

  while(ch!=3)
  {
    switch(ch)
    {
      case 1:
             if(top>=(size-1))
             {
               System.out.println("Stack is full!!");
             }
             else
             {
               System.out.print("enter element:");
               n=sn.nextInt();
               stack.push(n);
               System.out.println("inserted successfully!\n");
               top++;
             }
             stack.display();
             break;
      case 2:
            if(top<=-1)
            {
               System.out.println("stack is empty\n");
            }
            else
            {
              stack.pop();
              System.out.println("element Removed..\n");
              top--;
            }
            stack.display();
            break;

    default:
          System.out.println("wrong option!!!\n");
    }
  System.out.println("\nenter the option:");
  ch=sn.nextInt();
  }  
}
}

/*
------------output---------------

C:\Users\USER\java_pgms\exercise 9>java GenericStack

Enter size of stack:4
OPTIONS:
***********
1.PUSH
2.POP
3.EXIT

Select your option:
1
enter element:10
inserted successfully!

STACK: [10]

enter the option:
1
enter element:20
inserted successfully!

STACK: [10, 20]

enter the option:
1
enter element:30
inserted successfully!

STACK: [10, 20, 30]

enter the option:
1
enter element:40
inserted successfully!

STACK: [10, 20, 30, 40]

enter the option:
1
Stack is full!!
STACK: [10, 20, 30, 40]

enter the option:
2
element Removed..

STACK: [10, 20, 30]

enter the option:
2
element Removed..

STACK: [10, 20]

enter the option:
2
element Removed..

STACK: [10]

enter the option:
2
element Removed..

STACK: []

enter the option:
2
stack is empty

STACK: []

enter the option:
3
*/
















