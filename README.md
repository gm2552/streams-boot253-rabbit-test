# streams-boot253-rabbit-test
Testing spring cloud streams rabbit binder with Spring Boot 2.5.3

Run with 'mvn spring-boot:run'.  This should cause a NoSuchMethodError exception.

Produces the following errors:

```
2021-07-28 12:30:29.113 Exception encountered during context initialization - cancelling refresh attempt:
org.springframework.context.ApplicationContextException: Failed to start bean 'inputBindingLifecycle'; 
nested exception is java.lang.NoSuchMethodError: org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter.<init>(Lorg/springframework/amqp/rabbit/listener/AbstractMessageListenerContainer;)V


APPLICATION FAILED TO START
***************************

Description:

An attempt was made to call a method that does not exist. The attempt was made from the following location:

    org.springframework.cloud.stream.binder.rabbit.RabbitMessageChannelBinder.createConsumerEndpoint(RabbitMessageChannelBinder.java:517)

The following method did not exist:

    org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter.<init>(Lorg/springframework/amqp/rabbit/listener/AbstractMessageListenerContainer;)V

The method's class, org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter, is available from the following locations:

    jar:file:/home/pi/.m2/repository/org/springframework/integration/spring-integration-amqp/5.5.2/spring-integration-amqp-5.5.2.jar!/org/springframework/integration/amqp/inbound/AmqpInboundChannelAdapter.class

The class hierarchy was loaded from the following locations:

    org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter: file:/home/pi/.m2/repository/org/springframework/integration/spring-integration-amqp/5.5.2/spring-integration-amqp-5.5.2.jar
    org.springframework.integration.endpoint.MessageProducerSupport: file:/home/pi/.m2/repository/org/springframework/integration/spring-integration-core/5.5.2/spring-integration-core-5.5.2.jar
    org.springframework.integration.endpoint.AbstractEndpoint: file:/home/pi/.m2/repository/org/springframework/integration/spring-integration-core/5.5.2/spring-integration-core-5.5.2.jar
    org.springframework.integration.context.IntegrationObjectSupport: file:/home/pi/.m2/repository/org/springframework/integration/spring-integration-core/5.5.2/spring-integration-core-5.5.2.jar


Action:

Correct the classpath of your application so that it contains a single, compatible version of org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter
```
