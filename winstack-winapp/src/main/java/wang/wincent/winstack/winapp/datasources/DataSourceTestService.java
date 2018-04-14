package wang.wincent.winstack.winapp.datasources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.wincent.winstack.winapp.datasources.annotation.DataSource;
import wang.wincent.winstack.winapp.modules.app.entity.UserEntity;
import wang.wincent.winstack.winapp.modules.app.service.UserService;

/**
 * 测试

 */
@Service
public class DataSourceTestService {
    @Autowired
    private UserService userService;

    public UserEntity queryObject(Long userId){
        return userService.queryObject(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public UserEntity queryObject2(Long userId){
        return userService.queryObject(userId);
    }
}
