//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.irem;
import dxc.junit.opcodes.irem.jm.*;
import dxc.junit.*;
public class Main_testB1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB1().testB1();
}
public void testB1() {
        T_irem_1 t = new T_irem_1();
        // result is MIN_VALUE because overflow occurs in this case
        assertEquals(0, t.run(Integer.MIN_VALUE, -1));
    }
}