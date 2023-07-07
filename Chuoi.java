package Module2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Chuoi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String,Integer> kq = new HashMap<>();
		while(true) {
			System.out.println("Nhap chuoi (nhap 'exit' de thoat): ");
			String input = scanner.nextLine();
			if(input.equals("exit")) {
				break;
			}
			if(kq.containsKey(input)) {//neu chuoi da duoc tinh toan,truy xuat kq tu HashMap
				System.out.println("So ky tu duy nhat cua chuoi '" + input + " ' la :" + kq.get(input));
			}
			else {
				//Neu chuoi chua duoc tinh toan, tinh toan va luu tru  trong hashMap
				Set<Character> uniqueChars = new HashSet<>();
				for(int i =0; i<input.length(); i++) {
					uniqueChars.add(input.charAt(i));
				}
				int count = uniqueChars.size();
				System.out.println("So ky tu duy nhat cua chuoi '"+ input + "'la:"+count);
				kq.put(input,count);
			}
		}
		
	}
}
