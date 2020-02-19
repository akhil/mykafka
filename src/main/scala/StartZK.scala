import java.util.Properties

import org.apache.zookeeper.server.quorum.QuorumPeerConfig
import org.apache.zookeeper.server.{ServerConfig, ZooKeeperServerMain}

object StartZK extends App {

  private val ZK_PORT = 2181
  def startStandaloneZK(): Unit = {
    val props = new Properties
    props.setProperty("clientPort", ZK_PORT.toString)
    props.setProperty("dataDir", "./a")
    props.setProperty("tickTime", "2000")

    val qp = new QuorumPeerConfig
    qp.parseProperties(props)

    val serverConfig = new ServerConfig
    serverConfig.readFrom(qp)

    val zk = new ZooKeeperServerMain
    zk.runFromConfig(serverConfig)
  }
  startStandaloneZK()


}
