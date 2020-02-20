import org.apache.kafka.connect.cli.ConnectStandalone

object StartConnect extends App {

  def startConnect(): Unit = {

    ConnectStandalone.main(args)
  }

}
