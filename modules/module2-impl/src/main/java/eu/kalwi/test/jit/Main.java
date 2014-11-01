package eu.kalwi.test.jit;

/**
 *
 * @author Jiri Kucera (jiri.kucera@kalwi.eu)
 */
public class Main {

    public static void main(String[] args) {
        Launcher launcher = new Launcher(new MyImplementation());

        launcher.start();
    }
}
