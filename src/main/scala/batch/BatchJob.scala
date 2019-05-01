package batch

import utils.SparkUtils

object BatchJob {
  def main(args: Array[String]): Unit = {
    val ctx = SparkUtils.getSparkSession()
  }
}
