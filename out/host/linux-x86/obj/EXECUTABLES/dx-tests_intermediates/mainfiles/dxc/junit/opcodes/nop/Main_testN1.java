//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.nop;
import dxc.junit.opcodes.nop.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_nop_1 t = new T_nop_1();
        // how do we test nop - e.g. push some data onto the stack, and
        // test if nothing has changed
        assertTrue(t.run());
    }
}
