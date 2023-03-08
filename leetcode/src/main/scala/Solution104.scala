object Solution104 {
  def maxDepth(root: TreeNode): Int = {
    if (root == null) {
      return 0
    }

    Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
  }
}
