package wang.wincent.winstack.winapp.modules.job.dao;


import org.apache.ibatis.annotations.Mapper;
import wang.wincent.winstack.winapp.modules.job.entity.ScheduleJobEntity;
import wang.wincent.winstack.winapp.modules.sys.dao.BaseDao;

import java.util.Map;

/**
 * 定时任务
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
