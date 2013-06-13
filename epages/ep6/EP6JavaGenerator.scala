import com.wordnik.swagger.codegen.BasicJavaGenerator

object EP6JavaGenerator extends BasicJavaGenerator {
  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "Java"

  // package for api invoker, error files
  override def invokerPackage = Some("com.epages.ep6.client")
    
  // where to write generated code
  override def destinationDir = "generated-code/epages/ep6/java/src/main/java"

  // package for models
  override def modelPackage = Some("com.epages.ep6.model")

  // package for api classes
  override def apiPackage = Some("com.epages.ep6.api")

  additionalParams ++= Map(
    "artifactId" -> "swagger-ep6", 
    "artifactVersion" -> "1.0.0",
    "groupId" -> "com.epages")

  // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
      ("JsonUtil.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
      ("pom.mustache", "generated-code/epages/ep6/java", "pom.xml"))
}
