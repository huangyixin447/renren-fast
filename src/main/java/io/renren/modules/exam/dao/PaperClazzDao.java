package io.renren.modules.exam.dao;

import io.renren.modules.exam.entity.PaperClazzEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 试卷分配给班级
 * 
 * @author timelocked
 * @email huanyixin447@gmail.com
 * @date 2023-01-09 18:35:47
 */
@Mapper
public interface PaperClazzDao extends BaseMapper<PaperClazzEntity> {
	
}
