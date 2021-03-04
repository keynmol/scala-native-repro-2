abstract class TestStuff(stuff: String) {
  def main(args: Array[String]) = {
    println(stuff)
  }
}

object Hello extends TestStuff("hello")

