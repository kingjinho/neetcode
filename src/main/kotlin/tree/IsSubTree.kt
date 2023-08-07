package tree

fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
    return if (s == null) {
        false
    } else if (isSame(s, t)) {
        true
    } else {
        isSubtree(s.left, t) || isSubtree(s.right, t)
    }
}

private fun isSame(s: TreeNode?, t: TreeNode?): Boolean {
    return if (s == null && t == null) {
        true
    } else if (s == null || t == null) {
        return false
    } else if (s.`val` != t.`val`) {
        false
    } else {
        isSame(s.left, t.left) && isSame(s.right, t.right)
    }
}