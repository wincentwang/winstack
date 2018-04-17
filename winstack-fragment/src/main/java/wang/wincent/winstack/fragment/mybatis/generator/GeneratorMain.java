package wang.wincent.winstack.fragment.mybatis.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratorMain {

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;//如果已经生成过了是否进行覆盖
        String genCfg = "/generatorConfig.xml";//配置文件的路径:默认放到src下面
        URL url = GeneratorMain.class.getResource(genCfg);
        String file = url.getFile();
        File configFile = new File(file);
        ConfigurationParser cfgParser = new ConfigurationParser(warnings);//配置文件解析器
        Configuration config = cfgParser.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
        generator.generate(null);
        System.out.println("mybatis 代码生成成功。。。");
    }
}
