addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

// https://github.com/playframework/playframework/issues/3327
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.2")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.6")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.3")

scalacOptions += "-deprecation"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
