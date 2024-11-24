package icu.lyt0628.jzr_takeout.active_record.mapper;


import icu.lyt0628.jzr_takeout.active_record.Shop;
import icu.lyt0628.jzr_takeout.active_record.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopMapper {
    List<Shop> getAllShops();

    Shop getShopById(@Param("id")Long id);

    Shop getShopBySellerId(Long sellerId);

    void addShop(Shop shop);

    void updateShopById(Shop shop);

    void deleteShopById(@Param("id")Long id);

}
