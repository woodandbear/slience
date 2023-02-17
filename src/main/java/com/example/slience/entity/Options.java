package com.example.slience.entity;



/**
 * (Options)表实体类
 *
 * @author makejava
 * @since 2023-02-17 11:03:48
 */

public class Options {
    //选项ID
    private Integer optionId;
    //选项名称
    private String optionName;
    //限制
    private Integer optionsLimit;
    //已选数量
    private Integer optionsCount;


    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Integer getOptionsLimit() {
        return optionsLimit;
    }

    public void setOptionsLimit(Integer optionsLimit) {
        this.optionsLimit = optionsLimit;
    }

    public Integer getOptionsCount() {
        return optionsCount;
    }

    public void setOptionsCount(Integer optionsCount) {
        this.optionsCount = optionsCount;
    }

    }

