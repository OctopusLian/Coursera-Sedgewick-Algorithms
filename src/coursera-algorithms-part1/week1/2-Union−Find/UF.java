public class UF {
    private int[] id;  //分量id
    private int count; //分量数量
    public UF(int N) {
        //初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0;i < N;i++) {
            id[i] = i;
        }
    }
    public int count() {
        return count;
    }
    public boolean connected(int p,int q) {
        return find(p) == find(q);
    }
    public int find(int p)
    public void union(int p,int q)

    public static void main(String[] args) {
        //解决由StdIn得到的动态连接性问题
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();  //读取整数对
            if (uf.connected(p, q)) continue;  //如果已经连通则忽略
            uf.union(p, q);
            StdOut.println(p + " "+q);
        }
        StdOut.println(uf.count() + "components");
    }
}
