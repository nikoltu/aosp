//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fadd;
import dxc.junit.opcodes.fadd.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_fadd_1 t = new T_fadd_1();
        assertEquals(5.84f, t.run(2.7f, 3.14f));
    }
}
