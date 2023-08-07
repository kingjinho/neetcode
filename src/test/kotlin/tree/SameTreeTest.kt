package tree

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SameTreeTest {

    @Test
    fun `isSameTree() _ tree of 1,2,3 and tree of 1,2,3 _ returns true`() {
        val p = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        val q = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        val isSame = isSameTree(p, q)

        assertTrue(isSame)
    }

    @Test
    fun `isSameTree() _ tree of 1,2 and tree of 1,null,2 _ returns false`() {
        val p = TreeNode(1).apply {
            left = TreeNode(2)
        }

        val q = TreeNode(1).apply {
            right = TreeNode(2)
        }

        val isSame = isSameTree(p, q)

        assertFalse(isSame)
    }

    @Test
    fun `isSameTree() _ tree of 1,2,1 and tree of 1,1,2 _ returns false`() {
        val p = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(1)
        }

        val q = TreeNode(1).apply {
            left = TreeNode(1)
            right = TreeNode(2)
        }

        val isSame = isSameTree(p, q)

        assertFalse(isSame)
    }
}