package com.wall.steve.demo;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

import javax.script.ScriptException;

public class Ex6NewMethods {
	public static void main(String[] args) throws FileNotFoundException,
			ScriptException, NoSuchMethodException {
		// String.join()
		System.out.println(String.join(" * ", "Mon", "Tue", "Wed"));

		// Arrays - parallelSetAll(), parallelSort()
		int[] ints = new int[10];
		Arrays.parallelSetAll(ints, i -> new Random().nextInt());
		Arrays.parallelSort(ints);
		for (int i : ints) {
			System.out.println(i);
		}
	}
}
