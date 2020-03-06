class P8 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count = count++; // count++ 先运算，不自增
        }
        System.out.println(count); // 0

    }
}
