package com.moon.mapper;

import com.moon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author: faker
 * @Date:2019/1/4
 */
@Repository
public interface UserMapper extends JpaRepository<User,Long> {

    @Transactional
    @Query("select u from User u where u.userName = :userName")
        User findAllByUserName(@Param("userName") String userName);
}
