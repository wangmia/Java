package snaker;

import java.util.Arrays;
import java.util.Random;

/**
 * @author WM
 * @date 2020/4/9 8:12 上午
 * 描述信息：
 */
public class Grid {

    public final boolean status[][];
    private final int width;
    private final int height;

    private Snake snake;
    private Node food;
    private static Random random;

    // 初始方向设置为向左
    private Direction snakeDirection = Direction.LEFT;

    public Grid(int width, int height) {  //初始化棋盘

        this.width = width;
        this.height = height;
        status = new boolean[width][height];

        init();
    }

    public void init() {  //初始化蛇的朝向
        for (int i = 0; i < width; ++i) {
            Arrays.fill(status[i], false);
        }

        snakeDirection = Direction.LEFT;
        initSnake();
        createFood();
    }


     //初始化棋盘上的贪吃蛇
    private Snake initSnake() { //初始化的贪吃蛇的长度不能过长 自己可以定义
        snake = new Snake();

        int x = width / 2;
        int y = height / 2;
        for (int i = 0; i < 5; i++) {
            snake.addTail(new Node(x, y));
            x += 1;
        }
        snake.getBody().forEach(this::occupy);

        return snake;
    }


     // 随机产生一个食物（Node类型），并返回该Node
    public Node createFood() {//创建的事务必须是在棋盘中...
        random = new Random();
        int x;
        int y;
        do{
           x = random.nextInt(width);
           y = random.nextInt(height);
        }while(!validPosition(new Node(x,y)));
        food = new Node(x,y);
        return food;
    }


     //贪吃蛇往snakeDirection方向移动一格,如果游戏结束，返回false，否则返回true
    public boolean nextRound() {
        Node deletedTail = snake.move(snakeDirection);

        if (validPosition(snake.getHead())) {

            occupy(snake.getHead());

            if (isFood(snake.getHead())) {
                snake.addTail(deletedTail);
                createFood();
            } else {
                dispose(deletedTail);
            }
            return true;
        }
        return false;
    }

    public void changeDirection(Direction newDirection) {
        if (snakeDirection.compatibleWith(newDirection)) {
            snakeDirection = newDirection;
        }
    }

    public boolean validPosition(Node area) {
        int x = area.getX(), y = area.getY();
        return x >= 0 && x < width && y >= 0 && y < height && !status[x][y];
    }

    private void dispose(Node node) {
        status[node.getX()][node.getY()] = false;
    }

    private void occupy(Node node) {
        status[node.getX()][node.getY()] = true;
    }


    public boolean isFood(Node area) {
        int x = area.getX(), y = area.getY();
        return x == food.getX() && y == food.getY();
    }

    public Node getFood() {
        return food;
    }

    public Snake getSnake() {
        return snake;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
