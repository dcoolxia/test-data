package cn.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.test.pojo.TbItem;
import cn.test.service.ItemService;


@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/get/{itemId}")
	@ResponseBody
	public List<TbItem> getItemById(@PathVariable Long itemId) {
		List<TbItem> list = itemService.getItemById(itemId);
		return list;
	}
	
	@RequestMapping("/get2/{itemId}")
	@ResponseBody
	public List<TbItem> getItemById2(@PathVariable Long itemId) {
	    List<TbItem> list = itemService.getItemById2(itemId);
	    return list;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public int add() {
	    
	    return itemService.addItem();
	}
	
	@RequestMapping("/add2")
	@ResponseBody
	public int add2() {
	    
	    return itemService.addItem2();
	}
}
