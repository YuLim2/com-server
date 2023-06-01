package com.kingyu.com.domain.profile.domain;

import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_profile")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Profile extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id;

    @Column(nullable = false)
    private Long user_id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String nickname;

    @Column(length = 200, nullable = true)
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public Profile(String name, String nickname, String image) {
        this.name = name;
        this.nickname = nickname;
        this.image = image;
    }
}
