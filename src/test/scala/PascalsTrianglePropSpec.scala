import PascalsTriangle.triangleRow
import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object PascalsTrianglePropSpec extends Properties("PascalsTriangle") {

  private val N = Gen.choose(0, 62)

  property("sum up to power of 2") = forAll(N) { n =>
    triangleRow(n).sum == (1L << n)
  }
}