package io.renren.modules.exam.dao;

import io.renren.modules.exam.entity.NoticeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 公告
 * 
 * @author timelocked
 * @email huanyixin447@gmail.com
 * @date 2023-01-24 15:47:26
 */
@Mapper
public interface NoticeDao extends BaseMapper<NoticeEntity> {
	
}
