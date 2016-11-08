package com.thomaskuenneth.temperatureconverter.ui.moe.c;


import com.thomaskuenneth.temperatureconverter.ui.moe.struct.JNIInvokeInterface;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("MOE")
@Runtime(CRuntime.class)
public final class MOE {
	static {
		NatJ.register();
	}

	@Generated
	private MOE() {
	}

	@Generated
	@CFunction
	public static native int JNI_GetDefaultJavaVMInitArgs(VoidPtr arg1);

	@Generated
	@CFunction
	public static native int JNI_CreateJavaVM(
			Ptr<Ptr<Ptr<JNIInvokeInterface>>> arg1, Ptr<Ptr<VoidPtr>> arg2,
			VoidPtr arg3);

	@Generated
	@CFunction
	public static native int JNI_GetCreatedJavaVMs(
			Ptr<Ptr<Ptr<JNIInvokeInterface>>> arg1, int arg2, IntPtr arg3);

	@Generated
	@CFunction
	public static native int JNI_OnLoad(Ptr<Ptr<JNIInvokeInterface>> vm,
			VoidPtr reserved);

	@Generated
	@CFunction
	public static native void JNI_OnUnload(Ptr<Ptr<JNIInvokeInterface>> vm,
			VoidPtr reserved);

	@Generated
	@CFunction
	public static native int moevm(int jargc, ConstPtr<BytePtr> jargv);
}