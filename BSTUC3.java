package BSTProblems;

import java.util.Scanner;

public class BSTUC3 {
	public static void main(String[] args) {
		BinaryTreeUC3 obj = new BinaryTreeUC3 () ;
		obj.Add(56);
		obj.Add(30);
		obj.Add(70);
		obj.Add(60);
		obj.Add(95);
		obj.Add(65);
		obj.Add(63);
		obj.Add(67);
		obj.Add(22);
		obj.Add(40);
		obj.Add(11);
		obj.Add(16);
		obj.Add(3);
		
		obj.Traversing(obj.root);
		Scanner Find = new Scanner(System.in);
		System.out.println("\n Enter the number u want to find  :");
		int X = Find.nextInt();
		boolean point =obj.search(X);

		
		
		
	
	}
}
