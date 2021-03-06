/*
 * 자바 점수를 입력 받아 등수를 구하는 성적처리 프로젝트를 시도해보자.
 * 조건은 다음과 같다.
 * 1. 학생의 학번, 자바점수, 등수는 2차원 배열(int score[10][3])에 저장한다.
 * 2. 학급 당 학생수는 최대 10명이다.
 * 3. 세 과목은 국어, 영어, 자바이며 0~100점 사이의 점수를 갖는다.
 * 4. 점수가 높을 수록 등위가 높다.
 * 5. 모든 성적 처리를 끝내면 1등 부터 10등 순서를 출력한다.
 * 6. 순서대로 출력하기 위해 bubble 정렬을 이용한다.
 */
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = new int[][] {
			{1401, 100, 1}, {1402, 88, 1}, {1403, 89, 1},
			{1404, 100, 1}, {1405, 95, 1}, {1406, 79, 1},
			{1407, 65, 1}, {1408, 98, 1}, {1409, 83, 1},
			{1410, 88, 1}
		};
		//inputscore(); 나중에 혼자 연습할 때 해볼 것.
		getRank(score);
		dosortBubble(score);
		printResult(score);
	}
	//private은 아무나 접근 할 수 없음.(사생활이랍쇼 ㅠ!~, public은 아무나 쓸 수 있습니다.)
	public static void getRank(int[][] score) {
		// TODO Auto-generated method stub
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i][1]<score[j][1])
					score[i][2]++;
			}
		}
	}
	
	public static void dosortBubble(int[][] score) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j>0; j--) {
				if(score[j][2]>score[j-1][2]) {
					for(int k = 0; k<3; k++) {
						temp = score[j][k];
						score[j][k] = score[j-1][k];
						score[j-1][k] = temp;
					}
				}
			}
		}
		/*int temp=0;
		for(int i = score.length-1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(score[j][2]>score[j+1][2]) {
					for(int k = 0; k<3; k++) {
						temp = score[j][k];
						score[j][k] = score[j+1][k];
						score[j+1][k] = temp;
					}
				}
			}
		}*/
		
	}
	
	public static void printResult(int[][] score) {
		// TODO Auto-generated method stub
		System.out.println("*****성적 처리 결과*****\n");
		System.out.println("학번\t자바점수\t등수");
		for(int i = 0; i<score.length; i++) {//행에 대한 것. i에 대한
			for(int j = 0; j<score[i].length; j++) { //열에 대한 것. j에 대한
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}



}
