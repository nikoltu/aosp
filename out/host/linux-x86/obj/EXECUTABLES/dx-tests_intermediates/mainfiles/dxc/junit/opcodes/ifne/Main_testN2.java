//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ifne;
import dxc.junit.opcodes.ifne.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_ifne_1 t = new T_ifne_1();
        /*
         * Compare with 1234 to check that in case of failed comparison
         * execution proceeds at the address following if_acmpeq instruction
         */
        assertEquals(1234, t.run(0));
    }
}
