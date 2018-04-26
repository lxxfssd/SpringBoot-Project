//package com.gac.datasource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration //表示将这个注入到springBoot这容器中
//@MapperScan(basePackages = "com.gac.test01", sqlSessionFactoryRef = "test1SqlSessionFactory")
//public class DataSource1Config {
//
//    /**
//     * 功能描述:(配置test1数据库)
//     * @return
//     */
//    @Bean(name = "test1DataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.test1")
//    public DataSource testDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    /**
//     * 功能描述:(test1 sql会话工厂)
//     * @param dataSource
//     * @return
//     * @throws Exception
//     */
//    @Bean(name = "test1SqlSessionFactory")
//    @Primary
//    public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
////        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
////                .getResources("classpath:mybatis/mapper/test1/*.xml"));
//        return bean.getObject();
//    }
//
//    /**
//     * 功能描述:(test1 事物管理)
//     * @param dataSource
//     * @return
//     */
//    @Bean(name = "test1TransactionManager")
//    public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    /**
//     * session模板
//     * @param sqlSessionFactory
//     * @return
//     */
//    @Bean(name = "test1SqlSessionTemplate")
//    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//}
