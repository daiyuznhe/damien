package callexceptionmethods;

public class Main {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception"); // 抛出异常，其中的消息为"My Exception"
        } catch (Exception e) {
            System.err.println("Caught Exception"); // 捕获到异常并打印提示信息
            System.err.println("getLocalizedMessage(): " + e.getLocalizedMessage()); // 打印异常的本地化信息
            e.printStackTrace(); // 打印异常的堆栈跟踪信息 
        }
    }
}
