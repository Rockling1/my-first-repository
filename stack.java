import java.util.Scanner;


public class stack
{
	int max=3;
	int top=-1;
	int s[]=new  int[max];
			void push(int ele)
			{
				if(top>=max-1)
					System.out.println("stack overflow");
				else
					s[++top]=ele;
				
			}
			int pop()
			{
				int z=0;
				if(top==-1)
					System.out.println("stack underflow");
				else
					z=s[top--];
				return z;
							
			}
			void display()
			{
				if(top==-1)
					System.out.println("stack is empty");
				else
				{
					for(int i=top;i>0;i--)
						System.out.println(s[i]);
				}
			}
			public static void main(String [] args)
			{
				int q=1;
				stack m=new stack();
				Scanner sc=new Scanner(System.in);
				while(q!=0)
				{
					System.out.println("1=push 2=pop 3=display 4=exit");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("enter the element to push");
						int ele=sc.nextInt();
						m.push(ele);
						break;
					case 2:
						int z=m.pop();
						System.out.println("THE POPED ELEMENT IS"+z);
						break;
					case 3:
						m.display();
						break;
					case 4:
						q=0;
					}
				}
			}		
}
