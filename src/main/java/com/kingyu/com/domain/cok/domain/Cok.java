package com.kingyu.com.domain.cok.domain;

import com.kingyu.com.domain.cok.domain.type.Access;
import com.kingyu.com.global.entity.BaseTimeEntity;
import com.kingyu.com.global.type.Anon;
import com.kingyu.com.global.type.Status;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_cok")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Cok extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cok_id")
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
    private Access access;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Anon anon;

    public Cok(String content, String toId, String fromId, String image, Integer cnt, Access access, Status status, Anon anon) {
        this.content = content;
        this.toId = toId;
        this.fromId = fromId;
        this.image = image;
        this.cnt = cnt;
        this.access = access;
        this.status = status;
        this.anon = anon;
    }
}
