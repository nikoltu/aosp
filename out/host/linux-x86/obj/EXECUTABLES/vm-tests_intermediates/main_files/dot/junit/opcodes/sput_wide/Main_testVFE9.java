//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_wide;
import dot.junit.opcodes.sput_wide.d.*;
import dot.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sput_wide.TestStubs
        //@uses dot.junit.opcodes.sput_wide.d.T_sput_wide_8
        try {
            new T_sput_wide_8().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}
