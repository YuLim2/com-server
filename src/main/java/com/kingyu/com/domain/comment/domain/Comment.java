package com.kingyu.com.domain.comment.domain;

import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Anon;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(length = 300, nullable = false)
    private String content;

    @Column(name = "profile_id", nullable = false)
    private Long profileId;

    @Column(name = "parent_id", nullable = false)
    private Long parentId;

    @Column(name = "post_id", nullable = false)
    private Long postId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Anon anon;

    public Comment(String content, Long profileId, Long parentId, Long postId, Status status, Anon anon) {
        this.content = content;
        this.profileId = profileId;
        this.parentId = parentId;
        this.postId = postId;
        this.status = status;
        this.anon = anon;
    }
}
