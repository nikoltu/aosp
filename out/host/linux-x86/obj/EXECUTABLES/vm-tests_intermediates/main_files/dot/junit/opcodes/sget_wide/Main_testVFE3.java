//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_wide;
import dot.junit.opcodes.sget_wide.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_sget_wide_13().run();
            fail("expected NoSuchFieldError");
        } catch (NoSuchFieldError t) {
        }
    }
}
