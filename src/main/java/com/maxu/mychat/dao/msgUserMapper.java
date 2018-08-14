package com.maxu.mychat.dao;

import com.maxu.mychat.model.msgUser;
import com.maxu.mychat.model.msgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface msgUserMapper {
    int countByExample(msgUserExample example);

    int deleteByExample(msgUserExample example);

    int insert(msgUser record);

    int insertSelective(msgUser record);

    List<msgUser> selectByExample(msgUserExample example);

    int updateByExampleSelective(@Param("record") msgUser record, @Param("example") msgUserExample example);

    int updateByExample(@Param("record") msgUser record, @Param("example") msgUserExample example);
}