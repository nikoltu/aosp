//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ldc2_w;
import dxc.junit.opcodes.ldc2_w.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_ldc2_w_2 t = new T_ldc2_w_2();
        double a = 1234567890123232323232232323232323232323232323456788d;
        double b = 1d;
        assertEquals(a + b, t.run(), 0d);
    }
}
