//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface_range;
import dot.junit.opcodes.invoke_interface_range.d.*;
import dot.junit.*;
public class Main_testE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface_range.d.T_invoke_interface_range_13
        //@uses dot.junit.opcodes.invoke_interface_range.ITest
        //@uses dot.junit.opcodes.invoke_interface_range.ITestImpl
        //@uses dot.junit.opcodes.invoke_interface_range.ITestImplAbstract
        T_invoke_interface_range_13 t = new T_invoke_interface_range_13();
        try {
            t.run();
            fail("expected AbstractMethodError");
        } catch (AbstractMethodError e) {
            // expected
        }
    }
}