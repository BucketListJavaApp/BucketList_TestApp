package BuketListApp.service;

import BuketListApp.aggregate.Member;
import BuketListApp.repository.MemberRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {

//    private final MemberRepository memberRepository = new MemberRepository();
    private final MemberRepository memberRepository;
        Scanner sc = new Scanner(System.in);

    public MemberService( ) {
        memberRepository = new MemberRepository();
    }

    public void findAllMembers() {
        ArrayList<Member> result = memberRepository.findAllMembers();
        System.out.println("MemberRepository에서 조회 확인");
        System.out.println();
        for (Member member : result) {
            System.out.println("No." + member);
        }
        System.out.println();
    }


    public void findMemBy(int category) {
        Member findMember2 = memberRepository.findMemByNo(sc.nextInt());
        Member findMember = memberRepository.findMemByName(sc.nextLine());


        if(sc.nextInt() == 1) {
            System.out.println("회원 조회 성공" + findMember2);
        } else  {
            System.out.println(findMember2 + "라는 회원은 존재 하지 않습니다.");
        }
    }




//    public int findMembers (int category, String searchWord) {
//        if(category == 1){
//            Member findMember1 = memberRepository.findMemName(searchWord);
//            System.out.print("회원의 이름을 입력하세요: ");
////            String input = sc.nextLine();
//
//        } else if (category == 2) {
//            Member findMember2 = memberRepository.findMemName(searchWord);
//            Integer.parseInt(searchWord);
//            int input = sc.nextInt();
//
//        } else {
//            System.out.println("번호를 다시 입력해 주세요: ");
//            return category;
//        }
//
//        return category;
//    }
//    public void findMembers2 (int findMemNo) {
//        Member findMember = memberRepository.findMembers2(findMemNo);
//        if(findMember != null) {
//            System.out.println("회원 조회 성공: " + "\n" + "No." + findMember);
//        } else {
//            System.out.println("그런 회원은 존재하지 않습니다.");
//        }
//    }
}
