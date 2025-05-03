package io.renren.modules.exam.entity.vo;

import lombok.Data;

/**
 *  @author timelocked
 * @Date 2023/1/8 15:42
 **/
@Data
public class QuestionNumVO {

    private Integer questionTypeId;

    private String typeName;

    private Float score;

    private Integer num;
}
