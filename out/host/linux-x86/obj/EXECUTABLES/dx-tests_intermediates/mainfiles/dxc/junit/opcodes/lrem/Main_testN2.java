//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lrem;
import dxc.junit.opcodes.lrem.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_lrem_1 t = new T_lrem_1();
        assertEquals(123l, t.run(1234567890123l, 123456789l));
    }
}
