//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.dreturn;
import dxc.junit.opcodes.dreturn.jm.*;
import dxc.junit.*;
public class Main_testE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE2().testE2();
}
public void testE2() {
        T_dreturn_9 t = new T_dreturn_9();
        try {
            assertEquals(1d, t.run());
            // the JVM spec says that it is optional to implement the structural
            // lock rules, see JVM spec 8.13 and monitorenter/exit opcodes.
            System.out.print("dvmvfe:");
            //fail("expected IllegalMonitorStateException");
        } catch (IllegalMonitorStateException imse) {
            // expected
        }
    }
}
