//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.newarray;
import dxc.junit.opcodes.newarray.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_newarray_2 t = new T_newarray_2();
        float[] r = t.run(10);
        int l = r.length;
        assertEquals(10, l);

        // check default initialization
        for (int i = 0; i < l; i++) {
            assertEquals(0f, r[i]);
        }
    }
}