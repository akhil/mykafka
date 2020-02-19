import java.util.Properties

import io.confluent.kafka.schemaregistry.rest.{SchemaRegistryConfig, SchemaRegistryMain, SchemaRegistryRestApplication}
import org.eclipse.jetty.server.Server

object StartSchemaRegistry extends App {

  def startSchemaRegistry(): Unit = {
    val props = new Properties
    props.setProperty("kafkastore.bootstrap.servers", "localhost:9092")
    val config = new SchemaRegistryConfig(props)
    val app = new SchemaRegistryRestApplication(config)
    val server = app.createServer
    server.start()
    println("Server started, listening for requests...")
    server.join()
  }

  startSchemaRegistry()

}
