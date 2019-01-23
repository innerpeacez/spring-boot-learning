package com.zhw.study.springbootjpa.repository;

import com.zhw.study.springbootjpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author innerpeacez
 * @since 2019/1/23
 */
public interface UserRepository extends JpaRepository<User, Long> {


}
