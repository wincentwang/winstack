package wang.wincent.winstack.winapp.modules.app.dao;


import org.apache.ibatis.annotations.Mapper;
import wang.wincent.winstack.winapp.modules.app.entity.UserEntity;
import wang.wincent.winstack.winapp.modules.sys.dao.BaseDao;

/**
 * 用户
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
