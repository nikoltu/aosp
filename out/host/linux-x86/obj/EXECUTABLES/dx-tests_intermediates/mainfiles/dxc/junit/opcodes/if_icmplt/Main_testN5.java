//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.if_icmplt;
import dxc.junit.opcodes.if_icmplt.jm.*;
import dxc.junit.*;
public class Main_testN5 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN5().testN5();
}
public void testN5() {
        T_if_icmplt_1 t = new T_if_icmplt_1();
        assertEquals(1, t.run(0x1234, 0x01001234));
    }
}
