package com.zhw.study.springbootjpa.repository;

import com.zhw.study.springbootjpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author innerpeacez
 * @since 2019/1/23
 */
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByName(String name);

//    @Modifying
//    @Transactional
//    void updateUser(Long id);
}
