//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ldiv;
import dxc.junit.opcodes.ldiv.jm.*;
import dxc.junit.*;
public class Main_testN4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN4().testN4();
}
public void testN4() {
        T_ldiv_1 t = new T_ldiv_1();
        assertEquals(-8, t.run(-98765432123456l, 12345678912345l));
    }
}
