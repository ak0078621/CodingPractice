package pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraySumIndices {

	public static void main(String[] args) {
		brutFullWayTimeComplexty();
		lessTimeComplexity();

	}

	private static void lessTimeComplexity() {
		Integer [] num = {2,3,7,4,8};
		Map<Integer,Integer> indexMap = new HashMap<>();
		List<Integer> listOfIndex = new ArrayList<>();
		int targetNum = 7;
		for(int i = 0;i<num.length;i++){
			int remainingNum = targetNum-num[i];
			if(indexMap.containsKey(remainingNum)){
				listOfIndex.add(indexMap.get(remainingNum));
				listOfIndex.add(i);
			}else{
				indexMap.put(num[i], i);
			}
		}
		System.out.println("The indices came as :: " + Arrays.toString(listOfIndex.toArray()));
	}

	private static void brutFullWayTimeComplexty() {
		Integer [] num = {2,7,11,22};
		List<Integer> listOfIndex = new ArrayList<>();
		int targetNum = 9;
		int targetIndex = 0;
		for(int i=0;i<=num.length-1;i++){
			int rightSideDigit  = num[i];
			for(int j =0;j<=num.length-1;j++){
				if(rightSideDigit+num[j]==targetNum){
					listOfIndex.add(i);
				}
			}
		}
		System.out.println("The indices came as :: " + Arrays.deepToString(listOfIndex.toArray()));
	}

}
