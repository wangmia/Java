package object;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/9 7:51 下午
 * 描述信息：建立Book对象，传入成员变量的值，查看detail方法运行是否正确
 */
public class BookTest {
    public statie void main(String[] args) {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入教材名称");
        String bookname = sc.nextLine();
        System.out.println("请输入教材页数");
        int pages = sc.nextInt();
        book.setTitle(bookname);
        book.setIfPageNum(pages);
        System.out.println(book.detail());
    }
}
