package com.zoho.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormANumberSystem {

	public static void main(String[] args) {
		FormANumberSystem formANumberSystem = new FormANumberSystem();
		formANumberSystem.formANumber();

	}

	private void formANumber() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the nthNumber");
		int nthNumber = reader.nextInt();
		List<Integer> numberForms = new ArrayList();
		numberForms.add(3);
		numberForms.add(4);

		for (int index = 0; index <= (nthNumber / 2) - 2; index++) {

			numberForms.add((numberForms.get(index) * 10) + 3);

			numberForms.add((numberForms.get(index) * 10) + 4);
		}

		for (int index = 0; index < numberForms.size(); index++) {
			System.out.print(numberForms.get(index)+" ");
		}

	}

}
