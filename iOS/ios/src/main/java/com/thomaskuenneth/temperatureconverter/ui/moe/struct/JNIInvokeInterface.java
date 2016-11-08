package com.thomaskuenneth.temperatureconverter.ui.moe.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class JNIInvokeInterface extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public JNIInvokeInterface() {
		super(JNIInvokeInterface.class);
	}

	@Generated
	protected JNIInvokeInterface(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr reserved0();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setReserved0(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr reserved1();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReserved1(VoidPtr value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr reserved2();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setReserved2(VoidPtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	@FunctionPtr(name = "call_DestroyJavaVM")
	public native Function_DestroyJavaVM DestroyJavaVM();

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_DestroyJavaVM {
		@Generated
		int call_DestroyJavaVM(
				@ReferenceInfo(type = JNIInvokeInterface.class, depth = 2) Ptr<ConstPtr<JNIInvokeInterface>> arg0);
	}

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setDestroyJavaVM(
			@FunctionPtr(name = "call_DestroyJavaVM") Function_DestroyJavaVM value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@FunctionPtr(name = "call_AttachCurrentThread")
	public native Function_AttachCurrentThread AttachCurrentThread();

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AttachCurrentThread {
		@Generated
		int call_AttachCurrentThread(
				@ReferenceInfo(type = JNIInvokeInterface.class, depth = 2) Ptr<ConstPtr<JNIInvokeInterface>> arg0,
				@ReferenceInfo(type = Void.class, depth = 3) Ptr<Ptr<VoidPtr>> arg1,
				VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAttachCurrentThread(
			@FunctionPtr(name = "call_AttachCurrentThread") Function_AttachCurrentThread value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@FunctionPtr(name = "call_DetachCurrentThread")
	public native Function_DetachCurrentThread DetachCurrentThread();

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_DetachCurrentThread {
		@Generated
		int call_DetachCurrentThread(
				@ReferenceInfo(type = JNIInvokeInterface.class, depth = 2) Ptr<ConstPtr<JNIInvokeInterface>> arg0);
	}

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setDetachCurrentThread(
			@FunctionPtr(name = "call_DetachCurrentThread") Function_DetachCurrentThread value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	@FunctionPtr(name = "call_GetEnv")
	public native Function_GetEnv GetEnv();

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_GetEnv {
		@Generated
		int call_GetEnv(
				@ReferenceInfo(type = JNIInvokeInterface.class, depth = 2) Ptr<ConstPtr<JNIInvokeInterface>> arg0,
				@ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg1,
				int arg2);
	}

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setGetEnv(
			@FunctionPtr(name = "call_GetEnv") Function_GetEnv value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	@FunctionPtr(name = "call_AttachCurrentThreadAsDaemon")
	public native Function_AttachCurrentThreadAsDaemon AttachCurrentThreadAsDaemon();

	@Runtime(CRuntime.class)
	@Generated
	public interface Function_AttachCurrentThreadAsDaemon {
		@Generated
		int call_AttachCurrentThreadAsDaemon(
				@ReferenceInfo(type = JNIInvokeInterface.class, depth = 2) Ptr<ConstPtr<JNIInvokeInterface>> arg0,
				@ReferenceInfo(type = Void.class, depth = 3) Ptr<Ptr<VoidPtr>> arg1,
				VoidPtr arg2);
	}

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setAttachCurrentThreadAsDaemon(
			@FunctionPtr(name = "call_AttachCurrentThreadAsDaemon") Function_AttachCurrentThreadAsDaemon value);
}