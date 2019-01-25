package com.zhw.study.springbootjpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author innerpeacez
 * @since 2019/1/25
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cardNum;
}
