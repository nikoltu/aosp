package dot.junit.opcodes.opc_const;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_opc_const extends DeviceTestCase {
public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/d/T_opc_const_1.jar", "/data/local/tmp/T_opc_const_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_opc_const_1.jar", "dot.junit.opcodes.opc_const.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/d/T_opc_const_2.jar", "/data/local/tmp/T_opc_const_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_opc_const_2.jar", "dot.junit.opcodes.opc_const.Main_testN2");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/d/T_opc_const_3.jar", "/data/local/tmp/T_opc_const_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_opc_const_3.jar", "dot.junit.opcodes.opc_const.Main_testVFE1");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/opc_const/d/T_opc_const_4.jar", "/data/local/tmp/T_opc_const_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_opc_const_4.jar", "dot.junit.opcodes.opc_const.Main_testVFE2");}


}