//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.new_array;
import dot.junit.opcodes.new_array.d.*;
import dot.junit.*;
public class Main_testN1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_new_array_1 t = new T_new_array_1();
        int[] r = t.run(10);
        int l = r.length;
        assertEquals(10, l);

        // check default initialization
        for (int i = 0; i < l; i++) {
            assertEquals(0, r[i]);
        }

    }
}
