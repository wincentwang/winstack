package wang.wincent.winstack.fragment.third;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpCompanyTest {

//
//    public static final String SHOWAPI_APPID="61601";
//    public static final String SHOWAPI_APPKEYSECRET="";
//    public static final String SHOWAPI_EXPRESS_NAME="auto";//默认
//
//
//    public static void main(String[] args) throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = factory.openSession();
//        List<BwDeliveryCompanyDto> a=session.selectList("wang.wincent.winstack.fragment.mapper.BwDeliveryCompanyMapper.selectAll",BwDeliveryCompanyDto.class);
//        for (BwDeliveryCompanyDto b: a) {
//            System.out.println(b);
//        }
////      List<BwDeliveryCompany> lists=expCompanyList();
////      for (BwDeliveryCompany c:lists) {
////          System.out.println(c);
////          session.insert("wang.wincent.winstack.fragment.mapper.BwDeliveryCompanyMapper.insertSelective", c);
////      }
////      session.update("user.updateUserPassword", user);
//        session.commit();
//        session.close();
//    }
//
//
//
//    public static List<BwDeliveryCompany> expCompanyList(){
//        List<BwDeliveryCompany>  list=new ArrayList<BwDeliveryCompany>();
//        StringBuffer reqUrl=new StringBuffer();
//        reqUrl.append("http://route.showapi.com/64-20?");
//        reqUrl.append("showapi_appid=").append(SHOWAPI_APPID);
//        reqUrl.append("&showapi_sign=").append(SHOWAPI_APPKEYSECRET);
//        reqUrl.append("&maxSize=").append(471);
//        String expressInfo = getExpressInfo(reqUrl.toString());
//        JSONObject jsonObject = JSONObject.parseObject(expressInfo);
//        Integer code = jsonObject.getInteger("showapi_res_code");
//        if(code!=0){
//            System.out.println("查询失败code："+code);
//        }else{
//            final String respBody = jsonObject.getString("showapi_res_body");
//            JSONObject respBodyJson = JSONObject.parseObject(respBody);
//            final String expList = respBodyJson.getString("expressList");
//            JSONArray jsonArray = JSONArray.parseArray(expList);
//            for (Object obj : jsonArray) {
//                JSONObject item = (JSONObject) obj;
//                BwDeliveryCompany com=new BwDeliveryCompany();
//                String expCode=item.getString("simpleName");
//                String expName=item.getString("expName");
//                String phone=item.getString("phone");
//                String url=item.getString("url");
//                com.setCode(expCode);
//                com.setName(expName);
//                com.setPhone(phone);
//                com.setMemo(url);
//                com.setState((byte)1);
//                com.setCreateTime(new Date());
//                com.setUpdateTime(new Date());
//                list.add(com);
//            }
//        }
//        return list;
//    }
//
//
//
//    public static String getExpressInfo(String url){
//        URL u = null;
//        InputStream in=null;
//        ByteArrayOutputStream out=null;
//        try {
//            u = new URL(url);
//            in = u.openStream();
//            out = new ByteArrayOutputStream();
//            byte buf[] = new byte[1024];
//            int read = 0;
//            while ((read = in .read(buf)) > 0) {
//                out.write(buf, 0, read);
//            }
//            byte b[] = out.toByteArray();
//            return new String(b,"utf-8");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if ( in != null) {
//                try {
//                    in .close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(out!=null){
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return null;
//    }




}
