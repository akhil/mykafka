name := "mykafka"

version := "0.1"

scalaVersion := "2.12.10"

resolvers ++= Seq(
  "maven packages" at "https://packages.confluent.io/maven/",
  "Java.net Maven2 Repository" at "https://download.java.net/maven/2/"
)

// https://mvnrepository.com/artifact/io.confluent/kafka-rest
libraryDependencies += "io.confluent" % "kafka-rest" % "5.4.0" withSources() withJavadoc()

libraryDependencies += "com.salesforce.kafka.test" % "kafka-junit-core" % "3.2.1" withSources() withJavadoc()

// https://mvnrepository.com/artifact/io.confluent/kafka-schema-registry
libraryDependencies += "io.confluent" % "kafka-schema-registry" % "5.4.0" withSources() withJavadoc()
/*

// https://mvnrepository.com/artifact/io.confluent.ksql/ksql-engine
libraryDependencies += "io.confluent.ksql" % "ksql-engine" % "5.4.0" withSources() withJavadoc()

*/
// https://mvnrepository.com/artifact/io.confluent.ksql/ksql-rest-app
libraryDependencies += "io.confluent.ksql" % "ksql-rest-app" % "5.4.0" withSources() withJavadoc()