package io.renren.modules.exam.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *  @author timelocked
 * @Date 2023/1/17 15:34
 **/
@Data
public class QuestionRecordDTO implements Serializable {

    private Integer questionId;
    private String stuAnswer;
}
