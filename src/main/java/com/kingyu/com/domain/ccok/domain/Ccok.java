package com.kingyu.com.domain.ccok.domain;

import com.kingyu.com.domain.ccok.type.Lock;
import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Anon;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_ccok")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Ccok extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ccok_id")
    private Long id;

    @Column(length = 300, nullable = false)
    private String content;

    @Column(name = "to_id", nullable = false)
    private String toId;

    @Column(name = "from_id", nullable = false)
    private String fromId;

    @Column(length = 200, nullable = false)
    private String image;

    @Column(name = "light_cnt", nullable = false)
    private Integer cnt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Lock lock;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Anon anon;

    public Ccok(String content, String toId, String fromId, String image, Integer cnt, Lock lock, Anon anon) {
        this.content = content;
        this.toId = toId;
        this.fromId = fromId;
        this.image = image;
        this.cnt = cnt;
        this.lock = lock;
        this.anon = anon;
    }
}
