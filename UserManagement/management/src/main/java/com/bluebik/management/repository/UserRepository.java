package com.bluebik.management.repository;

import com.bluebik.management.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByNameLikeIgnoreCase(String pattern);

    @Modifying
    @Query("UPDATE UserEntity u SET u.name = :newName, u.info = :newInfo WHERE u.id IN :userIds")
    void updateUserNameAndEmail(@Param("userIds") List<Long> userIds,
                                @Param("newName") String newName,
                                @Param("newInfo") String newInfo);

    @Modifying
    @Query("DELETE FROM UserEntity u WHERE u.id IN :userIds")
    void deleteUsersByIds(@Param("userIds") List<Long> userIds);

    void deleteAllByIdIn(List<Long> ids);


}
