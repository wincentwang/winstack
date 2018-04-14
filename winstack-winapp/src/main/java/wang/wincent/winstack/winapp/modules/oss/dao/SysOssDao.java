package wang.wincent.winstack.winapp.modules.oss.dao;


import org.apache.ibatis.annotations.Mapper;
import wang.wincent.winstack.winapp.modules.oss.entity.SysOssEntity;
import wang.wincent.winstack.winapp.modules.sys.dao.BaseDao;

/**
 * 文件上传
 * 

 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
