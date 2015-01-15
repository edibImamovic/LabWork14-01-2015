package com.bitcamp.generic.programming;

import javax.swing.text.StringContent;

public class StringBuilderExercise {

	public static void main(String[] args) {

		String brojevi = "";

		for (int i = 1; i < 101; i++) {
			brojevi += i;
			if (i < 100) {
				brojevi += ", ";
			}

		}
		System.out.println(brojevi);

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 101; i++) {
			sb.append(i);
			if (i < 100) {
				sb.append(", ");
			}
		}
		System.out.println(sb.toString());

	}

}
