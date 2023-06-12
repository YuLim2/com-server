package com.kingyu.com.domain.post.domain;

import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Anon;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_post")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "profile_id")
    private Long ProfileId;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 500, nullable = false)
    private String content;

    @Column(length = 200, nullable = true)
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Anon anon;

    public Post(Long profileId, String title, String content, String image, Status status, Anon anon) {
        ProfileId = profileId;
        this.title = title;
        this.content = content;
        this.image = image;
        this.status = status;
        this.anon = anon;
    }
}
