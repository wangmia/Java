/**
* 尝试写出杨辉三角
* 设置二维数组存放行和列，每行的开始和末尾为1，然后每行第2个元素等于上面1和2的和，
* 第3个元素等于上面第2和3的和
*/
class SanJiao{
	public static void main(String[] args){
		int [] [] jiao = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<=i;j++){
				jiao[i][0]=1;
				jiao[i][i]=1;
			}
		}
		for(int i=2;i<10;i++){
			for(int j=1;j<i;j++){
				jiao[i][j] = jiao[i-1][j-1]+jiao[i-1][j];
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<=i;j++){
				//按格式话输出-:代表靠左输出,4是占4位，d是转为10进制数
				System.out.print(String.format("%1$-4d",jiao[i][j]));
			}
			System.out.println();

		}
	}
}