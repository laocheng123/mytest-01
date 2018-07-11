package com.taotao.pojo;

import java.io.Serializable;
import java.util.List;

public class TbItemUtils implements Serializable{

   private List<TbItem> items;

    public List<TbItem> getItems() {
        return items;
    }

    public void setItems(List<TbItem> items) {
        this.items = items;
    }
}