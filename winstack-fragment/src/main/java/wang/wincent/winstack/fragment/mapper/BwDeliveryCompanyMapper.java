package wang.wincent.winstack.fragment.mapper;


import wang.wincent.winstack.fragment.model.BwDeliveryCompany;

public interface BwDeliveryCompanyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(BwDeliveryCompany record);

    int insertSelective(BwDeliveryCompany record);

    BwDeliveryCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwDeliveryCompany record);

    int updateByPrimaryKey(BwDeliveryCompany record);

}