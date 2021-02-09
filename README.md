# [TESTING ONLY] - spring-apache-kafka

**`**` Project only for testing and learning purposes.`**`**

## Powered By
* Docker-Compose;
* Spring Boot 2.4.2;
* Bitnami Kafka docker image;
* Bitnami Zookeeper docker image;

## How to
Be aware that this project is only for testing purposes. <br>
If you're willing to use it, change the two "SERVER" variables in
`./src/main/java/com/lucasbrandao/apachekafka/config/KafkaConsumerConfiguration.java` and `./src/main/java/com/lucasbrandao/apachekafka/config/KafkaProducerConfiguration.java` with your kafka server IP and Port.
## References

[How to install Kafka using Docker](https://itnext.io/how-to-install-kafka-using-docker-a2b7c746cbdc).
