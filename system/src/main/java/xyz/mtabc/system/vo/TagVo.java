package xyz.mtabc.system.vo;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 标签库
 * </p>
 *
 * @author 木头
 * @since 2022-02-05
 */
@Data
@ToString
public class TagVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标签名
     */
    @TableField(value = "name", insertStrategy = FieldStrategy.NOT_NULL)
    private String name;

    /**
     * 父标签
     */
    private Integer parent;

    /**
     * 热度
     */
    private Integer popularity;
}
