class P1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
    }

}
// 分析 a=10,b=11; c=9,a=9; b=10,a=10; a=9,c=8
// 结果 a=9,b=10,c=8