//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface;
import dot.junit.opcodes.invoke_interface.d.*;
import dot.junit.*;
public class Main_testVFE10 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface.ITest
        //@uses dot.junit.opcodes.invoke_interface.ITestImpl
        //@uses dot.junit.opcodes.invoke_interface.ITestImplAbstract
        try {
            new T_invoke_interface_18().run(new ITestImpl());
            fail("expected InstantiationError");
        } catch (InstantiationError t) {
        }
    }
}