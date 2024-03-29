package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {
// 배열을 만드는 거 객체만드는거 다름
    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        
        for (int i=0; i<friendArray.length; i++) {
        	
        	friendArray[i] = new Friend();
        	
        	System.out.print("이름: ");
        	friendArray[i].setName(sc.next());
        	
        	System.out.print("핸드폰: ");
        	friendArray[i].setHp(sc.next());
        	
        	System.out.print("학교: ");
        	friendArray[i].setSchool(sc.next());
        	
        	System.out.println("===================");
        	
        }
        
        /*
         for (int i=0; i<friendArray.length; i++) {
         	Friend friend = new Friend();
         	
         	System.out.print("이름: ");
        	friend.setName(sc.next());
        	
        	friendArray[i] = friend;
         	
         }
         */
            
        

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }

        sc.close();
    }

}
