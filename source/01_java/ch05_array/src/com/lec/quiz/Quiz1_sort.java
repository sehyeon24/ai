package com.lec.quiz;

import java.util.Arrays;

// 배열의 오름차순 정
public class Quiz1_sort {
	public static void main(String[] args) {
		int[] arr = {76,45,34,89,50};
//		for(int a : arr) {
//			System.out.print(a + "\t");
//		}
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		// 정렬
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] > arr[j]) {	// 부등호만 바꾸면 내림차순
					// i번재와 j번째를 바꿔
					int temp = arr[i];	// 저장기능
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("정렬 후 : " + Arrays.toString(arr));

	}
}



















