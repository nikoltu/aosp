//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface;
import dot.junit.opcodes.invoke_interface.d.*;
import dot.junit.*;
public class Main_testVFE12 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface.ITest
        //@uses dot.junit.opcodes.invoke_interface.ITestImpl
        try {
            new T_invoke_interface_21().run(new ITestImpl());
            fail("expected VerifyError");
        } catch (VerifyError t) {
        }
    }
}