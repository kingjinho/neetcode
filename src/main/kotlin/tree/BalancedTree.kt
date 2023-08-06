package tree

fun isBalanced(root: TreeNode?): Boolean {

    if (root == null) return true

    return (Math.abs(height(root.left) - height(root.right)) < 2)
            && isBalanced(root.left)
            && isBalanced(root.right)
}

private fun height(root: TreeNode?): Int {
    if (root == null) return -1

    return height(root.left).coerceAtLeast(height(root.right)) + 1
}
