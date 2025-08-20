package com.bucket.hch.app.aggregate;

import java.time.LocalDateTime;

public class bucketlist {
    private int bucket_id;
    private String bucket_title;
    private String contents;
    private LocalDateTime createdAt;
    private int views = 0;
    private Long userNo;
    public bucketlist() {
    }
    /* 설명. 버킷리스트 작성 시 사용자가 입력한 값을 지닌 bucketlist 객체가 되기 위한 생성자 */
    public bucketlist(int bucket_id, String bucket_title, String contents, LocalDateTime createdAt, int views) {
        this.bucket_id = bucket_id;
        this.bucket_title = bucket_title;
        this.contents = contents;
        this.createdAt = createdAt;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "bucketlist{" +
                "bucket_id=" + bucket_id +
                ", bucket_title='" + bucket_title + '\'' +
                ", contents='" + contents + '\'' +
                ", createdAt=" + createdAt +
                ", views=" + views +
                ", userNo=" + userNo +
                '}';
    }
}



