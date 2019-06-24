/**
 * Copyright © 2017 sdjictec.Co.Ltd. All rights reserved.
 **/
package com.sdjictec.bqdrtime.rtimedata.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @类名: DataSourceConfig
 * @功能描述:
 * @程序开发者：娄乾
 * @编写日期：2017/11/23
 */
@Configuration
public class DataSourceConfig {
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.meta")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }


//
//    @Bean(name = "ETLDataSource")
//    @Qualifier("ETLDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.etl")
//    public DataSource ETLDataSource() {
//        return DataSourceBuilder.create().build();
//    }


    @Bean(name = "sparkjobinfoDataSource")
    @Qualifier("sparkjobinfoDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.sparkjob")
    public DataSource sparkjobDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sparkJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(
            @Qualifier("sparkjobinfoDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
