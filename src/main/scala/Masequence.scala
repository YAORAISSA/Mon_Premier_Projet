import Masequence.macollect

object Masequence {
  def macollect(): Unit = {
    val monseq = Seq("ilan", "hiram", "raissa", "joel", "henri", "christ", "mahe")
    val nvoseq = monseq.map(f => f)
    nvoseq.foreach(f => println(f + " " + f.length))

  }




  def main(args : Array[String]) : Unit = {
    macollect()
  }
}

