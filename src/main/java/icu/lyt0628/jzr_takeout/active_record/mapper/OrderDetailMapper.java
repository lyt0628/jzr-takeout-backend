package icu.lyt0628.jzr_takeout.active_record.mapper;


import icu.lyt0628.jzr_takeout.active_record.OrderDetail;
import icu.lyt0628.jzr_takeout.active_record.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDetailMapper {

    User getOrderDetailByOrderId(@Param("orderId")Long orderId);
    OrderDetail getOrderDetailById(Long id);

    void addOrderDetail(OrderDetail detail);

    void updateOrderDetailByOrderId(Long orderId);

}
