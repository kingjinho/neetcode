package tree

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class BalancedTreeTest {

    @Test
    fun `isBalanced() _ with 3,9,20,null,null,15,7 _ returns true`() {
        val tree = TreeNode(3).also { root ->
            root.left = TreeNode(9)
            root.right = TreeNode(20).also { right ->
                right.left = TreeNode(15)
                right.left = TreeNode(7)
            }
        }

        val isBalanced = isBalanced(tree)

        assertTrue(isBalanced)
    }

    @Test
    fun `isBalanced() _ with 1,2,2,3,3,null,null,4,4 _ returns false`() {
        val tree = TreeNode(3).also { root ->
            root.left = TreeNode(2).also { left ->
                left.left = TreeNode(3).also { secondLeft ->
                    secondLeft.left = TreeNode(3)
                    secondLeft.right = TreeNode(4)
                }
                left.right = TreeNode(3)
            }
            root.right = TreeNode(2)
        }

        val isBalanced = isBalanced(tree)

        assertFalse(isBalanced)
    }

    @Test
    fun `isBalanced() _ with empty _ returns true`() {
        val tree = null

        val isBalanced = isBalanced(tree)

        assertTrue(isBalanced)
    }

    @Test
    fun `isBalanced() _ with 1,2,2,3,null,null,3,4,null,null,4 _ returns true`() {
        val tree = TreeNode(1).also { root ->
            root.left = TreeNode(2).also { left ->
                left.left = TreeNode(3).also { secondLeft ->
                    secondLeft.left = TreeNode(4)
                }
            }
            root.right = TreeNode(2).also { right ->
                right.right = TreeNode(3).also { secondRight ->
                    secondRight.right = TreeNode(4)
                }
            }
        }

        val isBalanced = isBalanced(tree)

        assertFalse(isBalanced)
    }

}