package kulo.sgg.dao;

import java.util.List;
import kulo.sgg.entity.RmDealerInfoEntity;

public interface RmDealerInfoEntityMapper {
    int deleteByPrimaryKey(Integer dealerId);

    int insert(RmDealerInfoEntity record);

    RmDealerInfoEntity selectByPrimaryKey(Integer dealerId);

    List<RmDealerInfoEntity> selectAll();

    int updateByPrimaryKey(RmDealerInfoEntity record);
}