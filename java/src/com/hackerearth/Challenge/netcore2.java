import java.io.*;
import java.util.*;


public class netcore2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_val = br.readLine().split(" ");
            int[] val = new int[N];
            for(int i_val = 0; i_val < arr_val.length; i_val++)
            {
                val[i_val] = Integer.parseInt(arr_val[i_val]);
            }
            String[] arr_parent = br.readLine().split(" ");
            int[] parent = new int[N-1];
            for(int i_parent = 0; i_parent < arr_parent.length; i_parent++)
            {
                parent[i_parent] = Integer.parseInt(arr_parent[i_parent]);
            }

            int[] out_ = solve(N, val, parent);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
                System.out.print(" " + out_[i_out_]);
            }

            System.out.println();

        }

        wr.close();
        br.close();
    }
    static int[] solve(int N, int[] val, int[] parent){
        // Write your code here
        int[] result = new int[N];

        Map<Integer, List<Integer>> nodes = new HashMap<>();
        Map<Integer, Integer> mexn = new HashMap<>();
        nodes.put(1,Collections.singletonList(val[0]));
        result[0]=findmex(nodes.get(1));
        mexn.put(1, result[0]);
        for(int i=2;i<=N;i++){
            int p = parent[i-2];
            List<Integer> pv = new ArrayList<>();
            pv.add(val[i-1]);
            pv.addAll(nodes.get(p));
            nodes.put(i, pv);
            if(mexn.get(p)!=val[i-1]){
                mexn.put(i, mexn.get(p));
                result[i-1]=mexn.get(p);
            } else {
                result[i-1]=findmex(nodes.get(i));
                mexn.put(i, result[i-1]);
            }
        }
        return result;

    }

    public static int findmex(List<Integer> listArr){
        Integer MEX=1;
        for(int i=MEX;i<=listArr.size()+2;i++){
            if(!listArr.contains(i)){
                MEX=i;
                break;
            }
        }
        return MEX;
    }
}