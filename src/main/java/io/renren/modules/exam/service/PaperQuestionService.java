package io.renren.modules.exam.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.exam.entity.PaperQuestionEntity;

import java.util.Map;

/**
 * 试卷与题目关联表
 *
 * @author timelocked
 * @email huanyixin447@gmail.com
 * @date 2023-01-08 19:05:12
 */
public interface PaperQuestionService extends IService<PaperQuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);

}

