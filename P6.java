class P6 {
    public static void main(String[] args) {
        String a = "aa";  
        int c = 555;
        String b = a + "bbb" + c;
        double d = 5.66600;
        int e = (int) d;
        int f = 3;
        double g = 3.53;
        float h = 1.7f;
        int i = 1;
        System.out.println(b); // aabbb555
        System.out.println(e);  // 5
        System.out.println( f / i ); // 3
        System.out.println( g / f); // 1.1766666666666665
        System.out.println( h / f ); // 0.56666666 
        System.out.println(  9.5 < 8 ); // false
        System.out.println( (int)'a' +  (int)'z' ); // 97+122 //整数 219
        System.out.println("A~Z：" + ((int)'A') + "~" + ((int)'Z')); // A~Z:65~90 
        System.out.println("'A' < 'a':" + ('A' < 'a')); // 'A'<'a':true
    }
}