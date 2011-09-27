package dot.junit.opcodes.add_int;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_add_int extends DeviceTestCase {
public void testB1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testB1.jar", "/data/local/tmp/Main_testB1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB1.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testB1");}

public void testB2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testB2.jar", "/data/local/tmp/Main_testB2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB2.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testB2");}

public void testB3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testB3.jar", "/data/local/tmp/Main_testB3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB3.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testB3");}

public void testB4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testB4.jar", "/data/local/tmp/Main_testB4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB4.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testB4");}

public void testB5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testB5.jar", "/data/local/tmp/Main_testB5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB5.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testB5");}

public void testB6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testB6.jar", "/data/local/tmp/Main_testB6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB6.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testB6");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testN2");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testN3");}

public void testN4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testN4.jar", "/data/local/tmp/Main_testN4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN4.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testN4");}

public void testN5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testN5.jar", "/data/local/tmp/Main_testN5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN5.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testN5");}

public void testN6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testN6.jar", "/data/local/tmp/Main_testN6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_1.jar", "/data/local/tmp/T_add_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN6.jar:/data/local/tmp/T_add_int_1.jar", "dot.junit.opcodes.add_int.Main_testN6");}

public void testN7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testN7.jar", "/data/local/tmp/Main_testN7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_5.jar", "/data/local/tmp/T_add_int_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN7.jar:/data/local/tmp/T_add_int_5.jar", "dot.junit.opcodes.add_int.Main_testN7");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_2.jar", "/data/local/tmp/T_add_int_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_add_int_2.jar", "dot.junit.opcodes.add_int.Main_testVFE1");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_3.jar", "/data/local/tmp/T_add_int_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_add_int_3.jar", "dot.junit.opcodes.add_int.Main_testVFE2");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_4.jar", "/data/local/tmp/T_add_int_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_add_int_4.jar", "dot.junit.opcodes.add_int.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/add_int/d/T_add_int_6.jar", "/data/local/tmp/T_add_int_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_add_int_6.jar", "dot.junit.opcodes.add_int.Main_testVFE4");}


}
