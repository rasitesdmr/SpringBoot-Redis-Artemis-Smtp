package com.example.redis.config;

import java.time.Duration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;


@Configuration
@EnableCaching
public class RedisConfiguration{   // Redis konfigürasyonlarını yaptığım sınıftır.


    @Bean
    RedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    RedisCacheConfiguration cacheConfiguration() {
        return RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofSeconds(60))    // Ön belleğin kaç saniyede veritabanını yenileyeceğini belirtir.
                .disableCachingNullValues();
    }

    @Bean
    RedisCacheManager cacheManager() {
        return RedisCacheManager.builder(connectionFactory())
                .cacheDefaults(cacheConfiguration())
                .transactionAware()
                .build();
    }
}
