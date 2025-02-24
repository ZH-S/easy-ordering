package org.neu.cs6650.koi.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.neu.cs6650.koi.account.entity.TAccount;
import org.apache.ibatis.annotations.Param;

public interface TAccountMapper extends BaseMapper<TAccount> {

    int decreaseAccount(@Param("userId") String userId, @Param("amount") Double amount);
}
