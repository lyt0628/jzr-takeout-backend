package icu.lyt0628.jzr_takeout.active_record;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Shop {
    Long id;
    String name;
    Long sellerId;
    Date createdAt;
    Date updatedAt;
}
