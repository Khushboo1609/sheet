package tree;

import java.util.ArrayList;

public class KthSamllestElementBST {
    void inorder(TreeNode root,ArrayList<Integer> res)
    {
        if (root==null)
            return;
        else{
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);

        }
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res=new ArrayList();
        inorder(root,res);
        int a=0;

        a=res.get(k-1);
        return a;

    }
}