//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lookupswitch;
import dxc.junit.opcodes.lookupswitch.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_lookupswitch_1 t = new T_lookupswitch_1();
        assertEquals(2, t.run(-1));

        assertEquals(-1, t.run(9));
        assertEquals(20, t.run(10));
        assertEquals(-1, t.run(11));

        assertEquals(-1, t.run(14));
        assertEquals(20, t.run(15));
        assertEquals(-1, t.run(16));
    }
}