abstract class TestStuff(cmd: () => Unit) {
  def this(name: String) = this {
    () => println(name)
  }

  def main(args: Array[String]) = {
    cmd()
  }
}

object Hello extends TestStuff("bla")

