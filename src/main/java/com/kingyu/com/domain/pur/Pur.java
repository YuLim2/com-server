package com.kingyu.com.domain.pur;

import com.kingyu.com.global.entity.BaseTimeEntity;
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

}
