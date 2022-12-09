import java.util.ArrayList;
import java.util.List;

public class Pascal {
    List<List<Integer>> pascaltriangle(int n) {
        List<List<Integer>> res = new ArrayList();
        for (int i = 0; i < n; i++) {
            List<Integer> sub = new ArrayList();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    sub.add(1);
                else {
                    sub.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));

                }
            }
            res.add(sub);
        }

        return res;
    }
    public static void main(String[] args) {
      Pascal p=new Pascal();

        List<List<Integer>> result=p.pascaltriangle(5);
        for(int i=0;i<result.size();i++)
      {
          for(int j=0;j<result.get(i).size();j++)
          System.out.print( result.get(i).get(j));

          System.out.println("   ");
      }

    }
}

