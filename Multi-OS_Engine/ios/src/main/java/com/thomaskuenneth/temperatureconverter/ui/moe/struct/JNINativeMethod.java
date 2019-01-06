package com.thomaskuenneth.temperatureconverter.ui.moe.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class JNINativeMethod extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public JNINativeMethod() {
		super(JNINativeMethod.class);
	}

	@Generated
	protected JNINativeMethod(Pointer peer) {
		super(peer);
	}

	@Generated
	public JNINativeMethod(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String signature,
			VoidPtr fnPtr) {
		super(JNINativeMethod.class);
		setName(name);
		setSignature(signature);
		setFnPtr(fnPtr);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String name();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setName(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String signature();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSignature(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr fnPtr();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setFnPtr(VoidPtr value);
}