package tree;
import java.util.ArrayList;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class TwoSumBST {
    void inorder(TreeNode root, ArrayList<Integer> res)
    {
        if (root==null)
            return;
        else{
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);

        }
    }

    public boolean findTarget(TreeNode root,int val){
        ArrayList<Integer> res=new ArrayList();
        inorder(root,res);
        int[] a=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            a[i]=res.get(i);
        }
        int j=0;
        int k=a.length-1;
        while(j<k){
            if(a[j]+a[k]==val)
                return true;
            else if(a[j]+a[k]>val)
                k--;
            else if(a[j]+a[k]<val)
                j++;
        }


        return false;
    }
}




