package io.renren.modules.exam.dao;

import io.renren.modules.exam.entity.StudentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生信息表
 * 
 * @author timelocked
 * @email huanyixin447@gmail.com
 * @date 2023-01-06 22:13:25
 */
@Mapper
public interface StudentDao extends BaseMapper<StudentEntity> {
	
}
