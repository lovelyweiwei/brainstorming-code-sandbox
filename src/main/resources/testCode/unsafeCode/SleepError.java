/**
 * 无限睡眠
 *
 * @Author weiwei
 * @Date 2023/9/5 21:09
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOURS = 60 * 60 * 1000L;
        Thread.sleep(ONE_HOURS);
        System.out.println("睡饱了");
    }
}
