package icu.lyt0628.jzr_takeout.active_record;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dish {
    Long id;
    Long shopId;
    String name;
    BigDecimal price;
    Date createdAt;
    Date updatedAt;
}
