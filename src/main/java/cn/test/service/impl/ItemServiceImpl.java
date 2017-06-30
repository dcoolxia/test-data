package cn.test.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.test.datasource.DBContextHolder;
import cn.test.datasource.DataSource;
import cn.test.mapper.TbItemMapper;
import cn.test.pojo.TbItem;
import cn.test.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	@DataSource("dataSourceRW")
	public List<TbItem> getItemById(long itemId) {
	    /* 手动切换数据源
	    if(itemId == 1){
	        DBContextHolder.setDbType(DBContextHolder.DB_TYPE_RW);
	    }else{
	        DBContextHolder.setDbType(DBContextHolder.DB_TYPE_R);
	    }*/
		//执行查询
		List<TbItem> list = itemMapper.selectByExample(itemId);
		
		return list;
	}
	
	@Override
	@DataSource("dataSourceR")
	public List<TbItem> getItemById2(long itemId) {
	    //执行查询
	    List<TbItem> list = itemMapper.selectByExample(itemId);
	    
	    return list;
	}
	
	@Override
	@DataSource("dataSourceRW")
	public int addItem(){
	    TbItem item = new TbItem();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String format = sdf.format(new Date());
	    item.setTitle(format);
	    int i = itemMapper.insert(item);
	    //int j = 1/0;//测试事务
	    return i;
	}
	
	@Override
	@DataSource("dataSourceR")
	public int addItem2(){
	    TbItem item = new TbItem();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String format = sdf.format(new Date());
	    item.setTitle(format);
	    int i = itemMapper.insert(item);
	    return i;
	}
	

}
