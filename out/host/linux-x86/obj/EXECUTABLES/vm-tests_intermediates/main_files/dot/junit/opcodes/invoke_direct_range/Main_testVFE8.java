//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_direct_range;
import dot.junit.opcodes.invoke_direct_range.d.*;
import dot.junit.*;
public class Main_testVFE8 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.invoke_direct_range.d.T_invoke_direct_range_14");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
