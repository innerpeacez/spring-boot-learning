package com.zhw.study.springbootjpa.repository;

import com.zhw.study.springbootjpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;

/**
 * @author innerpeacez
 * @since 2019/1/23
 */
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {

    @Nullable
    List<User> findByName(@NonNull String name);

    User findByIdCardCardNum(String cardNum);

//    @Modifying
//    @Transactional
//    void updateUser(Long id);
}



