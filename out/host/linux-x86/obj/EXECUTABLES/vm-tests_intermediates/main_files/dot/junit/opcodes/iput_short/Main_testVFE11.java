//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_short;
import dot.junit.opcodes.iput_short.d.*;
import dot.junit.*;
public class Main_testVFE11 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_iput_short_10().run();
            fail("expected NoSuchFieldError");
        } catch (NoSuchFieldError t) {
        }
    }
}