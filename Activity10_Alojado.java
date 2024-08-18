public class Activity10_Alojado {
    public static void main(String[] args) {
		//direct method
		//               0     1     2       3         4
		//              0 1   0 1    0   0  1  2  3    1 
//		int[][] arr = {{1,2},{3,4,7},{},{5,30,22,41},{100}};
		//                                     r  c
		//System.out.println("arr [0][1]: "+arr [0][1]);
		//System.out.println("Length: "+arr.length);
		
//		for(int i=0;i<arr.length;i++){
//			for (int j=0;j<arr[i].length;j++){
//				System.out.print(arr[i][j] +" ");
//			}	
//		}
//		for(int[] val:arr){
//			for (int arrNum: val){
//				System.out.print(arrNum +" ");
//			}
//		}
//		int i=0,j=0;
//		while(i<arr.length){
//			j=0;
//			while(j<arr[i].length){
//				System.out.print(j+ " ");
//				j++;
//			}
//		i++;	
//		}	                     a   r   c
		int[][][] arr = new int [2] [2] [1];
		arr[0][0][0]= 233;
		arr[0][1][0]= 98;
		System.out.println("Arr[0][0][0]:" +arr[0][0][0]);
		System.out.println("Arr[0][1][0]:" +arr[0][1][0]);
    }
}
