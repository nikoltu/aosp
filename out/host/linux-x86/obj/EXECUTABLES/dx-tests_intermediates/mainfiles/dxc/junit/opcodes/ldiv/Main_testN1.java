//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ldiv;
import dxc.junit.opcodes.ldiv.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_ldiv_1 t = new T_ldiv_1();
        assertEquals(2l, t.run(100000000000l, 40000000000l));
    }
}
