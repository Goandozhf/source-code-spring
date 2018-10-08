package com.hongfei.focus;

import java.util.concurrent.CountDownLatch;
import java.util.function.IntPredicate;

import org.junit.Test;

public class Test1 {

	@Test
	public void test1() 
	{
		int col = 5;
		int num = 20;
		int[] nums = {1,2,3,4,5,1,2,3,4,5,5,1,2,2,3,4,5,5,1,1};
		
		int row = 0;
		int count = 0;
		int score = 0;
		
		for (int i = 0; i < nums.length - 1; i++) 
		{
			for (int j = 0; j < nums.length - 1 - i; j++) 
			{
				if (nums[j] > nums[j+1]) 
					swap(j, j+1, nums);
			}
		}
		
		for (int k = 0; k < nums.length; k++) 
		{
			if(nums[k] != row) 
			{
				count = 1;
				row = nums[k];
			}
			else 
			{
				count++;
				if (count == col) 
					score++;
			}
		}
		
		System.out.println(score);
	}
	
	public void swap(int i, int j, int[] array) 
	{
		if(i == j)
			return;
		
		array[i] = array[i] + array[j];
		array[j] = array[i] - array[j];
		array[i] = array[i] - array[j];
		
	}
}
