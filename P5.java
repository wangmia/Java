class P5 {
    public static void main(String[] args) {
        int x = 5, y = 6, z;
        /*A.*/ z = ++x + y++;
        System.out.println("x="+x+",y="+y+",z="+z);
        /*B.*/ z = ++x + x++;
         System.out.println("x="+x+",y="+y+",z="+z);
        /*C.*/ x = ++x + x++;
         System.out.println("x="+x+",y="+y+",z="+z);
        /*D.*/ z = x > y ? ++x : y++;
         System.out.println("x="+x+",y="+y+",z="+z);
    }
}