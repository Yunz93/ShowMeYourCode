object Solution94 {
  def inorderTraversal(root: TreeNode): List[Int] = {
    Option(root).map(n => inorderTraversal(n.left) ::: List(n.value) ::: inorderTraversal(n.right)).getOrElse(List())
  }
}
