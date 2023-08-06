package tree

var max = 0
fun diameterOfBinaryTree(root: TreeNode?): Int {

    calculateHeight(root)
    return max
}


fun calculateHeight(root: TreeNode?): Int {

    return if (root == null) {
        0
    } else {
        val leftDepth = calculateHeight(root.left)
        val rightDepth = calculateHeight(root.right)

        max = maxOf(max, leftDepth + rightDepth)

        maxOf(leftDepth, rightDepth) + 1
    }

}
