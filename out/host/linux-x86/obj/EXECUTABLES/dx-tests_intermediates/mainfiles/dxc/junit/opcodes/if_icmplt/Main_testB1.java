//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.if_icmplt;
import dxc.junit.opcodes.if_icmplt.jm.*;
import dxc.junit.*;
public class Main_testB1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB1().testB1();
}
public void testB1() {
        T_if_icmplt_1 t = new T_if_icmplt_1();
        assertEquals(1234, t.run(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}
