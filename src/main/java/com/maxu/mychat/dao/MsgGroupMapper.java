package com.maxu.mychat.dao;

import com.maxu.mychat.model.MsgGroup;
import com.maxu.mychat.model.MsgGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgGroupMapper {
    int countByExample(MsgGroupExample example);

    int deleteByExample(MsgGroupExample example);

    int deleteByPrimaryKey(Integer msgfrom);

    int insert(MsgGroup record);

    int insertSelective(MsgGroup record);

    List<MsgGroup> selectByExample(MsgGroupExample example);

    MsgGroup selectByPrimaryKey(Integer msgfrom);

    int updateByExampleSelective(@Param("record") MsgGroup record, @Param("example") MsgGroupExample example);

    int updateByExample(@Param("record") MsgGroup record, @Param("example") MsgGroupExample example);

    int updateByPrimaryKeySelective(MsgGroup record);

    int updateByPrimaryKey(MsgGroup record);
}