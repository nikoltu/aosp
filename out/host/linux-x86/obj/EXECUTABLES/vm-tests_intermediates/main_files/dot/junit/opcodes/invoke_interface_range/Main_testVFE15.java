//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface_range;
import dot.junit.opcodes.invoke_interface_range.d.*;
import dot.junit.*;
public class Main_testVFE15 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface_range.d.T_invoke_interface_range_16
        //@uses dot.junit.opcodes.invoke_interface_range.ITest
        //@uses dot.junit.opcodes.invoke_interface_range.ITestImpl
        try {
            new T_invoke_interface_range_16().run(new ITestImpl());
            fail("expected NoSuchMethodError");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}