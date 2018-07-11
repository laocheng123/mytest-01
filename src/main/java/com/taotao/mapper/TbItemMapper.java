package com.taotao.mapper;

import com.taotao.pojo.TbItem;

import java.util.List;
import java.util.Map;

public interface TbItemMapper {


    void insertTbitem(TbItem tbItem);
    void insertMap(Map<String, Object> map);

    void deleteById(long id);
    void deleteByIdMap(long[] ids);

    void updateTbItem(TbItem tbItem);
    void updateMap(Map<String,Object> map);



    List<TbItem> getItemByIdList();
    List<Map<String, Object>> getItemByIdListMap();

    TbItem getByIdTbItem(long id);
    Map<String,Object> getByIdMap(Map<String,Object> map);




}