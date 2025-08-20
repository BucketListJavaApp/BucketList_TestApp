package BuketListApp.service;

import BuketListApp.aggregate.Member;
import BuketListApp.repository.MemberRepository;

import java.util.ArrayList;

public class MemberService {

//    private final MemberRepository memberRepository = new MemberRepository();
    private final MemberRepository memberRepository;

    public MemberService( ) {
        memberRepository = new MemberRepository();
    }

    public void findAllMembers() {
        ArrayList<Member> result = memberRepository.findAllMembers();
        System.out.println("Service에서 조회 확인: ");
        for (Member member : result) {
            System.out.println("member = " + member);
        }
    }

    public void findMembers() {

    }
}
