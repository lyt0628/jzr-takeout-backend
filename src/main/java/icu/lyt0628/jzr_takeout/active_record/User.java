package icu.lyt0628.jzr_takeout.active_record;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    Long id;
    String userName;
    String pwd;
    String phone;
    Integer gender;
    Integer status;
    Integer role;
    Date createdAt;
    Date updatedAt;
}
