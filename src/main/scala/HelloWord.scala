import Personne._
import java.text.SimpleDateFormat
//import scala.collection.immutable._
import scala.collection.mutable
object HelloWord {
  val variable2 : String = ""


  def calculSomme(a : Int, b : Int) : Int = {
    var result =0
    var i = 1
    if(a < 0 || b < 0){
      print ("valeurs d'argument incorrect")
    }else{
      result = a + b
    }


    if (a < 0 && b < 0){
      print ("valeurs d'argument incorrect")
    }else{
      result = a + b
    }


    for (i<-1 to 10){
      println("compteur" + 1)
    }



    while (i<15){
      println("iteration" + 1)
      i = i + 1
    }
    return result
    val resultat = a + b
    val res2 = resultat + 15
    return res2

  }
  //def renvoiePersonne ()


  def macollection() :Unit = {
    val maliste = List("jvc","jjj", "ecole","pays")
    val maliste2 : List[String] = List("julien", "jvc")
    maliste.foreach(l => println(l.toUpperCase))       // l represente les elements de la collection

    maliste.foreach(l => {
      val var2 = l.toUpperCase
    })


                        //TP



    }


def main(args: Array[String]): Unit = {
  val text : String = "Hello World,j'ai créé mon premier programme en scala"
  val text2 : String = text + variable2
  val test = println(text)

   test

  val raissa =  Personne("YAO", "Raissa",32,"Cote d'ivoire", 5000.000)
  val etudiant = Personne ("Julien", "Raissa",32,"Cote d'ivoire", 5000.000)
  val age_personne = raissa.age

   println("l'age de la personne est: " + age_personne)
  val somme = println("la somme est: " + calculSomme(13,20))

  macollection()

  val maliste3 : Seq[Int] = List(10,20,30,70).toSeq

  val montuple = ("10", Personne("raissa","carine",15, "CR", 500.000), true)

  montuple._2.salaire
  val(a , b) = ("10", Personne("raissa","carine",15, "CR", 500.000))
  println(b)

  val monMap : Map [String,String] = Map(
    "cc"-> "cocody",
    "yy" -> "poy",
    "abd"-> "abidjan"
  )

  monMap.keys.foreach( k => println(k))

  //val ll = monMap.keys.foreach( k => k).toList

  val montableau : Array[String] = Array("raissa","joel")
  montableau(0) = "bety"


val liste : List[(String, String)] = List(("ttt","eee"),("err","ee"))
//liste.map(1 => 1._2.split(regex = ".")).map(e =>e(1) )



}
}