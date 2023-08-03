package tree

fun invertBinaryTree(root: TreeNode?): TreeNode? {
    if(root != null) {
        val left = root.left
        root.left = root.right
        root.right = left
        invertBinaryTree(root.left)
        invertBinaryTree(root.right)
    }
    return root
}