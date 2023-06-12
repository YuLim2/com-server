package com.kingyu.com.domain.pur.domain;

import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_pur")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Pur extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pur_id")
    private Long id;

    @Column(name = "ccok_id", nullable = false)
    private Long ccokId;

    @Column(name = "profile_id", nullable = false)
    private Long profileId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public Pur(Long ccokId, Long profileId, Status status) {
        this.ccokId = ccokId;
        this.profileId = profileId;
        this.status = status;
    }
}
