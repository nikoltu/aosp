//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fadd;
import dxc.junit.opcodes.fadd.jm.*;
import dxc.junit.*;
public class Main_testB2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB2().testB2();
}
public void testB2() {
        T_fadd_1 t = new T_fadd_1();
        assertTrue(Float.isNaN(t.run(Float.POSITIVE_INFINITY,
                Float.NEGATIVE_INFINITY)));
    }
}
