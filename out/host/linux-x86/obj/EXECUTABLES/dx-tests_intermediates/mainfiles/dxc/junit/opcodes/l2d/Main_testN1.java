//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.l2d;
import dxc.junit.opcodes.l2d.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_l2d_1 t = new T_l2d_1();
        assertEquals(5.0E10d, t.run(50000000000l), 0d);
    }
}