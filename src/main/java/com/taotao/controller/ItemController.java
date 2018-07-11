package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import com.taotao.utils.EasyUIDataGridResult;
import com.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p>
 *
 * @version 1.0
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


    /**
     * 用于跳转到新增的页面
     * @return
     */
    @RequestMapping(value = "/rest/item-add")
    public String insertTo(){

        return "item-add";
    }

    /**
     * 增加一条商品数据，用TbItem来接收
     * @param
     *
     */

   @RequestMapping(value = "/item/insertTbitem")
    @ResponseBody
    public TaotaoResult insertTbitem(){
        try {
            TbItem tbItem = new TbItem();
            tbItem.setSellPoint("营销很成功");
            TaotaoResult result = itemService.insertTbitem(tbItem);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  null;
    }
    /**
     * 增加一条商品数据，用map来接收
     * @param
     * @RequestParam Map<String,Object> map
     */
    @RequestMapping(value = "/item/insertMap")
    @ResponseBody
    public TaotaoResult insertMap(){
        try {
            Map<String,Object> map = new HashMap<>();
            map.put("sellPoint","品牌效应不错");
            TaotaoResult result = itemService.insertMap(map);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 删除一条数据(基本数据类型接收)
     * 要求：用基本数据类型来接收前端传递过来的参数
     */
    @RequestMapping(value = "/item/deleteById")
    @ResponseBody
    public TaotaoResult  deleteById(long id){
        TaotaoResult result = itemService.deleteById(id);
        return result;
    }

    /**
     * 删除一条数据（map）
     * 要求：用map来接收前端传递过来的参数
     *
     */
    @RequestMapping(value = "/item/deleteByIdMap")
    @ResponseBody

    public TaotaoResult  deleteByIdMap(@RequestParam long[] ids){
        TaotaoResult result = itemService.deleteByIdMap(ids);
        return result;
    }



    /**
     * 用于跳转到编辑的页面
     * @return
     */
    @RequestMapping(value = "/rest/item-edit")
    public String updateTo(){

        return "item-edit";
    }



    /**
     * 用tbItem来接收前台 传递过来的参数
     * 更新一条数据（tbItem接收）
     * @param
     * @return
     * TbItem tbItem
     */
    @RequestMapping(value = "/item/updateTbItem")
    @ResponseBody
    public TaotaoResult updateTbItem(){
        TaotaoResult taotaoResult;
        try {
            TbItem tbItem = new TbItem();
            tbItem.setId(2L);
            tbItem.setSellPoint("销量很好，赶紧存货！");
            taotaoResult = itemService.updateTbitem(tbItem);
            return taotaoResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 更新一条数据（用map来接收）
     * 用map来接收前台 传递过来的参数
     * @param
     * @return
     * @RequestParam Map<String,Object> map
     */
    @RequestMapping(value = "/item/updateMap")
    @ResponseBody
    public TaotaoResult updateMap(){

        try {
            Map<String,Object> map = new HashMap<>();
            map.put("id",1);
            map.put("sell_point","配置不错，很满意");
            TaotaoResult  taotaoResult = itemService.updateMap(map);
            return taotaoResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询所有商品并分页（用list响应给前端页面）
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/item/getItemByIdList")
    @ResponseBody
    public EasyUIDataGridResult  getItemByIdList(){
        try {
            EasyUIDataGridResult easyUIDataGridResult = itemService.getItemByIdList(1,10);
            return easyUIDataGridResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询所有商品并分页（用map响应给前端页面）
     *
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/item/getItemByIdListMap")
    @ResponseBody
    public EasyUIDataGridResult getItemByIdListMap(int page, int rows){
        try {
            EasyUIDataGridResult easyUIDataGridResult = itemService.getItemByIdListMap(page, rows);
            return easyUIDataGridResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 用于跳转到编辑的页面
     * @return
     */
    @RequestMapping(value = "/rest/item-search")
    public String searchTo(){

        return "item-search";
    }

    /**
     * 查询一条商品记录（用tbItem接收）
     * 要求：用来接收前端传递过来的参数
     */
    @RequestMapping(value = "/item/getByIdTbItem")
    @ResponseBody
    public TaotaoResult getByIdTbItem(){
        TaotaoResult result = itemService.getByIdTbItem(1);
        return result;
    }


    /**
     * 查询一条商品记录（用map来接收前端传递过来的参数）
     * 要求：用map来接收前端传递过来的参数
     */
    @RequestMapping(value = "/item/getByIdMap")
    @ResponseBody
    public TaotaoResult getByIdMap(){
        Map<String,Object> map = new HashMap();
        map.put("id",1);
        TaotaoResult result = itemService.getByIdMap(map);
        return result;
    }








}
