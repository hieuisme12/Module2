package Module2;

import java.util.Set;
import java.util.TreeSet;

public class TuDong {
	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		Set<Integer> intersection = new TreeSet<>();
		Set<Integer> union = new TreeSet<>();
		Set<Integer> difference = new TreeSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(4);
		set1.add(5);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		intersection.addAll(set1);
		intersection.retainAll(set2);
		union.addAll(set2);
		difference.addAll(set1);
		difference.removeAll(set2);
		//Xuat kq
		System.out.println("Tap hop thu nhat : " +set1);
		System.out.println("Tap hop thu hai : " +set2);
		System.out.println("Giao hai tap hop : "+ intersection);
		System.out.println("Hoi hai tap hop : "+union);
		System.out.println("Hieu hai tap hop: "+difference);
		
	}
}
