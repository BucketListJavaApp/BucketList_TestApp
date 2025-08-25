package BuketListApp.run;

/* 설명.
 *  회원등록을 위한 어플리케이션 등록
 *      객체
 *      1. 회원번호(자동번호 생성)
 *      2. 회원Id
 *      3. 회원Pwd
 *      4. 이름
 *      5. 성별
 *      6. 전화번호
 *      7. 버킷리스트 -> 취미랑 비슷하게 해보자
 *      8. 회원등록일자 및 버킷리스트등록일자
 *      9. 탈퇴여부
 *
 * */

import BuketListApp.service.MemberService;

import java.util.Scanner;

public class Application {

    private static final MemberService ms = new MemberService();        // MemberService를 무조건 거치겠다.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("♬♬♬ 버킷리스트 회원 관리 프로그램 ♬♬♬");
            System.out.println("1. 모든 회원 정보");
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요: ");
            int input = sc.nextInt();
            System.out.println();       // 버퍼 제거용

            /* 설명. 조회: find, 추가: regist, 수정: modify, 삭제: remove */
            switch (input) {
                case 1:
                    System.out.println("모든 회원 정보를 불러옵니다!");
                    System.out.println();
                    ms.findAllMembers();
                    break;
                case 2:
                    System.out.print("검색할 회원의 이름(1) 또는 번호를 입력하세요(2): ");
//                    int category = sc.nextInt();
//                    System.out.println();
//                    String searchWord = sc.nextLine();
//                    int selectMember = Integer.parseInt(sc.next());
                    ms.findMemBy(selectMember);


//                    int category = sc.nextInt();
//                    System.out.println();
//                    String searchWord = sc.nextLine();
//                    ms.findMembers(category, searchWord);      // category (1) 이름으로 찾기, (2) 회원 번호로 찾기
//                    System.out.println();
                    break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
                    System.out.println();
            }
        }
    }

    private static int selectMember() {

        return ;
    }


}
