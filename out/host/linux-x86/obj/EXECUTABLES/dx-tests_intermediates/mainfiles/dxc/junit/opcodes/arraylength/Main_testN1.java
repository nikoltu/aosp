//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.arraylength;
import dxc.junit.opcodes.arraylength.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_arraylength_1 t = new T_arraylength_1();
        String[] a = new String[5];
        assertEquals(5, t.run(a));
    }
}