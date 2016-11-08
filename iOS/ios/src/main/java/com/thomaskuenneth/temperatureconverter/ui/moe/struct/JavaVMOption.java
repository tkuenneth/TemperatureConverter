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
public final class JavaVMOption extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public JavaVMOption() {
		super(JavaVMOption.class);
	}

	@Generated
	protected JavaVMOption(Pointer peer) {
		super(peer);
	}

	@Generated
	public JavaVMOption(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String optionString,
			VoidPtr extraInfo) {
		super(JavaVMOption.class);
		setOptionString(optionString);
		setExtraInfo(extraInfo);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String optionString();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setOptionString(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native VoidPtr extraInfo();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setExtraInfo(VoidPtr value);
}