//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_object;
import dot.junit.opcodes.aget_object.d.*;
import dot.junit.*;
public class Main_testE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aget_object_1 t = new T_aget_object_1();
        String[] arr = null;
        try {
            t.run(arr, 0);
            fail("expected NullPointerException");
        } catch (NullPointerException npe) {
            // expected
        }
    }
}