package com.taotao.service;

import com.taotao.pojo.TbItem;
import com.taotao.utils.EasyUIDataGridResult;
import com.taotao.utils.TaotaoResult;

import java.util.Map;

public interface ItemService {

    TaotaoResult insertTbitem(TbItem tbItem);
    TaotaoResult insertMap(Map<String,Object> map);



    TaotaoResult deleteById(long id);
    TaotaoResult deleteByIdMap(long[] ids);


    TaotaoResult updateTbitem(TbItem tbItem);
    TaotaoResult updateMap(Map<String,Object> map);




    EasyUIDataGridResult getItemByIdList(int page, int rows);
    EasyUIDataGridResult getItemByIdListMap(int page, int rows);

    TaotaoResult getByIdTbItem(long id);
    TaotaoResult getByIdMap(Map<String,Object> map);


}
