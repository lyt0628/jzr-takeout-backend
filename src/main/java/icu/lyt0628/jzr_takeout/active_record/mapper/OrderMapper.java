package icu.lyt0628.jzr_takeout.active_record.mapper;


import icu.lyt0628.jzr_takeout.active_record.Order;
import icu.lyt0628.jzr_takeout.active_record.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    Order getOrderById(@Param("id")Long id);

    List<Order> getOrdersByUserId(Long userId);

    void addOrder(Order id);

}
