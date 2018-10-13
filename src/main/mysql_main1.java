package main;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mapper.mapper1;
import pojo.role;
import utils.getFactory;

public class mysql_main1 {

	public static void main(String[] args) {
//		SqlSession sql=getFactory.get();
//		mapper1 map=sql.getMapper(mapper1.class);
//		
//		map.delete(8);
//		
//		List<role> m=map.SelectAll();
//		sql.commit();
//		sql.close();
//		System.out.println(m);
		String h="Hello world";
		System.out.println(h=="hello "+"world");
		
	}

}
