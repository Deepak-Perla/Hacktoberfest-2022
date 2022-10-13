package lec_12;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
		bubble(arr);
	}

	public static void bubble(int[] arr) {
		for (int count = 0; count < arr.length; count++) {
			for (int s = 0; s <= arr.length - 2; s++) {
				if (arr[s + 1] < arr[s]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
