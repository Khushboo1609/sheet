package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Seralize {

    public String seralization(TreeNode root){
        String s="";
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr= q.remove();

            if(curr==null) s=s+"#";
            else if(curr!=null){
                s=s+curr.val;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return s;
    }
}
