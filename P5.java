class P5 {
    public static void main(String[] args) {
        int x = 5, y = 6, z;
        /*A.*/ z = ++x + y++; // x=6,y=7
        System.out.println("x="+x+",y="+y+",z="+z); // 6+6
        // x=6,y=7,z=12

        /*B.*/ z = ++x + x++; // x=7,x=8
         System.out.println("x="+x+",y="+y+",z="+z); // 7+7
         // x=8,y=7,z=14

        /*C.*/ x = ++x + x++; // 9+9=18
         System.out.println("x="+x+",y="+y+",z="+z);
         // x=18,y=7,z=14

        /*D.*/ z = x > y ? ++x : y++; // ture?19:7
         System.out.println("x="+x+",y="+y+",z="+z); //z=19
         // x=19,y=7,z=19
    }
}