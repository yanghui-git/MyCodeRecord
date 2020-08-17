import org.junit.Test;

public class ExcutorsTest {


/**
 *     创建一个什么样的ExecutorService的实例（即线程池）需要我们的具体应用场景而定，不过Java给我们提供了一个Executors工厂类，它可以帮助我们很方便的创建各种类型ExecutorService线程池，Executors一共可以创建下面这四类线程池：
 */

@Test
    public void test(){

    /**
     * 1. newCachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
     * 2. newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
     * 3. newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
     * 4. newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
     */

//Executors只是一个工厂类，它所有的方法返回的都是ThreadPoolExecutor、ScheduledThreadPoolExecutor这两个类的实例。

}
}
