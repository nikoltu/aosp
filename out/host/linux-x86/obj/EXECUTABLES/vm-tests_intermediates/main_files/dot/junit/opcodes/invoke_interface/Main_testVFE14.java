//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_interface;
import dot.junit.opcodes.invoke_interface.d.*;
import dot.junit.*;
public class Main_testVFE14 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_interface.d.T_invoke_interface_7
        //@uses dot.junit.opcodes.invoke_interface.ITest
        //@uses dot.junit.opcodes.invoke_interface.ITestImpl
        try {
            new T_invoke_interface_7().run(new ITestImpl());
            fail("expected NoSuchMethodError");
        } catch (NoSuchMethodError t) {
        }
    }
}