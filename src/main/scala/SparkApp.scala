import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {
  def main(args: Array[String]): Unit = {
    sessionSpark()
  }

def sessionSpark() : Unit = {
  System.setProperty("hadoop.home.dir","C:\\Hadoop" )
  val ss = SparkSession.builder()
    .master( master = ("local[*]"))
    .appName( name = "Ma premiere application")
    //.enableHiveSupport()
    .getOrCreate()


  // creation de rdd

  val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application Spark.Je suis un etudiant de l'INP HB heureux"))

  rdd1.foreach(l => println(l))
  val df_1 = ss.read
    .format("csv")
    .option("inferSchema", "true")
    .option("header","true")
    .option("delimiter",";")
    .csv("C:\\Users\\RCARINE\\Desktop\\IDSI\\SEMESTRE2\\HADOOP\\orders_csv.csv")
  df_1.show(10)
  df_1.printSchema

  df_1.createOrReplaceTempView("orders")

  ss.sql("select * FROM orders WHERE city = 'NEWTON' ").show()

  //Plan d'excecution logique
  ss.sql("select * FROM orders WHERE city = 'NEWTON' ").explain



  }

  
  
  
}
