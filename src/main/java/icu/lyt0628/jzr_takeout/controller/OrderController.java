package icu.lyt0628.jzr_takeout.controller;


import icu.lyt0628.jzr_takeout.active_record.Order;
import icu.lyt0628.jzr_takeout.active_record.User;
import icu.lyt0628.jzr_takeout.active_record.mapper.OrderMapper;
import icu.lyt0628.jzr_takeout.active_record.mapper.UserMapper;
import icu.lyt0628.jzr_takeout.controller.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderMapper orderMapper;

    @GetMapping("/find")
    public ResponseResult<List<Order>> getOrdersByUserId(@RequestParam("userId") Long userId){
        var orders = orderMapper.getOrdersByUserId(userId);
        return ResponseResult.ok(orders);
    }

    @PostMapping
    public ResponseResult<String> addOrder(@RequestBody Order order){
        orderMapper.addOrder(order);
        return ResponseResult.ok();
    }

}
