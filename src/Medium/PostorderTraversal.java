package Medium;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xuzhu.chen
 * @since 2020-09-28
 */
public class PostorderTraversal {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root != null){
            if(root.left != null){
                list.addAll(postorderTraversal(root.left));
            }
            if(root.right != null){
                list.addAll(postorderTraversal(root.right));
            }
            list.add(root.val);
        }
        return list;
    }
}
