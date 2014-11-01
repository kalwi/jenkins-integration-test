package eu.kalwi.test.jit;

/**
 *
 * @author Jiri Kucera (jiri.kucera@kalwi.eu)
 */
public class Launcher {

    private final MyInterface myService;

    public Launcher(MyInterface myService) {
        this.myService = myService;
    }

    public void start() {
        MyDomainObject object1 = myService.createMyDomainObject();
        MyDomainObject object2 = myService.createMyDomainObject();

        System.out.println(myService.getAttribute(object1));
        System.out.println(myService.getAttribute(object2));
    }
}
