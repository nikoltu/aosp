//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_direct;
import dot.junit.opcodes.invoke_direct.d.*;
import dot.junit.*;
public class Main_testVFE13 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_invoke_direct_7().run();
            fail("expected NoSuchMethodError");
        } catch (NoSuchMethodError t) {
        }
    }
}