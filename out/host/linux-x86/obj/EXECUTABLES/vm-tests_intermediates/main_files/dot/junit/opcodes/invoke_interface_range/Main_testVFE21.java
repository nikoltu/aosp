//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface_range;
import dot.junit.opcodes.invoke_interface_range.d.*;
import dot.junit.*;
public class Main_testVFE21 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface_range.d.T_invoke_interface_range_22
        //@uses dot.junit.opcodes.invoke_interface_range.ITest
        //@uses dot.junit.opcodes.invoke_interface_range.ITestImpl
        try {
            Class.forName("dot.junit.opcodes.invoke_interface_range.d.T_invoke_interface_range_22");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
