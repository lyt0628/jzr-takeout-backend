package icu.lyt0628.jzr_takeout.active_record;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order {
    Long id;
    Long userId;
    Long dishId;
    Date createdAt;
    Date updatedAt;
}
