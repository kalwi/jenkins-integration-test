package eu.kalwi.test.jit;

/**
 *
 * @author Jiri Kucera (jiri.kucera@kalwi.eu)
 */
public interface MyInterface {

    MyDomainObject createMyDomainObject();

    String getAttribute(MyDomainObject myDomainObject);

    String getApiVersion();

    String getImplementationVersion();

    MyDomainObject merge(MyDomainObject myDomainObject1, MyDomainObject myDomainObject2);
}
