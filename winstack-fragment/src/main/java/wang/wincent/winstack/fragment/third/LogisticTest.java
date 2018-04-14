package wang.wincent.winstack.fragment.third;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class LogisticTest {


    public static final String SHOWAPI_APPID="61601";
    public static final String SHOWAPI_APPKEYSECRET="d9662c46bc954bcb939a90f47e1b42fd";
    public static final String SHOWAPI_EXPRESS_NAME="auto";//默认

    public static void main(String[] args)  {
//     测试单号
//     813773508557
//     619439572523
        StringBuffer sb=new StringBuffer();
        sb.append("http://route.showapi.com/64-19?");
        sb.append("showapi_appid=").append(SHOWAPI_APPID);
        sb.append("&showapi_sign=").append(SHOWAPI_APPKEYSECRET);
        sb.append("&com=").append("yuantong");
        sb.append("&nu=").append("813773508557");
        expTrackInfo(sb);
//        StringBuffer expList=new StringBuffer();
//        expList.append("http://route.showapi.com/64-20?");
//        expList.append("showapi_appid=").append(SHOWAPI_APPID);
//        expList.append("&showapi_sign=").append(SHOWAPI_APPKEYSECRET);
//        expList.append("&maxSize=").append(471);
//        String expressInfo = getExpressInfo(expList.toString());
//        System.out.println(expressInfo);
//        expCompanyList(expressInfo);
    }


    public static String expCompanyList(String resp){
        JSONObject jsonObject = JSONObject.parseObject(resp);
        Integer code = jsonObject.getInteger("showapi_res_code");
        if(code!=0){
            System.out.println("查询失败code："+code);
        }else{
            final String respBody = jsonObject.getString("showapi_res_body");
            JSONObject respBodyJson = JSONObject.parseObject(respBody);
            final String expList = respBodyJson.getString("expressList");
            JSONArray jsonArray = JSONArray.parseArray(expList);
            for (Object obj : jsonArray) {
                JSONObject item = (JSONObject) obj;
                System.out.println("-------------------Sep------------------------");
                String expCode=item.getString("simpleName");
                String expName=item.getString("expName");
                String phone=item.getString("phone");
                String url=item.getString("url");
                System.out.println("code:"+expCode);
                System.out.println("name:"+expName);
                System.out.println("phone:"+phone);
                System.out.println("url:"+url);
            }
        }
        return null;
    }


    public static String expTrackInfo(StringBuffer sb){
        System.out.println(sb.toString());
        final String resp = getExpressInfo(sb.toString());
        System.out.println(resp);
        JSONObject jsonObject = JSONObject.parseObject(resp);
        Integer code = jsonObject.getInteger("showapi_res_code");
        if(code!=0){
            System.out.println("查询失败code："+code);
        }else{
            final String respBody = jsonObject.getString("showapi_res_body");
            JSONObject respBodyJson = JSONObject.parseObject(respBody);
            final String expName = respBodyJson.getString("expTextName");
            final String data = respBodyJson.getString("data");
            System.out.println(expName);
            System.out.println(data);
            JSONArray jsonArray = JSONArray.parseArray(data);
            for (Object obj : jsonArray) {
                JSONObject item = (JSONObject) obj;
                String time=item.getString("time");
                String context=item.getString("context");
                System.out.println(time+"\t"+context);
            }
        }
        return null ;
    }

    public static String getExpressInfo(String url){
        URL u = null;
        InputStream in=null;
        ByteArrayOutputStream out=null;
        try {
            u = new URL(url);
            in = u.openStream();
            out = new ByteArrayOutputStream();
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in .read(buf)) > 0) {
                out.write(buf, 0, read);
            }
            byte b[] = out.toByteArray();
            return new String(b,"utf-8");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if ( in != null) {
                try {
                    in .close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
