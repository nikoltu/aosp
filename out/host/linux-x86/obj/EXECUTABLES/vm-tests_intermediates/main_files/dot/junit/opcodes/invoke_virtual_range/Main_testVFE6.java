//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_virtual_range;
import dot.junit.opcodes.invoke_virtual_range.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.invoke_virtual_range.d.T_invoke_virtual_range_16");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
