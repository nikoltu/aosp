//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.tableswitch;
import dxc.junit.opcodes.tableswitch.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_tableswitch_1 t = new T_tableswitch_1();
        assertEquals(2, t.run(-1));

        assertEquals(-1, t.run(4));
        assertEquals(20, t.run(2));
        assertEquals(-1, t.run(5));

        assertEquals(-1, t.run(6));
        assertEquals(20, t.run(3));
        assertEquals(-1, t.run(7));
    }
}