object Solution121 {
  def maxProfit(prices: Array[Int]): Int = {
    var max = 0
    var min = Int.MaxValue
    prices.foreach(p => {
      if (p < min) min = p
      max = Math.max(max, p - min)
    })
    max
  }
}
