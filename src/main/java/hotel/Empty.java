package hotel;

// Empty：是 InHotel 和 OutHotel 的父类，实现房间状态的查询
public class Empty {
    MainRun mr = new MainRun();

    boolean isEmpty(int roomNo) {
        if ("EMPTY".equals(
                mr.getRoom()[(roomNo / 100) - 1][(roomNo % 100) - 1]))
            return true;
        else
            return false;
    }
}
