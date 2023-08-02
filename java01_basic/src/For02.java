
public class For02 {

	public static void main(String[] args) {
	// 하기와 같이 출력하세요(단, i 와 j는 5까지 출력)
	//	i : 1
	//	i : 1 , j :1
	//	i : 1 , j :2
	//	i : 1 , j :3
	//	i : 1 , j :4
	//	i : 1 , j :5
	//	i : 2
	//	i : 2 , j :1
	//	i : 2 , j :2
	//	i : 2 , j :3
	//	i : 2 , j :4
	//	i : 2 , j :5
		
		for (int i = 1; i<=5 ; i++) {
			System.out.println("i : " + i);
			for(int j = 1; j<= 5 ; j++) {
				System.out.println("i : " + i + " ," + " j :" + j);
				
			}
			
		}
			
	}

}
