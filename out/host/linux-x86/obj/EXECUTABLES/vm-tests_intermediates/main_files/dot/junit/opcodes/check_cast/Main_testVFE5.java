//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.check_cast;
import dot.junit.opcodes.check_cast.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.check_cast.TestStubs
        //@uses dot.junit.opcodes.check_cast.d.T_check_cast_3
        T_check_cast_3 t = new T_check_cast_3();
        try {
            t.run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError iae) {
            // expected
        }
    }
}
