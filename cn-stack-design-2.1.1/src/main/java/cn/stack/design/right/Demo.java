package cn.stack.design.right;

public class Demo {
    public static void main(String[] args) {
        ApiStateInfo apiStateInfo = new ApiStateInfo("key", 1000, 60, 10);

        ApplicationContext.getInstance().getAlert().check(apiStateInfo);
    }
}
