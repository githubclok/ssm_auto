package kulo.sgg.dao;

import java.util.List;
import kulo.sgg.entity.rmDealerInfo;

public interface rmDealerInfoMapper {
    int deleteByPrimaryKey(Integer dealerId);

    int insert(rmDealerInfo record);

    rmDealerInfo selectByPrimaryKey(Integer dealerId);

    List<rmDealerInfo> selectAll();

    int updateByPrimaryKey(rmDealerInfo record);
}