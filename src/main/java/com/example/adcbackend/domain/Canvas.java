package com.example.adcbackend.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName canvas
 */
@TableName(value ="canvas")
@Data
public class Canvas implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Object tags;

    /**
     * 
     */
    private String constraints;

    /**
     * 
     */
    private String dsa;

    /**
     * 
     */
    private String complexity;

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private String test;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Canvas other = (Canvas) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getConstraints() == null ? other.getConstraints() == null : this.getConstraints().equals(other.getConstraints()))
            && (this.getDsa() == null ? other.getDsa() == null : this.getDsa().equals(other.getDsa()))
            && (this.getComplexity() == null ? other.getComplexity() == null : this.getComplexity().equals(other.getComplexity()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTest() == null ? other.getTest() == null : this.getTest().equals(other.getTest()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        result = prime * result + ((getDsa() == null) ? 0 : getDsa().hashCode());
        result = prime * result + ((getComplexity() == null) ? 0 : getComplexity().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTest() == null) ? 0 : getTest().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", tags=").append(tags);
        sb.append(", constraints=").append(constraints);
        sb.append(", dsa=").append(dsa);
        sb.append(", complexity=").append(complexity);
        sb.append(", code=").append(code);
        sb.append(", test=").append(test);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}