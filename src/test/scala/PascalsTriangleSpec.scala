import PascalsTriangle.triangleRow
import org.scalatest.matchers.should
import org.scalatest.wordspec.AnyWordSpec

class PascalsTriangleSpec extends AnyWordSpec with should.Matchers {

  "PascalsTriangle" should {
    "resolve row 0" in {
      triangleRow(0) shouldBe Seq(1)
    }
    "resolve row 1" in {
      triangleRow(1) shouldBe Seq(1, 1)
    }
    "resolve row 2" in {
      triangleRow(2) shouldBe Seq(1, 2, 1)
    }
    "resolve row 3" in {
      triangleRow(3) shouldBe Seq(1, 3, 3, 1)
    }
    "resolve row 4" in {
      triangleRow(4) shouldBe Seq(1, 4, 6, 4, 1)
    }
  }
}