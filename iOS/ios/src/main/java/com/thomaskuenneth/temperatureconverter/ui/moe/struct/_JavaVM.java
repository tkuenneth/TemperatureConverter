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
public final class _JavaVM extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public _JavaVM() {
		super(_JavaVM.class);
	}

	@Generated
	protected _JavaVM(Pointer peer) {
		super(peer);
	}

	@Generated
	public _JavaVM(
			@UncertainArgument("Options: reference, array Fallback: reference") JNIInvokeInterface functions) {
		super(_JavaVM.class);
		setFunctions(functions);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native JNIInvokeInterface functions();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFunctions(
			@UncertainArgument("Options: reference, array Fallback: reference") JNIInvokeInterface value);
}