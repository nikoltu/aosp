//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ldc_w;
import dxc.junit.opcodes.ldc_w.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_ldc_w_2 t = new T_ldc_w_2();
        int a = 1000000000;
        int b = 1000000000;
        assertEquals(a + b, t.run());
    }
}
