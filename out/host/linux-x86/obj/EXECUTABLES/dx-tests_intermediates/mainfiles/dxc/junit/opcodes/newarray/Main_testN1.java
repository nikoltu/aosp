//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.newarray;
import dxc.junit.opcodes.newarray.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_newarray_1 t = new T_newarray_1();
        int[] r = t.run(10);
        int l = r.length;
        assertEquals(10, l);

        // check default initialization
        for (int i = 0; i < l; i++) {
            assertEquals(0, r[i]);
        }

    }
}