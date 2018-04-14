package wang.wincent.winstack.winapp.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;
import wang.wincent.winstack.winapp.modules.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
