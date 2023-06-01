package com.kingyu.com.domain.chi;

import com.kingyu.com.global.entity.BaseTimeEntity;
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

    @Column(name = "ccok_id", nullable = false)
    private Long ccokId;

    @Column(name = "profile_id", nullable = false)
    private Long profileId;

    @Column(length = 200, nullable = true)
    private String image;

    public Chi(String content, Long ccokId, String image) {
        this.content = content;
        this.ccokId = ccokId;
        this.image = image;
    }
}
