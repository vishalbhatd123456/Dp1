/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> rightSide = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
//       List<Integer> visibleValues = new ArrayList<>();
      
//         if(root == null)
//         {
//             return visibleValues;
//         }
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);
        
//         while(!queue.isEmpty())
//         {
//             int size = queue.size();
//             for(int i=0;i<size;i++)
//             {
//                 TreeNode current =  queue.remove();
//                 if(i == size-1)
//                 {
//                     visibleValues.add(current.val);
//                 }
//                 if(current.left!=null)
//                 {
//                     queue.add(current.left);
//                 }
//                 if(current.right!=null)
//                 {
//                     queue.add(current.right);
//                 }
//             }
//         }
//         return visibleValues;
//         List<Integer> result = new ArrayList<Integer>();
//         rightView(root,result,0);
//         return result;
//     }
//     public void rightView(TreeNode curr, List<Integer> result, int currDepth)
//     {
//         if(curr == null)
//         {
//             return;
//         }
//         if(currDepth == result.size()-1)
//         {
//             result.add(curr.val);
//         }
        
//         rightView(curr.right,result,currDepth+1);
//         rightView(curr.left,result,currDepth+1);
        
        //recursive BFS
        if(root == null)
        {
            return rightSide;
        }
        
        helper(root,0);
        return rightSide;
        
    }
    
    public void helper(TreeNode node,int level)
    {
        if(level == rightSide.size())
        {
            rightSide.add(node.val);
        }
        
        if(node.right!=null)
        {
            helper(node.right,level+1);
        }
        if(node.left!=null)
        {
            helper(node.left,level+1);
        }
    }
        
}
