class P2 {
    public static void main(String[] args) {
        int x = 4;
        int y = (x++) + (++x) + (x * 10);
        System.out.println("x=" + x + ",y=" + y);
    }
}
// 分析 y = 4 + 6 + 60
// 结果 x=6,y=70