//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_short;
import dot.junit.opcodes.aget_short.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aget_short.d.T_aget_short_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
