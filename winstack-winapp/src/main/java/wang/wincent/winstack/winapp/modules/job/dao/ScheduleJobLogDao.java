package wang.wincent.winstack.winapp.modules.job.dao;


import org.apache.ibatis.annotations.Mapper;
import wang.wincent.winstack.winapp.modules.job.entity.ScheduleJobLogEntity;
import wang.wincent.winstack.winapp.modules.sys.dao.BaseDao;

/**
 * 定时任务日志

 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
