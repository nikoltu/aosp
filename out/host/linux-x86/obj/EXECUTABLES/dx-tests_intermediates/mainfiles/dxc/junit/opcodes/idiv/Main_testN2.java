//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.idiv;
import dxc.junit.opcodes.idiv.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_idiv_1 t = new T_idiv_1();
        assertEquals(268435455, t.run(1073741823, 4));
    }
}
