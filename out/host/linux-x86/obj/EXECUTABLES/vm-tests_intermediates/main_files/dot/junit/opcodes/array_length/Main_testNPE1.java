//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.array_length;
import dot.junit.opcodes.array_length.d.*;
import dot.junit.*;
public class Main_testNPE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_array_length_1 t = new T_array_length_1();
        try {
            t.run(null);
            fail("NPE expected");
        } catch (NullPointerException npe) {
            // expected
        }
    }
}
