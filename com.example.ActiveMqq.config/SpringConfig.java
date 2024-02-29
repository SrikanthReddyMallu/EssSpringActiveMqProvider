package com.example.ActiveMqq.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.print.attribute.standard.Destination;
import java.util.Queue;

@Configuration
@EnableJms
public class SpringConfig
{
    String BROKER_URL =      "tcp://localhost:61616";
    String BROKER_USERNAME =  "admin";
    String BROKER_PASSWORD = "admin";
    @Bean
    public ActiveMQConnectionFactory connectionFactory()

    {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL(BROKER_URL);
        connectionFactory.setUserName(BROKER_USERNAME);
        connectionFactory.setPassword(BROKER_PASSWORD);
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate()
    {
        JmsTemplate jmsTemplate = new JmsTemplate();
        //jmsTemplate.setPubSubDomain(true);
        jmsTemplate.setConnectionFactory(connectionFactory());
        return jmsTemplate;
    }

}
