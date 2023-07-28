package sellstock

import org.junit.Assert.*
import org.junit.Test

class BestTimeToBuyAndSellKtTest {

    @Test
    fun `maxProfit()_withIntArrayOf7,1,5,3,6,4_returns 5`() {
        val prices = intArrayOf(7,1,5,3,6,4)

        val maxProfit = maxProfit(prices)

        assertTrue(maxProfit == 5)
    }
}