import scala.io.Source

val lines=Source.fromFile(args(0)).getLines().toList
lines.foreach(println(_))