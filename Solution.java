package javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ansList = new ArrayList<List<Integer>>();
		List<Integer> ans = new ArrayList<Integer>();
		Map<Character, Integer> map = new HashMap<>();
		
		boolean d = false;
		for(int i =0; i<nums.length-2; i++){
			
			for(int j =i+1; j<nums.length-1; j++){
				for(int k =j+1; k<nums.length; k++){
					if(nums[i]+nums[j]+nums[k]==0){
						System.out.println(ansList);
						for(int x=0; x<ansList.size();x++){
							if(ansList.get(x).indexOf(nums[i])>0 && ansList.get(x).indexOf(nums[j])>0 && ansList.get(x).indexOf(nums[k])>0){
								System.out.println(ansList.get(x).indexOf(nums[i]));
								System.out.println(ansList.get(x).indexOf(nums[j]));
								System.out.println(ansList.get(x).indexOf(nums[k]));
								d = true;
							}

						}
						if(!d){
							ans = new ArrayList<Integer>();
							ans.add(nums[i]);
							ans.add(nums[j]);
							ans.add(nums[k]);

							ansList.add(ans);
						}
					}
				}
			}
		}
		return ansList; 
	}
}