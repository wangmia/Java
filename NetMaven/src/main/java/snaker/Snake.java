package snaker;

import java.util.LinkedList;

/**
 * @author WM
 * @date 2020/4/9 7:46 上午
 * 描述信息：
 */
public class Snake {
    //蛇的身子
    private final LinkedList<Node> body = new LinkedList<>();

    public Node eat(Node food) {
        //蛇吃食物
        if (isNeighbor(getHead(), food)) {
            // 相邻情况下的处理
            body.addFirst(food);
            return food;
        }
        return null;
    }


    public Node move(Direction direction) {
        //控制蛇往哪个方向移动 原理:蛇的最后一个节点到蛇最前面
        int X = getHead().getX();
        int Y = getHead().getY();
        Node newHead = null;
        switch (direction) {
            // 根据方向计算头部的新位置
            case UP:
                newHead = new Node(X, Y - 1);
                break;
            case DOWN:
                newHead = new Node(X, Y + 1);
                break;
            case LEFT:
                newHead = new Node(X - 1, Y);
                break;
            case RIGHT:
                newHead = new Node(X + 1, Y);
                break;
        }

        // 将新头部的Node增加近body
        body.addFirst(newHead);
        // 移除尾部的Node
        // 返回移除的Node（尾部Node）
        return body.removeLast();
    }

    public Node getHead() {
        return body.getFirst();
    }

    public Node addTail(Node area) {
        this.body.addLast(area);
        return area;
    }

    public LinkedList<Node> getBody() {
        return body;
    }

    private boolean isNeighbor(Node a, Node b) {
        //判断是否是相邻的两个节点
        return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()) == 1;
    }
}
