//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.f2d;
import dxc.junit.opcodes.f2d.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_f2d_1 t = new T_f2d_1();
        assertEquals(0.5d, t.run(0.5f), 0d);
    }
}