//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sub_long;
import dot.junit.opcodes.sub_long.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sub_long.d.T_sub_long_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
