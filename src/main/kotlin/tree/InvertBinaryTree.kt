package tree

fun invertBinaryTree(root: TreeNode?): TreeNode? {
    if(root != null) {
        val left = root.left
        root.left = invertBinaryTree(root.right)
        root.right = invertBinaryTree(left)
    }
    return root
}