/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: cts/tests/tests/accessibilityservice/src/android/accessibilityservice/IAccessibilityServiceDelegateConnection.aidl
 */
package android.accessibilityservice;
/**
 * Interface for registering an accessibility service delegate.
 */
public interface IAccessibilityServiceDelegateConnection extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IAccessibilityServiceDelegateConnection
{
private static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IAccessibilityServiceDelegateConnection";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.accessibilityservice.IAccessibilityServiceDelegateConnection interface,
 * generating a proxy if needed.
 */
public static android.accessibilityservice.IAccessibilityServiceDelegateConnection asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.accessibilityservice.IAccessibilityServiceDelegateConnection))) {
return ((android.accessibilityservice.IAccessibilityServiceDelegateConnection)iin);
}
return new android.accessibilityservice.IAccessibilityServiceDelegateConnection.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setAccessibilityServiceDelegate:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.setAccessibilityServiceDelegate(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.accessibilityservice.IAccessibilityServiceDelegateConnection
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Sets the delegate interface to which the
     * {@link DelegatingAccessibilityService} to delegate.
     */
public void setAccessibilityServiceDelegate(android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_setAccessibilityServiceDelegate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setAccessibilityServiceDelegate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Sets the delegate interface to which the
     * {@link DelegatingAccessibilityService} to delegate.
     */
public void setAccessibilityServiceDelegate(android.os.IBinder binder) throws android.os.RemoteException;
}
