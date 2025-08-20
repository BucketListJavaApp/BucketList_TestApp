package BuketListApp.repository;

import BuketListApp.aggregate.AccountStatus;
import BuketListApp.aggregate.Gender;
import BuketListApp.aggregate.Member;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class MemberRepository {   // 여기 부분이 파일의 입출력을 관리하는 부분

    /* 필기. 초기에 Member 파일이 없다면 더미데이터(dummy data)를 만들어서 쌓는다. */
    private final ArrayList<Member> memberList = new ArrayList<>(); // 여기에 멤버 타입을 저장, 여기 컬렉션
    private final File file =
            new File("src/main/java/BuketListApp/db/buketMemberDB.dat");

    java.util.Date date = new java.util.Date();
    Calendar calendar = java.util.Calendar.getInstance();


    public MemberRepository() {
        if (!file.exists()) {
            ArrayList<Member> defaultmemberList = new ArrayList<>();
            defaultmemberList.add(new Member(1, "user01", "pass01", "김민지",
                    20, Gender.WOMAN, "010-0000-0001", new String[]{"여행"},
                    new Date(System.currentTimeMillis()), AccountStatus.ACTIVATE));

            saveMembers(defaultmemberList);
        }

        loadMembers();
        
    }

    /* 설명. 회원을 축력하는 메소드로 덮어씌어주는 용도 */
    private void saveMembers(ArrayList<Member> Members) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for (Member member : Members) {
                oos.writeObject(member);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                memberList.add((Member) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("회원 정보 불러오기!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public ArrayList<Member> findAllMembers() {
        return memberList;

    }
}
