package inherit;

/**
 * @author WM
 * @date 2020/3/11 8:09 下午
 * 描述信息：增加属性：单位unit、工龄workAge； 重写工作方法（工人的工作是盖房子
 */
public class Worker extends Person{
    private String unit;
    private int workAge;

    public Worker(){

    }

    public String wook(){
       return "工人的工作是盖房子";
    }

    public Worker(String unit, int workAge) {
        this.unit = unit;
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "unit='" + unit + '\'' +
                ", workAge=" + workAge +'\''+super.toString();
    }
}
