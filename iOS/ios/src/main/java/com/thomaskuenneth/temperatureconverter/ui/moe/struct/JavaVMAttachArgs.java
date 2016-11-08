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
public final class JavaVMAttachArgs extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public JavaVMAttachArgs() {
		super(JavaVMAttachArgs.class);
	}

	@Generated
	protected JavaVMAttachArgs(Pointer peer) {
		super(peer);
	}

	@Generated
	public JavaVMAttachArgs(
			int version,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
			VoidPtr group) {
		super(JavaVMAttachArgs.class);
		setVersion(version);
		setName(name);
		setGroup(group);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public native String name();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setName(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native VoidPtr group();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setGroup(VoidPtr value);
}