//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_boolean;
import dot.junit.opcodes.aget_boolean.d.*;
import dot.junit.*;
public class Main_testN2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aget_boolean_1 t = new T_aget_boolean_1();
        boolean[] arr = new boolean[2];
        arr[0] = true;
        assertEquals(true, t.run(arr, 0));
    }
}