//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.if_icmpgt;
import dxc.junit.opcodes.if_icmpgt.jm.*;
import dxc.junit.*;
public class Main_testN3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN3().testN3();
}
public void testN3() {
        T_if_icmpgt_1 t = new T_if_icmpgt_1();
        assertEquals(1, t.run(5, -5));
    }
}
