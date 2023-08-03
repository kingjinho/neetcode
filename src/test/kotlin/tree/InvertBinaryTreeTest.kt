package tree

import org.junit.Assert.*
import org.junit.Test

class InvertBinaryTreeTest {

    @Test
    fun `invertBinaryTree _ with 2,1,3 _ returns 2,3,1`() {

        val tree = TreeNode(2).also {
            it.left = TreeNode(1)
            it.right = TreeNode(3)
        }

        val inverted = invertBinaryTree(tree)

        assertTrue(inverted!!.`val` == 2)
        assertTrue(inverted.left!!.`val` == 3)
        assertTrue(inverted.right!!.`val` == 1)
    }

    @Test
    fun `invertBinaryTree _ with 4,2,7,1,3,6,9 _ returns 4,7,2,9,6,3,1`() {

        val tree = TreeNode(4).also {
            it.left = TreeNode(2)
            it.left!!.left = TreeNode(1)
            it.left!!.right = TreeNode(3)

            it.right = TreeNode(7)
            it.right!!.left = TreeNode(6)
            it.right!!.right = TreeNode(9)
        }

        val inverted = invertBinaryTree(tree)

        assertTrue(inverted!!.`val` == 4)
        assertTrue(inverted.left!!.`val` == 7)
        assertTrue(inverted.left!!.left!!.`val` == 9)
        assertTrue(inverted.left!!.right!!.`val` == 6)
        assertTrue(inverted.right!!.`val` == 2)
        assertTrue(inverted.right!!.left!!.`val` == 3)
        assertTrue(inverted.right!!.right!!.`val` == 1)
    }

}