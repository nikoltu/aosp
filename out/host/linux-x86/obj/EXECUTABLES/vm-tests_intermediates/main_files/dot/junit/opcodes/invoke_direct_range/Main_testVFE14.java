//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_direct_range;
import dot.junit.opcodes.invoke_direct_range.d.*;
import dot.junit.*;
public class Main_testVFE14 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_invoke_direct_range_16().run();
            fail("expected NoSuchMethodError");
        } catch (NoSuchMethodError t) {
        }
    }
}