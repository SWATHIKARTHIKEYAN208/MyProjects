package com.project.junitproject;

import java.util.Arrays;

public class Demo {
	
		public int findMin(int[] a) {
			Arrays.sort(a);
			return a[0];
			
	}
		public String findMax(String[] b)
		{
			int l=b[0].length();
			String max="";
			for(int i=0;i<b.length;i++) {
				if(b[i].length()>l) {
					max=b[i];
				}
				
			}
			return max;
		}
}
