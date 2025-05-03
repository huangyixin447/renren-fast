package io.renren.modules.exam.dao;

import io.renren.modules.exam.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.exam.entity.vo.QuestionNumVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 题目
 *
 * @author timelocked
 * @email huanyixin447@gmail.com
 * @date 2023-01-06 22:13:25
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {

    List<QuestionNumVO> getQuestionNumListBySubjectId(Integer subjectId);

    List<QuestionNumVO> getQuestionNumWithSubjectIdGroupByType(Integer subjectId);
}
