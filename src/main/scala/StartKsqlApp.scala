import io.confluent.ksql.rest.server.KsqlServerMain

object StartKsqlApp extends App {

  def startKsqlServer(): Unit = {
    KsqlServerMain.main(Array("src/main/resources/ksql-server.properties"))
  }

  startKsqlServer()
}
