lazy val test = projectMatrix
  .in(file("."))
  .jvmPlatform(Seq("2.13.4"))
  .jsPlatform(
    Seq("2.13.4"),
    settings = Seq(
      jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
      scalaJSUseMainModuleInitializer := true
    )
  )
  .nativePlatform(Seq("2.13.4"))
