package com.mariano.sandbox.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraConfiguration {
//public class CassandraConfiguration extends AbstractCassandraConfiguration {
    //@Override
    //protected String getKeyspaceName() {
    //    return "\"my-release-cassandra\"";
    //}
/*
    @Bean
    @Override
    public CqlSessionFactoryBean cassandraSession() {
        CqlSessionFactoryBean cassandraSession = super.cassandraSession();//super session should be called only once
        cassandraSession.setUsername("cassandra");
        cassandraSession.setPassword("bSFzJ0EoME");
        return cassandraSession;
    }

    @Bean
    CqlSessionBuilderCustomizer authCustomizer(CassandraProperties properties) {
        return (builder) -> builder.withAuthCredentials(properties.getUsername(), properties.getPassword());
    }*/
}