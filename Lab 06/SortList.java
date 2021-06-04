package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortList {
	
public static List getValues(HashMap<Character,Integer> hm){
		
		List<Map.Entry<Character, Integer>> lst = new ArrayList<>(hm.entrySet());
		
		Collections.sort(lst, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2) {
				return m1.getValue()-m2.getValue();
			}
		});
		
		return lst;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		char ch=' ';
		HashMap<Character,Integer> hm=new HashMap<>();
		System.out.print("Enter the size of your Hash Map : ");
		char c;
		int size = sc.nextInt();
		if(size<1)
			System.out.println("Cannot Proceed...Size should be 1 or more.");
		else {
			for(int i=0;i<size;i++) {
				System.out.printf("Enter Key %d : ",(i+1));
				c = sc.next().charAt(0);
				hm.put(c, (int)c);
			}
			List<Map.Entry<Character, Integer>> list = getValues(hm);
			System.out.println();
			System.out.print("1. Choose Ascending Sort\n2. Choose Descending Sort\nEnter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.print("\nThe characters and their corresponding ascii value in ascending order is given below :\n");
					for(int i=0;i<list.size();i++) {
						Map.Entry<Character, Integer> m = list.get(i);
						System.out.println((i+1)+". "+m.getKey()+" : "+m.getValue());
					}
					break;
			case 2: System.out.print("\nThe characters and their corresponding ascii value in descending order is given below :\n");
					for(int i=list.size()-1;i>=0;i--) {
						Map.Entry<Character, Integer> m = list.get(i);
						System.out.println((list.size()-i)+". "+m.getKey()+" : "+m.getValue());
					}
					break;
			default: System.out.println("Enter correct choice(1-3)...");
			
			}
		}
		sc.close();

	}

}
