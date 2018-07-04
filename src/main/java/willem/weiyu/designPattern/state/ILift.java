package willem.weiyu.designPattern.state;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:05
 * @since 1.0.0
 */
public interface ILift {
    void open();
    void close();
    void run();
    void stop();
}
