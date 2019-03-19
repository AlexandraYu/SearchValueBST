class TreeNode {
      int data;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { this.data = x; }
}

public class FindNode {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root ==null || root.data == val) return root;
        if (val < root.data) 
            return searchBST(root.left, val); 
        else 
            return searchBST(root.right, val);
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10); 
        TreeNode node2 = new TreeNode(6); 
        TreeNode node3 = new TreeNode(20); 
        TreeNode node4 = new TreeNode(4); 
        TreeNode node5 = new TreeNode(9); 
    
        node1.left = node2; 
        node1.right = node3; 
        node2.left = node4; 
        node2.right = node5; 
        FindNode findNode = new FindNode(); 
        TreeNode answer = findNode.searchBST(node1, 5); 
        if (answer!=null)
            System.out.print("Answer is "+answer.data); 
        else
            System.out.print("Answer not in the tree!");
    }
}
