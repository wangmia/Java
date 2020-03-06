class P7 {
    public static void main(String[] args) {
        System.out.println(6 & 3);  // 0000 0110 & 0000 0011 = 0000 0010 2
        System.out.println(6 & 2);	// 0000 0110 & 0000 0010 = 0000 0010 2

        System.out.println(6 | 3);  // 0000 0110 | 0000 0011 = 0000 0111 7
        System.out.println(6 | 2);	// 0000 0110 | 0000 0010 = 0000 0110 6

        System.out.println(6 ^ 3);	// 0000 0110 ^ 0000 0011 = 0000 0101 5 
        System.out.println(6 ^ 2);	// 0000 0110 ^ 0000 0010 = 0000 0100 4
        // 异或，相同为0，不同为1
        System.out.println(~6);	// 0000 0110 ~ 1111 1001 为负数反码 ~ 1 0000 0110 +1 = 1 0000 0111 源码 = -7
    }
}

// 8 4 2 1