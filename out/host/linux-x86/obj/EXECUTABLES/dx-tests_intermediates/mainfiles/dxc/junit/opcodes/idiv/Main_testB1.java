//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.idiv;
import dxc.junit.opcodes.idiv.jm.*;
import dxc.junit.*;
public class Main_testB1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB1().testB1();
}
public void testB1() {
        T_idiv_1 t = new T_idiv_1();
        // result is MIN_VALUE because overflow occurs in this case
        assertEquals(Integer.MIN_VALUE, t.run(Integer.MIN_VALUE, -1));
    }
}