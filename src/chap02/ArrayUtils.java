package chap02;

import java.lang.reflect.Array;

public class ArrayUtils {
	
	public static double[] intToDouble(int[] array){
		double[] result=null;
		
		if(array==null)
			return result;
		
		result = new double[array.length];
		
		for(int i=0; i<array.length; i++){
			result[i]=array[i];
		}
		return result;
	}
	
	public static int[] doubleToInt(double[] array){
		int[] result=null;
		
		if(array==null)
			return result;
		
		result = new int[array.length];
		
		for(int i=0; i<array.length; i++){
			result[i]=(int)array[i];
		}
		
		return result;
	}
	
	public static int[] concat(int[] array1,int[] array2){
		int[] result=null;
		int length1=array1.length;
		int length2=array2.length;
		int length=length1+length2;
		int i;
		
		if(array1==null||array2==null)
			return result;
		
		result = new int[length];
		
		for(i=0; i<length; i++){
			if(i<length1)
				result[i]=array1[i];
			else
				result[i]=array2[i-length1];
		}
		
		return result;
		
		
	}

}
