//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_short;
import dot.junit.opcodes.sput_short.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_sput_short_17().run();
            fail("expected NoSuchFieldError");
        } catch (NoSuchFieldError t) {
        }
    }
}
