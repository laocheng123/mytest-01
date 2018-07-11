<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>


<div style="padding:10px 10px 10px 10px">
    <form id="itemeSearchForm" class="itemForm" method="post">
        <input type="hidden" name="id"/>
        <table cellpadding="5">
            <tr>
                <td>商品类目:</td>
                <td>
                    <a href="javascript:void(0)" class="easyui-linkbutton selectItemCat">选择类目</a>
                    <input type="hidden" name="cid" style="width: 280px;"></input>
                </td>
            </tr>
            <tr>
                <td>商品标题:</td>
                <td><input class="easyui-textbox" type="text" name="title" data-options="required:true" readonly="true"
                           style="width: 280px;"></input></td>
            </tr>
            <tr>
                <td>商品卖点:</td>
                <td><input class="easyui-textbox" name="sellPoint" data-options="required:true" readonly="true"
                           style="height:60px;width: 280px;"></input></td>
            </tr>
            <tr>
                <td>商品价格:</td>
                <td><input class="easyui-numberbox" type="text" name="priceView" readonly="true"
                           data-options="min:1,max:99999999,precision:2,required:true"/>
                    <input type="hidden" name="price"/>
                </td>
            </tr>
            <tr>
                <td>库存数量:</td>
                <td><input class="easyui-numberbox" type="text" name="num" readonly="true"
                           data-options="min:1,max:99999999,precision:0,required:true"/></td>
            </tr>
            <tr>
                <td>条形码:</td>
                <td>
                    <input class="easyui-textbox" type="text" name="barcode" readonly="true"
                           data-options="validType:'length[1,30]'"/>
                </td>
            </tr>
            <tr>
                <td>商品图片:</td>
                <td>
                    <a href="javascript:void(0)" readonly="true" class="easyui-linkbutton picFileUpload">上传图片</a>
                    <input type="hidden" name="image"/>
                </td>
            </tr>
            <tr>
                <td>商品描述:</td>
                <td>
                    <textarea style="width:800px;height:300px;visibility:hidden;" name="desc"></textarea>
                </td>
            </tr>
            <tr class="params hide" readonly="true">
                <td>商品规格:</td>
                <td>

                </td>
            </tr>
        </table>
        <input type="hidden" name="itemParams"/>
        <input type="hidden" name="itemParamId"/>
    </form>
</div>
<script>
    var itemEditEditor ;
    $(function () {
        //实例化编辑器
        itemEditEditor = TAOTAO.createEditor("#itemeSearchForm [name=desc]");
        itemEditEditor.readonly(true);


    })
</script>
