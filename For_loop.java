package IfElse;
import java.util.*;
public class For_loop {

	public static void main(String[] args) {
	System.out.println("Enter how many rows you need to print pattern: ");
    Scanner d=new Scanner(System.in);
    int rows=d.nextInt();
for(int i=0;i<=rows;i++) {
	for(int j=rows;j>=i;j--) {
		System.out.print("* ");
	}System.out.println();
}
	}}
