package wang.wincent.winstack.winapp.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;
import wang.wincent.winstack.winapp.modules.sys.entity.SysLogEntity;

/**
 * 系统日志
 */
@Mapper
public interface SysLogDao extends BaseDao<SysLogEntity> {
	
}
