//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokestatic;
import dxc.junit.opcodes.invokestatic.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        // @uses dxc.junit.opcodes.invokestatic.jm.TestClass
        T_invokestatic_2 t = new T_invokestatic_2();
        assertEquals(777, t.run());
    }
}