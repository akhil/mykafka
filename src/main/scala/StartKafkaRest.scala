import java.util.Properties

import io.confluent.kafkarest.{KafkaRestApplication, KafkaRestConfig}

object StartKafkaRest extends App {

  def startRest(servers: String = "PLAINTEXT://localhost:9092"): Unit = {
    println(servers)
    val props = new Properties()
    props.setProperty("bootstrap.servers", servers)
    props.setProperty("zookeeper.connect", "localhost:2181")
    props.setProperty("schema.registry.url", "http://localhost:8081")
    props.setProperty("listeners", "http://localhost:8082")
    props.setProperty("kafka.rest.resource.extension.class", "")

    val config = new KafkaRestConfig(props)

    val app = new KafkaRestApplication(config)

    app.start()
    println("Server started, listening for requests...")
    app.join()
  }

  startRest()
}
