package cn.test.service;

import java.util.List;

import cn.test.pojo.TbItem;

public interface ItemService {

    List<TbItem> getItemById(long itemId);
    
    List<TbItem> getItemById2(long itemId);
    
    int addItem();
    
    int addItem2();
}
