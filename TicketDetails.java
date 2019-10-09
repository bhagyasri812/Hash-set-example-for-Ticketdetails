import java.util.*;
class Ticket{
	String namea;
	int daya;

	public Ticket(String namea,int daya) {
		this.namea=namea;
		this.daya=daya;
		
	}
	
}
public class TicketDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 HashSet<Ticket> set=new HashSet<Ticket>();
		System.out.println("enter no. of adult passengers");
		int A=sc.nextInt();
		for(int i=0;i<A;i++) {
			System.out.println("enter name");
			String namea=sc.next();
			System.out.println("enter no. of days");
			int daya=sc.nextInt();
			Ticket t=new Ticket(namea,daya);
			set.add(t);
		}
		for(Ticket b:set){  
			System.out.println("ENTIRE DETAILS:");
			System.out.println("name:"+b.namea+"\n"+"no. of days"+b.daya+"\n"+"food cost:"+(500*b.daya)+"\n"+"charge:10,000");  
		    }  
		//child
		System.out.println("enter no of childs");
		int C=sc.nextInt();
		for(int i=0;i<C;i++) {
			System.out.println("enter name");
			String namea=sc.next();
			System.out.println("enter no. of days");
			int daya=sc.nextInt();
			Ticket t=new Ticket(namea,daya);
			set.add(t);
		}
		for(Ticket b:set){  
			System.out.println("ENTIRE DETAILS:");
			System.out.println("name:"+b.namea+"\n"+"no. of days"+b.daya+"\n"+"food cost:"+(500*b.daya)+"\n"+"cahrge:5000");  
		    } 
		//Staff
		System.out.println("enter no of staff");
		int S=sc.nextInt();
		for(int i=0;i<S;i++) {
			System.out.println("enter name");
			String namea=sc.next();
			System.out.println("enter no. of days");
			int daya=sc.nextInt();
			Ticket t=new Ticket(namea,daya);
			set.add(t);
		}
		for(Ticket b:set){  
		   System.out.println("ENTIRE DETAILS:");
			System.out.println("name:"+b.namea+"\n"+"no. of days"+b.daya+"\n"+"food cost:FREE"+"\n"+"cahrge:FREE");  
		    } 
	}
}
