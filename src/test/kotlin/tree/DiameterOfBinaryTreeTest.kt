package tree

import org.junit.Assert.assertTrue
import org.junit.Test

class DiameterOfBinaryTreeTest {

    @Test
    fun `diameterOfBinaryTree() _ with 1,2,3,4,5 _ returns 3`() {
        val tree = TreeNode(1).also {
            it.left = TreeNode(2).also { left ->
                left.left = TreeNode(4)
                left.right = TreeNode(5)
            }
            it.right = TreeNode(3)
        }

        val diameter = diameterOfBinaryTree(tree)

        assertTrue(diameter == 3)
    }

    @Test
    fun `diameterOfBinaryTree() _ with 1,2 _ returns 1`() {
        val tree = TreeNode(1).also {
            it.left = TreeNode(2)
        }

        val diameter = diameterOfBinaryTree(tree)

        assertTrue(diameter == 1)
    }
}