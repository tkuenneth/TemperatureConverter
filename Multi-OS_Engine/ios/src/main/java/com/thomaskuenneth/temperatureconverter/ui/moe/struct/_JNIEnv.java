package com.thomaskuenneth.temperatureconverter.ui.moe.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class _JNIEnv extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public _JNIEnv() {
		super(_JNIEnv.class);
	}

	@Generated
	protected _JNIEnv(Pointer peer) {
		super(peer);
	}

	@Generated
	public _JNIEnv(VoidPtr functions) {
		super(_JNIEnv.class);
		setFunctions(functions);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr functions();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFunctions(VoidPtr value);
}