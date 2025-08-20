package com.pilltong22.testapp.aggregate;

import java.io.Serializable;
import java.time.LocalDate;

public class Bucketlists implements Serializable {
    private int bucket_id;             // id
    private String bucket_title;       // 제목
    private String bucket_contents;    // 내용
    private LocalDate created_at;
    private int views;

    public Bucketlists() {
    }

    // 사용자가 입력하는 값들
    public Bucketlists(String bucket_title, String bucket_contents, int bucket_id) {
        this.bucket_title = bucket_title;
        this.bucket_contents = bucket_contents;
        this.bucket_id = bucket_id;
    }

    // 전체 값 생성자
    public Bucketlists(int bucket_id, String bucket_title, String bucket_contents, LocalDate created_at, int views) {
        this.bucket_id = bucket_id;
        this.bucket_title = bucket_title;
        this.bucket_contents = bucket_contents;
        this.created_at = created_at;
        this.views = views;
    }

    public int getBucket_id() {
        return bucket_id;
    }

    public void setBucket_id(int bucket_id) {
        this.bucket_id = bucket_id;
    }

    public String getBucket_title() {
        return bucket_title;
    }

    public void setBucket_title(String bucket_title) {
        this.bucket_title = bucket_title;
    }

    public String getBucket_contents() {
        return bucket_contents;
    }

    public void setBucket_contents(String bucket_contents) {
        this.bucket_contents = bucket_contents;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Bucketlists{" +
                "bucket_id=" + bucket_id +
                ", bucket_title='" + bucket_title + '\'' +
                ", bucket_contents='" + bucket_contents + '\'' +
                ", created_at=" + created_at +
                ", views=" + views +
                '}';
    }
 //
}
