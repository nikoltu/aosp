//autogenerated by util.CollectAllTests, do not change
package dxc.junit.argsreturns.pargsreturn;
import dxc.junit.argsreturns.pargsreturn.jm.*;
import dxc.junit.*;
public class Main_testN3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN3().testN3();
}
public void testN3() {
        T3 t = new T3();
        t.run(1234);
        assertEquals(1234, t.i1);
    }
}
