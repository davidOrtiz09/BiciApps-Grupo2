name := "kilometraje"

libraryDependencies ++= Seq(
  guice,
  jdbc,
  "com.h2database" % "h2" % "1.4.197"
)

PlayKeys.devSettings += ("play.http.router", "kilometraje.Routes")

playEbeanModels in Compile := Seq("com.co.common.models.*")