package eu.kalwi.test.jit;

/**
 *
 * @author Jiri Kucera (jiri.kucera@kalwi.eu)
 */
public class MyImplementation implements MyInterface {

    private int counter = 0;

    @Override
    public MyDomainObject createMyDomainObject() {
        MyDomainObject myDomainObject = new MyDomainObject();

        myDomainObject.setAttribute("id-" + counter++);

        return myDomainObject;
    }

    @Override
    public String getAttribute(MyDomainObject myDomainObject) {
        return myDomainObject.getAttribute();
    }

    public String getApiVersion() {
        return "1.0.1";
    }

    public String getImplementationVersion() {
        return "1.0.1";
    }
}
