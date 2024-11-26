package icu.lyt0628.jzr_takeout.active_record.mapper;


import icu.lyt0628.jzr_takeout.active_record.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();

    User getUserById(@Param("id")Long id);

    void addUser(User user);

    void updateUserById(User user);

    void deleteUserById(@Param("id")Long id);

}
