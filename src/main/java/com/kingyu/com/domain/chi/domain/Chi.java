package com.kingyu.com.domain.chi.domain;

import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_chi")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Chi extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chi_id")
    private Long id;

    @Column(length = 300, nullable = false)
    private String content;

    @Column(name = "cok_id", nullable = false)
    private Long cokId;

    @Column(name = "profile_id", nullable = false)
    private Long profileId;

    @Column(length = 200, nullable = true)
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public Chi(String content, Long cokId, Long profileId, String image, Status status) {
        this.content = content;
        this.cokId = cokId;
        this.profileId = profileId;
        this.image = image;
        this.status = status;
    }
}
