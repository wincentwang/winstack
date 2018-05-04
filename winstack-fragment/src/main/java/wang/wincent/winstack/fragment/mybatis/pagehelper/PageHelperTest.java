package wang.wincent.winstack.fragment.mybatis.pagehelper;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import wang.wincent.winstack.fragment.model.TbUser;

import java.io.InputStream;
import java.util.*;

/**
 * @author Wincent
 * @description: <描述>
 * @create 2018-04-19 17:41
 */
public class PageHelperTest {



    @Test
    public void testInsert()throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        session.getConnection().setAutoCommit(true);
        for(int i=0;i<1000;i++){
            TbUser user=new TbUser();
            user.setName("Wang"+i);
            user.setAge(i);
            user.setGender(i%2);
            session.insert("wang.wincent.winstack.fragment.mapper.TbUserMapper.insertSelective",user);
        }
    }

    @Test
    public void testPage()throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        PageHelper.startPage(1, 50);
        //startPage后紧跟的这个查询就是分页查询
        List<TbUser> emps = session.selectList("wang.wincent.winstack.fragment.mapper.TbUserMapper.selectAll");
        emps.forEach(System.out::println);
        //使用PageInfo包装查询结果，只需要将pageInfo交给页面就可以
        PageInfo pageInfo = new PageInfo<>(emps);
        System.out.println(pageInfo);
        ObjectMapper om=new ObjectMapper();
        System.out.println(om.writeValueAsString(pageInfo));

    }


    @Test
    public  void test() {
        String p = "1,2,3,4,5";
        String p1 = "7,3,4,6,5";
        List<Integer> integers = sortTag(p, p1);
    }

    private static List<Integer> sortTag(String tags, String sorts) {
        String[] tagIds = tags.split(",");
        String[] sortIds = sorts.split(",");
        if (tagIds.length == sortIds.length) {
            Map<Integer, Integer> tagSort = new HashMap<>();
            Integer[] sort = new Integer[sortIds.length];
            //保存tag-sort对应关系
            for (int i = 0; i < tagIds.length; i++) {
                tagSort.put(Integer.parseInt(sortIds[i]), Integer.parseInt(tagIds[i]));
                sort[i] = Integer.parseInt(sortIds[i]);
            }
            Arrays.sort(sort);
            List<Integer> result = new ArrayList<>();
            for (Integer i : sort) {
                result.add(tagSort.get(i));
            }
            return result;
        }
        return null;
    }
}
