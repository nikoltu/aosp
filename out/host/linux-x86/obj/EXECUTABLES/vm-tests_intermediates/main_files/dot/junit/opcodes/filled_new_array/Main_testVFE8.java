//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.filled_new_array;
import dot.junit.opcodes.filled_new_array.d.*;
import dot.junit.*;
public class Main_testVFE8 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.filled_new_array.d.T_filled_new_array_10
        try {
            T_filled_new_array_10 T = new T_filled_new_array_10();
            T.run();
            fail("expected a NoClassDefFoundError exception");
        } catch(NoClassDefFoundError t) {
            // expected
        }
    }
}