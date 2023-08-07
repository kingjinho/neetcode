package tree

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class IsSubTreeTest {

    @Test
    fun `isSubtree() _ with root = 3,4,5,1,2, subRoot = 4,1,2 _ returns true`() {

        val root = TreeNode(3).also {
            it.left = TreeNode(4).also { left ->
                left.left = TreeNode(1)
                left.right = TreeNode(2)
            }
            it.right = TreeNode(4)
        }

        val sub = TreeNode(4).also {
            it.left = TreeNode(1)
            it.right = TreeNode(2)
        }

        val isSubtree = isSubtree(root, sub)

        assertTrue(isSubtree)

    }

    @Test
    fun `isSubTree() _ with root = 3,4,5,1,2,null,null,null,null,0, subRoot = 4,1,2 _ returns false`() {
        val root = TreeNode(3).also {
            it.left = TreeNode(4).also { left ->
                left.left = TreeNode(1)
                left.right = TreeNode(2).also { right ->
                    right.left = TreeNode(0)
                }
            }
            it.right = TreeNode(5)
        }

        val sub = TreeNode(4).also {
            it.left = TreeNode(1)
            it.right = TreeNode(2)
        }

        val isSubtree = isSubtree(root, sub)

        assertFalse(isSubtree)
    }

    @Test
    fun `isSubTree() _ with root = 3,4,5,1,2,null,null,null,null,0, subRoot = 4,1,2,1 _ returns false`() {
        val root = TreeNode(3).also {
            it.left = TreeNode(4).also { left ->
                left.left = TreeNode(1)
                left.right = TreeNode(2)
            }
            it.right = TreeNode(5)
        }

        val sub = TreeNode(4).also {
            it.left = TreeNode(1).also { left ->
                left.left = TreeNode(1)
            }
            it.right = TreeNode(2)
        }

        val isSubtree = isSubtree(root, sub)

        assertFalse(isSubtree)
    }

}