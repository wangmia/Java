class P3 {
    public static void main(String[] args) {
        byte b = 10;
        b++;
        b = b + 1;
    }
}
// 错误：int型转化为byte型会有损失，如要结果可强转b=(byte)(b+1)