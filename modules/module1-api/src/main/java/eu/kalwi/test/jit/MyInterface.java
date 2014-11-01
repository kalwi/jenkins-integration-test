package eu.kalwi.test.jit;

/**
 *
 * @author Jiri Kucera (jiri.kucera@kalwi.eu)
 */
public interface MyInterface {

    MyDomainObject createMyDomainObject();

    String getAttribute(MyDomainObject myDomainObject);
}
