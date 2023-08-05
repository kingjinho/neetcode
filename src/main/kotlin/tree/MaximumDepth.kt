package tree

fun maxDepth(root: TreeNode?): Int {
    return if (root == null) {
        0
    } else if (root.right == null) {
        1 + maxDepth(root.left)
    } else if (root.left == null) {
        1 + maxDepth(root.right)
    } else {
        maxOf(maxDepth(root.right), maxDepth(root.left)) + 1
    }

}