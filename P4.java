class P4 {
    public static void main(String[] args) {
        int i = 0;
        test(i);
        i = ++i;
        System.out.println("----" + i);
        i = i++;
        System.out.println("****" + i);
    }
    public static void test(int i) {
        i++;
        System.out.println("++++" + i);
    }
}
// ++++1
// 出函数i的值还是0，----1
// ****1