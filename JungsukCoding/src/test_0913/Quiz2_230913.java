package test_0913;

public class Quiz2_230913 { 
	  public static void main(String[] args) {
	        int[][] arr = {// 이때 변수명은 아무거나 해도 상관없음 (arr1 등도 가능)
	                {1, 0, 1, 1, 1},
	                {0, 0, 1, 1, 1},
	                {1, 0, 0, 1, 1},
	                {1, 1, 1, 1, 0},
	                {1, 1, 1, 0, 0}
	        };
	        System.out.println(bingoCount(arr));
	        // Solution2. 은 생략 가능 (같은 클래스 안에 있기도 하고, static으로 메서드 정의하였기때문에)
	    }

	    static int bingoCount(int[][] arr) {
	       int i = 0;
	       int j = 0;

	       int cnt1 = 0; // 가로 빙고개수
	       int result1 = 0; // arr[][] 누적의 합 담는 변수
	       int cnt2 = 0; // 세로 빙고개수
	       int result2 = 0;
	       int cnt3 = 0; // 왼쪽대각선 빙고개수
	       int result3 = 0;
	       int cnt4 = 0; // 오른쪽대각선 빙고개수
	       int result4 = 0;
	       
	       
	       // 1. 가로 빙고 확인 : 우선 -> 0,0 / 0,1/ 0,2/ 0,3/ 0,4 --> 1,0 /1,1 /1,2 /1,3 /1,4 ,,,찍어보기
	       for( i = 0; i <arr.length; i++) {
	    	   for(j = 0; j < arr.length; j++) {
	    		   //System.out.println("arr"+"["+i+"]"+"["+j+"]= "+ arr[i][j]);
	    		   result1 += arr[i][j];
	    		   if(result1 == 5) {
	    			   cnt1++;
	    		   }
	    	   } //end of for(j)
	    	   result1 = 0; // i 값 바뀔때마다, result1 값 리셋 필요 ! 
	    	   //System.out.println(cnt1);
	       }System.out.println("가로 =" + cnt1);
	       // end of for(i)
	       
//	       if (arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1 && arr[0][3] == 1 && arr[0][4] == 1)
//	           cnt1++;//arr[0][0,1,2,3,4] == 1}
//	       if (arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1 && arr[1][3] == 1 && arr[1][4] == 1)
//	           cnt1++;//arr[1][0,1,2,3,4] == 1}
//	       if (arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1 && arr[2][3] == 1 && arr[2][4] == 1)
//	           cnt1++; // arr[2][0,1,2,3,4]}
//	       if (arr[3][0] == 1 && arr[3][1] == 1 && arr[3][2] == 1 && arr[3][3] == 1 && arr[3][4] == 1)
//	           cnt1++;   // arr[3][0,1,2,3,4]}//
//	       if (arr[4][0] == 1 && arr[4][1] == 1 && arr[4][2] == 1 && arr[4][3] == 1 && arr[4][4] == 1)
//	           cnt1++;  // arr[4][0,1,2,3,4]})
//	       System.out.println("가로 = " + cnt1);

	       // 2. 세로 빙고 확인 : 우선 -> 1,0 / 2,0/ 3,0/ 4,0 --> 1,1 /2,1 /3,1 /4,1 ,,,찍어보기
	       result2 = 0;
	       cnt2 = 0;
			for(i = 0; i <arr.length; i++) {
		    	   for(j = 0; j < arr.length; j++) {
		    		  // System.out.println("arr"+"["+j+"]"+"["+i+"]= "+ arr[j][i]);
		    		   result2 += arr[j][i];
		    		   if(result2 == 5) {
		    			   cnt2++;
		    		   }
		    	   } //end of for(j)
		    	   result2 = 0;
		    	   //System.out.println(cnt2);
		       }System.out.println("세로 =" + cnt2); 
		       // end of for(i)
       
//	       if (arr[0][0] == 1 && arr[1][0] == 1 && arr[2][0] == 1 && arr[3][0] == 1 && arr[4][0] == 1)
//	           cnt2++;//arr[0,1,2,3,4][0] == 1}
//	       if (arr[0][1] == 1 && arr[1][1] == 1 && arr[2][1] == 1 && arr[3][1] == 1 && arr[4][1] == 1)
//	           cnt2++;    //arr[0,1,2,3,4][1] == 1}
//	       if (arr[0][2] == 1 && arr[1][2] == 1 && arr[2][2] == 1 && arr[3][2] == 1 && arr[4][2] == 1)
//	           cnt2++; // arr[0,1,2,3,4][2]}
//	       if (arr[0][3] == 1 && arr[1][3] == 1 && arr[2][3] == 1 && arr[3][3] == 1 && arr[4][3] == 1)
//	           cnt2++;// arr[0,1,2,3,4][3]}
//	       if (arr[0][4] == 1 && arr[1][4] == 1 && arr[2][4] == 1 && arr[3][4] == 1 && arr[4][4] == 1)            //arr[0,1,2,3,4][4]}
//	           cnt2++;
//	       System.out.println("세로 = " + cnt2);

	       // 3. 왼쪽위 대각선 빙고 확인
		   for(i = 0; i< arr.length; i++) {
			   if(arr[i][i] == 1) {
				//System.out.println("arr"+"["+i+"]"+"["+i+"]= "+ arr[i][i]);
				   result3 += arr[i][i];
				   if(result3 == 5) {
					   cnt3++;
				   }
			   } 
		   }System.out.println("왼쪽위대각선 =" + cnt3);
//	       if (arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1 && arr[3][3] == 1 && arr[4][4] == 1) {
//	           cnt3++;
//	            }
//	       System.out.println("왼쪽위대각선 =" + cnt3);

	       // 4. 왼쪽위 대각선 빙고 확인
		   for(i = 0; i< arr.length; i++) {
			   if(i + j == 4) {
				//System.out.println("arr"+"["+i+"]"+"["+i+"]= "+ arr[i][i]);
				   result4 += arr[i][j];
				   if(result4 == 5) {
					   }cnt4++;
				   }
			   }System.out.println("오른쪽아래 대각선 =" + cnt4);
			   
//	       if (arr[4][0] == 1 && arr[3][1] == 1 && arr[2][2] == 1 && arr[1][3] == 1 && arr[0][4] == 1) {
//	           cnt4++;
//	            }
//	       System.out.println("오른쪽아래 대각선 =" + cnt4);
	       int result = cnt1 + cnt2 + cnt3 + cnt4;
	       //System.out.println(result);

	       return result ;
	    }//end of bingoCount
	}//end of class