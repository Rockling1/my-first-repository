
import java.util.*;
public class student
{
	String NAME;
	String USN;
	int SEM;
	int CONTACT_NO;
	String DEPT;
	void insertrecord(String name,String usn, int sem,int contact_no,String dept)
	{
		NAME=name;
		USN=usn;
		SEM=sem;
		CONTACT_NO=contact_no;
		DEPT=dept;
		
	}
	
		void displayrecord()
		{
			System.out.println("name="+NAME+"usn="+USN+"sem="+SEM+"contact_no="+CONTACT_NO+"dept="+DEPT);
			
		}
		public static void main(String[]args)
		{
			student s[]=new student[100];
					Scanner sc=new Scanner(System.in);
			System.out.println("enter the value n");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
				s[i]=new student();
			for(int i=0;i<n;i++)
			{
				System.out.println("enter name,usn,sem,contact_no,dept");
				String name=sc.next();
				String usn=sc.next();
				int sem=sc.nextInt();
				int contact_no=sc.nextInt();
				String dept=sc.next();
				s[i].insertrecord(name,usn,sem,contact_no,dept);
			}
			for(int i=0;i<n;i++)
				s[i].displayrecord();
		}
}
