//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ixor;
import dxc.junit.opcodes.ixor.jm.*;
import dxc.junit.*;
public class Main_testB2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB2().testB2();
}
public void testB2() {
        T_ixor_1 t = new T_ixor_1();
        assertEquals(0xffffffff, t.run(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}