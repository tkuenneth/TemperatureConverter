package com.thomaskuenneth.temperatureconverter.ui.moe.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class JavaVMInitArgs extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public JavaVMInitArgs() {
		super(JavaVMInitArgs.class);
	}

	@Generated
	protected JavaVMInitArgs(Pointer peer) {
		super(peer);
	}

	@Generated
	public JavaVMInitArgs(
			int version,
			int nOptions,
			@UncertainArgument("Options: reference, array Fallback: reference") JavaVMOption options,
			byte ignoreUnrecognized) {
		super(JavaVMInitArgs.class);
		setVersion(version);
		setNOptions(nOptions);
		setOptions(options);
		setIgnoreUnrecognized(ignoreUnrecognized);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int nOptions();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNOptions(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native JavaVMOption options();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setOptions(
			@UncertainArgument("Options: reference, array Fallback: reference") JavaVMOption value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native byte ignoreUnrecognized();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setIgnoreUnrecognized(byte value);
}