package co.edu.array;

public class ArrayExam4 {

	public static void main(String[] args) {
		
		int[][] ary = {{1,2},{2,3},{3,4},{4,5},{5,6}};
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.println(ary[i][j] + " ");
			}
			System.out.println();
		}
		//2차원 배열 -> 배열 안에 배열이 존재.
		int[][] ary1 = new int[5][5];
		
		int num = 1;// 데이터를 넣기 위해 변수 2차원 배열 데이터 입력 1~25
		for(int i=0; i<ary1.length; i++) {// length(5개) 5개만큼 반복
			for(int j=0; j<ary1[i].length; j++) {
				ary1[i][j] += num;
				num++;//num 표시되는 숫자 
			}
		}
		//2차원 배열 데이터 출력
			for(int i=0; i<ary1.length; i++) {
				for(int j=0; j<ary1[i].length; j++) {
					System.out.print(ary1[i][j] + " ");
				}
				System.out.println();
				//for문이 두개 있는 이유는 데이터 출력 방향 때문
			}
			//방향 바꿀때
			for(int i=0; i<ary1.length; i++) {
				for(int j=0; j<ary1[i].length; j++) {
					System.out.print(ary1[j][i] + " ");
				}
				System.out.println();
			
	}
			//숫자가 반대로 내려갈때 (숫자 순서 반대로) (미완성)
			for(int i=4; i>ary1.length; i--) {
				for(int j=4; j>ary1[i].length; j--) {
					System.out.print(ary1[j][i] + " ");
				}
				System.out.println();

}
			
			
}
}