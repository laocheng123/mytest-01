package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面展示Controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/PageController/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}


	@RequestMapping("/test")
	public void test(TbItemUtils tbItemUtils) {
		for(TbItem tbItem :tbItemUtils.getItems()){
			System.out.println(tbItem.getSellPoint());
		}
	}



	
}
