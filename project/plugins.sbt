// format: off
val ScalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.1.0")

addSbtPlugin("org.scala-js"         % "sbt-scalajs"                   % ScalaJSVersion)
addSbtPlugin("org.portable-scala"   % "sbt-scalajs-crossproject"      % "1.0.0")
addSbtPlugin("com.jsuereth"         % "sbt-pgp"                       % "2.0.1")
addSbtPlugin("com.dwijnand"         % "sbt-dynver"                    % "4.0.0")
addSbtPlugin("org.xerial.sbt"       % "sbt-sonatype"                  % "3.9.3")
addSbtPlugin("org.scalameta"        % "sbt-scalafmt"                  % "2.3.0")
addSbtPlugin("org.scalameta"        % "sbt-scalafmt"                  % "2.4.0")
addSbtPlugin("org.scoverage"        % "sbt-scoverage"                 % "1.6.1")
addSbtPlugin("org.scalameta"        % "sbt-mdoc"                      % "2.2.3")

