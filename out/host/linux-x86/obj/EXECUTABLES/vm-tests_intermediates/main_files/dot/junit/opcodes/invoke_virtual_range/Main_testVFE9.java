//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_virtual_range;
import dot.junit.opcodes.invoke_virtual_range.d.*;
import dot.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_virtual_range.d.T_invoke_virtual_range_23
        //@uses dot.junit.opcodes.invoke_virtual_range.d.TSuper
        //@uses dot.junit.opcodes.invoke_virtual_range.d.TSuper2
        try {
            Class.forName("dot.junit.opcodes.invoke_virtual_range.d.T_invoke_virtual_range_23");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
