//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_wide;
import dot.junit.opcodes.sget_wide.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sget_wide.d.T_sget_wide_6
        //@uses dot.junit.opcodes.sget_wide.TestStubs
        try {
            new T_sget_wide_6().run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError t) {
        }
    }
}
