package io.renren.modules.exam.dao;

import io.renren.modules.exam.entity.QuestionRecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.exam.entity.vo.PaperRecordVO;
import io.renren.modules.exam.entity.vo.QuestionRecordList;
import io.renren.modules.exam.entity.vo.QuestionRecordVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 考试记录 题目记录
 *
 * @author timelocked
 * @email huanyixin447@gmail.com
 * @date 2023-01-17 15:25:52
 */
@Mapper
public interface QuestionRecordDao extends BaseMapper<QuestionRecordEntity> {

    List<QuestionRecordList> questionRecordsByQuesResId(@Param("quesResId") String quesResId, @Param("typeId") Integer typeId);

}
