package com.shop4j.cloud.test.generator;

import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Generator App Tests
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/13
 */
public class GeneratorTests {

    private static final Logger log = LoggerFactory.getLogger(GeneratorTests.class);


    @Test
    public void context() throws XMLParserException, IOException,
            InvalidConfigurationException, SQLException, InterruptedException {

        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("generatorConfig.xml");

        List<String> warnings = new ArrayList<>();
        ConfigurationParser parser = new ConfigurationParser(warnings);
        Configuration config = parser.parseConfiguration(resourceAsStream);

        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
        generator.generate(null);
        for (String warning : warnings) {
            log.warn(warning);
        }
        log.info("finish!");

    }

}
