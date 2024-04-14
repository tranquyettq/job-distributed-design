package com.tranquyet.task.producer;

import com.tranquyet.task.producer.dto.ProducerJobDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;

import java.util.Date;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        RabbitAutoConfiguration.class,
        RedisRepositoriesAutoConfiguration.class,
        RedisAutoConfiguration.class})
@Slf4j
public class TaskModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskModuleApplication.class, args);
        ProducerJobDTO dto = ProducerJobDTO.builder().id(10L).build();
        dto.setCreatedDate(new Date().toString());
        log.info("CHECK: "+ dto);
    }

}
