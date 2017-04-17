package chap02;

public class ArrayUtilsTestApp {

	public static void main(String[] args) {
		
		//int 배열을 double로 변환
		int[] intArray={10,20,30,40,50};
		double[] dArray = ArrayUtils.intToDouble(intArray);//객체없이 만듦
		
		//for(int i=0; i<dArray.length; i++) 동일 코드
		//		syso(dArray[i])
		for(double v:dArray){//포위치문 배열순서대로 v에 넣으면서 돌림
			System.out.print(v);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		//double배열을 int배열로 변환
		double[] dArray2={10.1,20.2,30.3,40.4,50.5};
		int[] intArray2 = ArrayUtils.doubleToInt(dArray2);
		for(int v : intArray2)
			System.out.print(v+" ");
		System.out.println(" ");
		
		//int배열 두개를 연결한 새로운 배열 리턴
		int[] intArray3 = ArrayUtils.concat(intArray,intArray2);
		for(int v : intArray3)
			System.out.print(v+" ");
		System.out.println(" ");
	}
	

}
