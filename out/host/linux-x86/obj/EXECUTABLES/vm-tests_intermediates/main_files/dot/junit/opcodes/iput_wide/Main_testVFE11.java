//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_wide;
import dot.junit.opcodes.iput_wide.d.*;
import dot.junit.*;
public class Main_testVFE11 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_iput_wide_10().run();
            fail("expected NoSuchFieldError");
        } catch (NoSuchFieldError t) {
        }
    }
}