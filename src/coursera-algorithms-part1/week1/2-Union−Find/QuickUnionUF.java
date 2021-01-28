public class QuickUnionUF {
    private int[] id;  //创建一个数组

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0;i < N;i++) id[i] = i;  //每个对象设为根节点
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p,int q) {
        return root(p) == root(q);
    }

    public void union(int p,int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
