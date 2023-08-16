package com.JanWrittenTest;

class Ticket
{
	int ticketQuan=1;
	
	public synchronized void bookTicket(int quantity)
	{
		System.out.println(Thread.currentThread().getName()+" Wants to buy a ticket "+quantity);
		if((ticketQuan-quantity)<0)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("Insufficient Ticket and Available Tickets are: "+ticketQuan);
			System.out.println(Thread.currentThread().getName()+" Wait until add ticket");
			System.out.println("-----------------------------------------------------");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			ticketQuan=ticketQuan-quantity;
			System.out.println("---------------------------------------------");
			System.out.println("Ticket Has Been Booked : " + Thread.currentThread().getName() + " by : " + quantity);
			System.out.println("Ticket Available Now " + ticketQuan);
			System.out.println("-----------------------------------------------");
			
		}
	}
	
	public synchronized void addTicket(int ticketAdd)
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------------------------------------------");
		ticketQuan = ticketQuan + ticketAdd;
		System.out.println(Thread.currentThread().getName() + " Ticket Has Been Added " + ticketAdd);

		notify();
		System.out.println("---------------------------------------------------------");
		
	}
}

public class Q1PlaneTicket {

	public static void main(String[] args) {
		// Assume plane tickets are being sold. Show use of program where 2 users are booking 
//		tickets and system is ensuring at one time one person is buying ticket
		
		Ticket t=new Ticket();
		
		Thread varun=new Thread() {
			public void run() {
				t.bookTicket(1);
			}
		};
		varun.setName("Varun");
		
		Thread karan=new Thread() {
			public void run() {
				t.bookTicket(2);
			}
		};
		karan.setName("karan");
		
		varun.start();
		karan.start();
		
		
		
		

	}

}
