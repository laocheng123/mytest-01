package com.taotao.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import com.taotao.utils.EasyUIDataGridResult;
import com.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 商品管理Service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p>
 *
 * @version 1.0
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;


    @Override
    public TaotaoResult insertTbitem(TbItem tbItem) {
        itemMapper.insertTbitem(tbItem);
        return TaotaoResult.ok();
    }

    /**
     * 增加一条 商品数据，用 map来接收 前台传递过来的数据
     * @param map
     * @return
     */
    @Override
    public TaotaoResult insertMap(Map<String, Object> map) {
        itemMapper.insertMap(map);
        return TaotaoResult.ok();
    }

    @Override
    public TaotaoResult deleteById(long id) {
       // TaotaoResult taotaoResult = new TaotaoResult();
        itemMapper.deleteById(id);
        return TaotaoResult.ok();
    }

    @Override
    public TaotaoResult deleteByIdMap(long[] idsp) {
        itemMapper.deleteByIdMap(idsp);
        
        return TaotaoResult.ok();
    }

    @Override
    public TaotaoResult updateTbitem(TbItem tbItem) {
        itemMapper.updateTbItem(tbItem);
        return  TaotaoResult.ok();
    }

    @Override
    public TaotaoResult updateMap(Map<String,Object> map) {
        itemMapper.updateMap(map);
        return  TaotaoResult.ok();
    }


    @Override
    public EasyUIDataGridResult getItemByIdList(int page, int rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        List<TbItem> itemByIdList = itemMapper.getItemByIdList();
        //取查询结果
        PageInfo<TbItem> pageInfo = new PageInfo<>(itemByIdList);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(itemByIdList);
        result.setTotal(pageInfo.getTotal());
        //返回结果
        return result;
    }


    @Override
    public EasyUIDataGridResult getItemByIdListMap(int page, int rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        List<Map<String, Object>> itemByIdListMap = itemMapper.getItemByIdListMap();
        //取查询结果
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(itemByIdListMap);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(itemByIdListMap);
        result.setTotal(pageInfo.getTotal());
        //返回结果
        return result;
    }




    @Override
    public TaotaoResult getByIdTbItem(long id) {
        TbItem byIdTbItem = itemMapper.getByIdTbItem(id);
        TaotaoResult taotaoResult = new TaotaoResult();
        taotaoResult.setData(byIdTbItem);
        return taotaoResult;
    }

    @Override
    public TaotaoResult getByIdMap(Map<String, Object> map) {

        Map<String, Object> byIdMap = itemMapper.getByIdMap(map);
        TaotaoResult taotaoResult = new TaotaoResult();
        taotaoResult.setData(byIdMap);
        return taotaoResult;
    }
}
