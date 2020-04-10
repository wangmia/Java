package snaker;

/**
 * @author WM
 * @date 2020/4/9 8:03 上午
 * 描述信息：
 */
public enum Direction {
    UP(0),
    RIGHT(1),
    DOWN(2),
    LEFT(3);

    // 成员变量
    private final int directionCode;

    // 成员方法
    public int directionCode() {
        return directionCode;
    }

    // 构造函数
    Direction(int directionCode) {
        this.directionCode = directionCode;
    }

    public boolean compatibleWith(Direction direction) {
        return (this.directionCode() + direction.directionCode()) % 2 == 1;
    }
}
