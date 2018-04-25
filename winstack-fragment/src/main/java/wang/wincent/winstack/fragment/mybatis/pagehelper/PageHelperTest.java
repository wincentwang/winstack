package wang.wincent.winstack.fragment.mybatis.pagehelper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import wang.wincent.winstack.fragment.model.BwDeliveryCompanyDto;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author Wincent
 * @description: <描述>
 * @create 2018-04-19 17:41
 */
public class PageHelperTest {

//    public static void main(String[] args) throws Exception {
//
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = factory.openSession();
//        List<BwDeliveryCompanyDto> a=session.selectList("wang.wincent.winstack.fragment.mapper.BwDeliveryCompanyMapper.selectAll",BwDeliveryCompanyDto.class);
//        for (BwDeliveryCompanyDto b: a) {
//            System.out.println(b);
//        }
//
//    }



    public static void main(String[] args) {
        String p="1,2,3,4,5";
        String p1="7,3,4,6,5";
        List<Integer> integers = sortTag(p, p1);
        integers.forEach(System.out::println);
    }

    private static List<Integer> sortTag(String tags,String sorts){
//        if(StringUtils.isNoneBlank(tags)&&StringUtils.isNoneBlank(sorts)){
            String[] tagIds = tags.split(",");
            String[] sortIds = sorts.split(",");
            if(tagIds.length==sortIds.length){
                Map<Integer,Integer> tagSort=new HashMap<>();
                Integer[] sort=new Integer[sortIds.length];
                //保存tag-sort对应关系

                for (int i=0;i<tagIds.length;i++){
                    tagSort.put(Integer.parseInt(sortIds[i]),Integer.parseInt(tagIds[i]));
                    sort[i]=Integer.parseInt(sortIds[i]);
                }
                Arrays.sort(sort);
                List<Integer> result=new ArrayList<>();
                for(Integer i:sort){
                    result.add(tagSort.get(i));
                }
                return result;
            }
//        }
        return null;
    }
}
