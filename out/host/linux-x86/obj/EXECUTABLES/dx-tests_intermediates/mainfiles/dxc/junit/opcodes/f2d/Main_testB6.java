//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.f2d;
import dxc.junit.opcodes.f2d.jm.*;
import dxc.junit.*;
public class Main_testB6 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB6().testB6();
}
public void testB6() {
        T_f2d_1 t = new T_f2d_1();
        assertTrue(Double.isInfinite(t.run(Float.NEGATIVE_INFINITY)));
    }
}
