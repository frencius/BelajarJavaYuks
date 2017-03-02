package belajarjavayuks.inputoutput;
import java.util.Scanner;

public class InputOutput4 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		char jenisKelamin;
		int tinggiBadan;
		boolean menikah;

		nama = input.nextLine();
		jenisKelamin = input.next().charAt(0);
		tinggiBadan = input.nextInt();
		menikah = input.nextBoolean();
	}
}