//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ifeq;
import dxc.junit.opcodes.ifeq.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_ifeq_1 t = new T_ifeq_1();
        /*
         * Compare with 1234 to check that in case of failed comparison
         * execution proceeds at the address following if_acmpeq instruction
         */
        assertEquals(1234, t.run(5));
    }
}
