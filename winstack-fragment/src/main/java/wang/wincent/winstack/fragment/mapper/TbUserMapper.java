package wang.wincent.winstack.fragment.mapper;


import wang.wincent.winstack.fragment.model.TbUser;

import java.util.List;

public interface TbUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    List<TbUser> selectAll();

}