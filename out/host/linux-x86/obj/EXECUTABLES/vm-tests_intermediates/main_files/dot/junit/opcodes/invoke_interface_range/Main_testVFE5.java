//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface_range;
import dot.junit.opcodes.invoke_interface_range.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface_range.ITest
        //@uses dot.junit.opcodes.invoke_interface_range.ITestImpl
        try {
            new T_invoke_interface_range_5(new ITestImpl());
            fail("expected VerifyError");
        } catch (VerifyError t) {
        }
    }
}