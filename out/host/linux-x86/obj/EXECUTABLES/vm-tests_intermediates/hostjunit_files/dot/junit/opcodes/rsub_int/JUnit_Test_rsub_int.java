package dot.junit.opcodes.rsub_int;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_rsub_int extends DeviceTestCase {
public void testB1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB1.jar", "/data/local/tmp/Main_testB1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_3.jar", "/data/local/tmp/T_rsub_int_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB1.jar:/data/local/tmp/T_rsub_int_3.jar", "dot.junit.opcodes.rsub_int.Main_testB1");}

public void testB10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB10.jar", "/data/local/tmp/Main_testB10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_7.jar", "/data/local/tmp/T_rsub_int_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB10.jar:/data/local/tmp/T_rsub_int_7.jar", "dot.junit.opcodes.rsub_int.Main_testB10");}

public void testB11() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB11.jar", "/data/local/tmp/Main_testB11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_7.jar", "/data/local/tmp/T_rsub_int_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB11.jar:/data/local/tmp/T_rsub_int_7.jar", "dot.junit.opcodes.rsub_int.Main_testB11");}

public void testB12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB12.jar", "/data/local/tmp/Main_testB12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_7.jar", "/data/local/tmp/T_rsub_int_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB12.jar:/data/local/tmp/T_rsub_int_7.jar", "dot.junit.opcodes.rsub_int.Main_testB12");}

public void testB2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB2.jar", "/data/local/tmp/Main_testB2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_3.jar", "/data/local/tmp/T_rsub_int_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB2.jar:/data/local/tmp/T_rsub_int_3.jar", "dot.junit.opcodes.rsub_int.Main_testB2");}

public void testB3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB3.jar", "/data/local/tmp/Main_testB3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_3.jar", "/data/local/tmp/T_rsub_int_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB3.jar:/data/local/tmp/T_rsub_int_3.jar", "dot.junit.opcodes.rsub_int.Main_testB3");}

public void testB4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB4.jar", "/data/local/tmp/Main_testB4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_4.jar", "/data/local/tmp/T_rsub_int_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB4.jar:/data/local/tmp/T_rsub_int_4.jar", "dot.junit.opcodes.rsub_int.Main_testB4");}

public void testB5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB5.jar", "/data/local/tmp/Main_testB5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_4.jar", "/data/local/tmp/T_rsub_int_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB5.jar:/data/local/tmp/T_rsub_int_4.jar", "dot.junit.opcodes.rsub_int.Main_testB5");}

public void testB6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB6.jar", "/data/local/tmp/Main_testB6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_5.jar", "/data/local/tmp/T_rsub_int_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB6.jar:/data/local/tmp/T_rsub_int_5.jar", "dot.junit.opcodes.rsub_int.Main_testB6");}

public void testB7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB7.jar", "/data/local/tmp/Main_testB7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_5.jar", "/data/local/tmp/T_rsub_int_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB7.jar:/data/local/tmp/T_rsub_int_5.jar", "dot.junit.opcodes.rsub_int.Main_testB7");}

public void testB8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB8.jar", "/data/local/tmp/Main_testB8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_6.jar", "/data/local/tmp/T_rsub_int_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB8.jar:/data/local/tmp/T_rsub_int_6.jar", "dot.junit.opcodes.rsub_int.Main_testB8");}

public void testB9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testB9.jar", "/data/local/tmp/Main_testB9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_6.jar", "/data/local/tmp/T_rsub_int_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB9.jar:/data/local/tmp/T_rsub_int_6.jar", "dot.junit.opcodes.rsub_int.Main_testB9");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_1.jar", "/data/local/tmp/T_rsub_int_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_rsub_int_1.jar", "dot.junit.opcodes.rsub_int.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_2.jar", "/data/local/tmp/T_rsub_int_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_rsub_int_2.jar", "dot.junit.opcodes.rsub_int.Main_testN2");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_12.jar", "/data/local/tmp/T_rsub_int_12.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_rsub_int_12.jar", "dot.junit.opcodes.rsub_int.Main_testN3");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_8.jar", "/data/local/tmp/T_rsub_int_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_rsub_int_8.jar", "dot.junit.opcodes.rsub_int.Main_testVFE1");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_9.jar", "/data/local/tmp/T_rsub_int_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_rsub_int_9.jar", "dot.junit.opcodes.rsub_int.Main_testVFE2");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_10.jar", "/data/local/tmp/T_rsub_int_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_rsub_int_10.jar", "dot.junit.opcodes.rsub_int.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/rsub_int/d/T_rsub_int_11.jar", "/data/local/tmp/T_rsub_int_11.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_rsub_int_11.jar", "dot.junit.opcodes.rsub_int.Main_testVFE4");}


}
