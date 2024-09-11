package com.lec.ex3_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

// Math.random(실수 난수)  Random객체 사용 가능 : 실수 난수로 출력
public class Ex02_lotto {
	public static void main(String[] args) {
		Random random = new Random();
		
		// 배열 사용시
		int[] lottoArr = new int[6];	// 중복된 난수 발생 가능
		
		// 발생된 난수를 배열에 할당
		for(int i=0 ; i<lottoArr.length ; i++) {
			lottoArr[i] = random.nextInt(45)+1;	// 1부터 45 사이
		}
		
		// 배열 안의 값을 오름차순 정렬
		for(int i=0 ; i<lottoArr.length-1 ; i++) {
			for(int j=i+1 ; j<lottoArr.length ; j++) {
				if(lottoArr[i] > lottoArr[j]) {
					int temp = lottoArr[i];		// temp 임시변수
					lottoArr[i] = lottoArr[j];
					lottoArr[j] = temp;
				}	// if
			}	// for
		}	// for
		System.out.println("lottoArr : " + Arrays.toString(lottoArr));
		
		// HashSet 사용시
		// HashSet<Integer> lottoSet = new HashSet<Integer>(); // 난수 발생할 때마다 
		// TreeSet 사용시
		TreeSet<Integer> lottoSet = new TreeSet<Integer>();		// 정렬
		int count = 0;
		while(lottoSet.size()<6) {	// size()가 6이 되면 그만(6까지 뽑으면)
			lottoSet.add(random.nextInt(45)+1);
			count ++;
		}
		System.out.println(count + "번 뽑은 lottoSet : " + lottoSet);
	}
}
