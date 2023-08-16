package com.AugustPaperTest;
import java.util.*;
class Order 
{
	int oid;
	String city;
	String itemName;
	String status;
	/**
	 * @param oid
	 * @param city
	 * @param itemName
	 * @param status
	 */
	public Order(int oid, String city, String itemName, String status) {
		this.oid = oid;
		this.city = city;
		this.itemName = itemName;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", city=" + city + ", itemName=" + itemName + ", status=" + status + "]";
	}
	
	
	
	
}

public class Q2OrderListMap {

	public static void main(String[] args) {
		// 2.Flipkart maintains a list<order> from different places .Order has (orderid,city,itemname,status).
//		From this create a Map which stores key has cityname and count as no of order’s  pending in that city. 
//		Data should be sorted according to city .
		
		ArrayList<Order>list=new ArrayList<>();
		list.add(new Order(1,"Pune","Shoes","Delivered"));
		list.add(new Order(2,"Satara","Bag","Pending"));
		list.add(new Order(3,"Mumbai","Shoes","Pending"));
		list.add(new Order(4,"Jalana","Shoes","Delivered"));
		list.add(new Order(5,"Pune","Bag","Pending"));
		list.add(new Order(6,"Mumbai","Bag","Pending"));
		list.add(new Order(7,"Pune","Spect","Pending"));
		list.add(new Order(8,"Satara","Spect","Pending"));
		
		
		Collections.sort(list, new citySort());
		for(Order o:list)
		{
			System.out.println(o);
		}
		
		
		HashMap<String,ArrayList<Integer>>a=new HashMap<>();
		ArrayList<Integer>countPend=new ArrayList<>();
		
		Iterator<Order>it=list.iterator();
		while(it.hasNext())
		{
			Order o=it.next();
			int count=0;
			if(a.containsKey(o.city))
			{
				countPend=a.get(o.city);
				if(o.status.equals("Pending"))
				{
					count++;
					countPend.add(count);
					
				}
//				citySt.add(o.status);
			}
			else
			{
				countPend=new ArrayList<>();
				countPend.add(count);
			}
			a.put(o.city, countPend);
		}
		
		for(Map.Entry<String, ArrayList<Integer>>z:a.entrySet())
		{
			System.out.println(z.getKey()+" "+z.getValue());
		}
		
		TreeMap<String,ArrayList<Integer>>d=new TreeMap<>(a);
		System.out.println(d);
		
		

	}

}

class citySort implements Comparator<Order>
{
	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub
		return o1.city.compareTo(o2.city);
	}
}