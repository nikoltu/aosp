//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_static;
import dot.junit.opcodes.invoke_static.d.*;
import dot.junit.*;
public class Main_testVFE10 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_static.d.T_invoke_static_13
        //@uses dot.junit.opcodes.invoke_static.TestClass
        try {
            new T_invoke_static_13().run();
            fail("expected NoSuchMethodError");
        } catch (NoSuchMethodError t) {
        }
    }
}