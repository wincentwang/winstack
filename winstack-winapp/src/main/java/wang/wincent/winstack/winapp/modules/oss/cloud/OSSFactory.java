package wang.wincent.winstack.winapp.modules.oss.cloud;


import wang.wincent.winstack.winapp.common.utils.ConfigConstant;
import wang.wincent.winstack.winapp.common.utils.Constant;
import wang.wincent.winstack.winapp.common.utils.SpringContextUtils;
import wang.wincent.winstack.winapp.modules.sys.service.SysConfigService;

/**
 * 文件上传Factory
 */
public final class OSSFactory {
    private static SysConfigService sysConfigService;

    static {
        OSSFactory.sysConfigService = (SysConfigService) SpringContextUtils.getBean("sysConfigService");
    }

    public static CloudStorageService build(){
        //获取云存储配置信息
        CloudStorageConfig config = sysConfigService.getConfigObject(ConfigConstant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if(config.getType() == Constant.CloudService.QINIU.getValue()){
            return new QiniuCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.ALIYUN.getValue()){
            return new AliyunCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.QCLOUD.getValue()){
            return new QcloudCloudStorageService(config);
        }

        return null;
    }

}
