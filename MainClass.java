import java.util.Scanner;
//just do some changes
public class MainClass {
    
    public static void main(String[] argv) {
        
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        String name = scanner.next(); // 读取字符串直至遇到空格
        double price = scanner.nextDouble();
        int num = scanner.nextInt(); // 读取一行输入并获取整数
        
        Bookset book = new Bookset();
        book.setName(name);
        book.setPrice(price);
        book.setNum(num);
        
        int times = scanner.nextInt(); // 读取一行输入并获取整数
        while(times>0){
            times = times-1;
            int judge_num = scanner.nextInt(); // 读取一行输入并获取整数
            switch(judge_num){
                case 1:
                    System.out.printf("%s\n",book.getName()); // 格式化输出
                    break;
                case 2:
                    System.out.printf("%f\n",book.getPrice()); // 格式化输出
                    break;
                case 3:
                    System.out.printf("%d\n",book.getNum()); // 格式化输出
                    break;
                case 4:
                    String new_name = scanner.next(); // 读取字符串直至遇到空格
                    book.setName(new_name);
                    break;
                case 5:
                    double new_price = scanner.nextDouble();
                    book.setPrice(new_price);
                    break;
                case 6:
                    int new_num = scanner.nextInt(); // 读取一行输入并获取整数
                    book.setNum(new_num);
                    break;
                case 7:
                    System.out.printf("%f\n",book.getPrice()*book.getNum()); // 格式化输出
                    break;
            }
        }
    }
}
