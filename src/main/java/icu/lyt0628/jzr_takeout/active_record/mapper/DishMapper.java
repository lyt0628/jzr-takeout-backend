package icu.lyt0628.jzr_takeout.active_record.mapper;


import icu.lyt0628.jzr_takeout.active_record.Dish;
import icu.lyt0628.jzr_takeout.active_record.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DishMapper {
    List<Dish> getDishesByShopId(Long shopId);

    Dish getDishById(@Param("id")Long id);

    void addDish(Dish dish);

    void updateDishById(Dish dish);

}
