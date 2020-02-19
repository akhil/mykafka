import java.util.Properties

import kafka.server.KafkaServerStartable

object StartKafkaBroker extends App {

  def startKafkaBroker(): Unit = {
    println("starting kafka")
    val zkNode = "localhost:2181"
    val props = new Properties
    props.setProperty("zookeeper.connect", zkNode)
    props.setProperty("broker.id", 1.toString)
    props.setProperty("offsets.topic.replication.factor", 1.toString)
    props.setProperty("log.dirs", "./kafkalogs")

    val kafkaServer = KafkaServerStartable.fromProps(props)
    kafkaServer.startup()
  }

  startKafkaBroker()

}
