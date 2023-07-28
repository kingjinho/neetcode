package sellstock

fun maxProfit(prices: IntArray): Int {

    var min = prices[0]
    var maximumProfit = 0

    prices.forEach {
        if(it < min) {
            min = it
        }

        maximumProfit = maxOf(maximumProfit, it - min)
    }

    return maximumProfit
}