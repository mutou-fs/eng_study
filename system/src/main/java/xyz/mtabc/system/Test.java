package xyz.mtabc.system;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/eng_study", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("木头") // 设置作者
                            .outputDir("D:/WorkSpace/IdeaProjects/eng_study/system/src/main/java/"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("xyz.mtabc") // 设置父包名
                            .moduleName("system") ;// 设置父包模块名
                })
                .strategyConfig(builder -> {
                    builder.addInclude("course") ;// 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
