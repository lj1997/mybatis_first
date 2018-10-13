package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pojo.role;

public interface mapper1 {
          role SelectOne(String name);
          List<role> SelectAll();
          void insert(String name);
          void delete(@Param("id")int id);
          void update(@Param("id")int id1,@Param("name")String name2 );
}
