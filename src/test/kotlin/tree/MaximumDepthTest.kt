package tree

import org.junit.Assert.*
import org.junit.Test

class MaximumDepthTest {

    @Test
    fun `maxDepth() _ from 3,9,20,null,null,15,7 _ return 3`() {
        val tree = TreeNode(3).also {
            it.left = TreeNode(9)
            it.right = TreeNode(20).also {right ->
                right.left = TreeNode(15)
                right.left = TreeNode(7)
            }
        }

        val maxDepth = maxDepth(tree)

        assertTrue(maxDepth == 3)
    }

    @Test
    fun `maxDepth() _ from 1,null,2 _ return 2`() {
        val tree = TreeNode(1).also {
            it.right = TreeNode(2)
        }

        val maxDepth = maxDepth(tree)

        assertTrue(maxDepth == 2)
    }
}