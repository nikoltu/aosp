//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface;
import dot.junit.opcodes.invoke_interface.d.*;
import dot.junit.*;
public class Main_testE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface.d.T_invoke_interface_13
        //@uses dot.junit.opcodes.invoke_interface.ITest
        //@uses dot.junit.opcodes.invoke_interface.ITestImpl
        //@uses dot.junit.opcodes.invoke_interface.ITestImplAbstract
        T_invoke_interface_13 t = new T_invoke_interface_13();
        try {
            t.run();
            fail("expected AbstractMethodError");
        } catch (AbstractMethodError e) {
            // expected
        }
    }
}