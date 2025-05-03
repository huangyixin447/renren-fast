package io.renren.modules.exam.entity.dto;

import lombok.Data;

/**
 *  @author timelocked
 * @Date 2023/1/29 13:16
 **/
@Data
public class StuScoreDTO extends  PageDTO{

    private String paperTitle;
    private String stuName;
    private Integer major;
    private Integer clazz;
    private Integer subjectId;
}
