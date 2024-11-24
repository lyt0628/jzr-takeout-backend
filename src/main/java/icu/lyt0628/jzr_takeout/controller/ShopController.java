package icu.lyt0628.jzr_takeout.controller;


import icu.lyt0628.jzr_takeout.active_record.Shop;
import icu.lyt0628.jzr_takeout.active_record.User;
import icu.lyt0628.jzr_takeout.active_record.mapper.ShopMapper;
import icu.lyt0628.jzr_takeout.active_record.mapper.UserMapper;
import icu.lyt0628.jzr_takeout.controller.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    ShopMapper shopMapper;

    @GetMapping
    ResponseResult<List<Shop>> getAllShops(){
        var shops = shopMapper.getAllShops();
        return  ResponseResult.ok(shops);
    }

    @GetMapping("/{id}")
    ResponseResult<Shop> getShopById(@PathVariable("id") Long id){
        var shop = shopMapper.getShopById(id);
        return  ResponseResult.ok(shop);
    }

    @GetMapping("/find")
    ResponseResult<Shop> getShopBySellerId(@RequestParam("sellerId")Long sellerId){
        var shop = shopMapper.getShopBySellerId(sellerId);
        return ResponseResult.ok(shop);
    }

    @PostMapping
    ResponseResult<String> addShop(@RequestBody Shop shop){
        shopMapper.addShop(shop);
        return ResponseResult.ok();
    }

    @PutMapping
    ResponseResult<String> updateShopById(@RequestBody Shop shop){
        shopMapper.updateShopById(shop);
        return ResponseResult.ok();
    }


}
