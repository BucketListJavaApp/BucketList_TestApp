package BuketListApp.aggregate;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

public class Member implements Serializable {     // Serializable 은 해줘서 타입 맞춰주자
    private int memNo;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private Gender gen;                      // enum
    private String phoneNum;
    private String[] buketList;
    private Date registDate;
    private AccountStatus accountStatus;     // enum

    public Member() {
    }

    public Member(String id, String pwd, String name, int age, Gender gen, String phoneNum, String[] buketList, Date registDate, AccountStatus accountStatus) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.phoneNum = phoneNum;
        this.buketList = buketList;
        this.registDate = registDate;
        this.accountStatus = accountStatus;
    }

    public Member(int memNo, String id, String pwd, String name, int age, Gender gen, String phoneNum, String[] buketList, Date registDate, AccountStatus accountStatus) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.phoneNum = phoneNum;
        this.buketList = buketList;
        this.registDate = registDate;
        this.accountStatus = accountStatus;
    }

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGen() {
        return gen;
    }

    public void setGen(Gender gen) {
        this.gen = gen;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String[] getBuketList() {
        return buketList;
    }

    public void setBuketList(String[] buketList) {
        this.buketList = buketList;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return   memNo +
                ", 이름= '" + name + '\'' +
                ", Id= '" + id + '\'' +
                ", pwd= '" + pwd + '\'' +
                ", 나이= " + age +
                ", 성별= " + gen +
                ", 전화번호= '" + phoneNum + '\'' +
                ", buketList= " + Arrays.toString(buketList) +
                ", 등록일자= " + registDate +
                ", 계정상태= " + accountStatus;
    }
}
