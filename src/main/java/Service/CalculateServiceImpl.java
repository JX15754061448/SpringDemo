package Service;

public class CalculateServiceImpl implements CalculateService {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        // System.out.println("加法操作。。。");
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result = a - b;
        // System.out.println("减法操作。。。");
        return result;
    }
}

