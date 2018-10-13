package utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public  class  getFactory {
  private static SqlSessionFactory sqlSessionFactory = null;
  
  private static  SqlSessionFactory getfactory() {
	  String resource = "mybatis-config.xml";
	  InputStream inputStream;
	  try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return sqlSessionFactory;
  }
  
  public static SqlSession get() {
	  if(sqlSessionFactory==null)
		  sqlSessionFactory=getfactory();
	  return sqlSessionFactory.openSession();
  }
}


