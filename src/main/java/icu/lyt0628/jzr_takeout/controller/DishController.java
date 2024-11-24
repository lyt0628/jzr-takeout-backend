package icu.lyt0628.jzr_takeout.controller;

import icu.lyt0628.jzr_takeout.active_record.Dish;
import icu.lyt0628.jzr_takeout.active_record.mapper.DishMapper;
import icu.lyt0628.jzr_takeout.controller.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dishes")
public class DishController {
    @Autowired
    DishMapper dishMapper;

    @GetMapping("/find")
    public ResponseResult<List<Dish>> getDishesByShopId(@RequestParam("shopId") Long shopId){
        var dishes = dishMapper.getDishesByShopId(shopId);
        return ResponseResult.ok(dishes);
    }


    @GetMapping("/{id}")
    public ResponseResult<Dish> getDishById(@PathVariable("id") Long id){
        var dish = dishMapper.getDishById(id);
        return ResponseResult.ok(dish);
    }

    @PostMapping
    public ResponseResult<String> addDish(@RequestBody Dish dish){
        dishMapper.addDish(dish);
        return ResponseResult.ok();
    }

    @PutMapping
    public  ResponseResult<String> updateDishById(@RequestBody Dish dish){
        dishMapper.updateDishById(dish);
        return ResponseResult.ok();
    }


}
