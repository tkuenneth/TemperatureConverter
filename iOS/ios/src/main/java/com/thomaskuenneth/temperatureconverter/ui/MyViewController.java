package com.thomaskuenneth.temperatureconverter.ui;


import com.thomaskuenneth.temperatureconverter.Converter;
import com.thomaskuenneth.temperatureconverter.Model;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIButton;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.uikit.UITextField;
import apple.uikit.UIPickerView;
import apple.uikit.protocol.UIPickerViewDataSource;
import apple.uikit.protocol.UIPickerViewDelegate;

@Runtime(ObjCRuntime.class)
@ObjCClassName("MyViewController")
@RegisterOnStartup
public class MyViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected MyViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MyViewController alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptRotationToDeviceOrientation")
	public static native void attemptRotationToDeviceOrientation();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native MyViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native MyViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MyViewController initWithNibNameBundle(String nibNameOrNil,
			NSBundle nibBundleOrNil);

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("result")
	public native UILabel result();

	@Generated
	@Selector("setResult:")
	public native void setResult_unsafe(UILabel value);

	@Generated
	public void setResult(UILabel value) {
		Object __old = result();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setResult_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("input")
	public native UITextField input();

	@Generated
	@Selector("setInput:")
	public native void setInput_unsafe(UITextField value);

	@Generated
	public void setInput(UITextField value) {
		Object __old = input();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setInput_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Selector("calculate:")
	public void calculate(UIButton sender) {
		performComputation(input().text());
	}

	@Generated
	@Selector("setTempDesti:")
	public native void setTempDesti_unsafe(UIPickerView value);

	@Generated
	public void setTempDesti(UIPickerView value) {
		Object __old = tempDesti();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setTempDesti_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setTempSrc:")
	public native void setTempSrc_unsafe(UIPickerView value);

	@Generated
	public void setTempSrc(UIPickerView value) {
		Object __old = tempSrc();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setTempSrc_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("tempDesti")
	public native UIPickerView tempDesti();

	@Generated
	@Selector("tempSrc")
	public native UIPickerView tempSrc();


	private Model model;

	@Override
	public void viewDidLoad() {
		model = new Model();
		configureUIPickerView(tempSrc());
		configureUIPickerView(tempDesti());

		updateInputUnitFromModel();
		updateOutputUnitFromModel();
		updateInTemperatureFromModel();
		updateOutTemperatureFromModel();
		updateCalculateButton();
	}

	private void configureUIPickerView(UIPickerView view) {
		final String [] values = {Converter.DEGREES_CELSIUS,
		Converter.DEGREES_FAHRENHEIT, Converter.KELVIN};
		view.setDataSource(new UIPickerViewDataSource() {

			@Override
			public long numberOfComponentsInPickerView(UIPickerView pickerView) {
				return 1;
			}

			@Override
			public long pickerViewNumberOfRowsInComponent(UIPickerView pickerView,
														  @NInt long component) {
				return values.length;
			}
		});
		view.setDelegate(new UIPickerViewDelegate() {

			@Override
			public String pickerViewTitleForRowForComponent(UIPickerView pickerView,
															@NInt long row,
															@NInt long component) {
				return values[(int) row];
			}
		});
	}

	// ---------------------------


	// FIXME: outlet fehlt
	private void updateCalculateButton() {
		// calculate().setEnabled(input().text().length() > 0);
	}

	private void updateInputUnitFromModel() {
		long temp = -1;
		switch (model.getInUnit()) {
			case DEGREES_CELSIUS:
				temp = 0;
				break;
			case DEGREES_FAHRENHEIT:
				temp = 1;
				break;
			case KELVIN:
				temp = 2;
				break;
		}
		tempSrc().selectRowInComponentAnimated(temp, 0, false);
	}

	private void updateOutputUnitFromModel() {
		long temp = -1;
		switch (model.getOutUnit()) {
			case DEGREES_CELSIUS:
				temp = 0;
				break;
			case DEGREES_FAHRENHEIT:
				temp = 1;
				break;
			case KELVIN:
				temp = 2;
				break;
		}
		tempDesti().selectRowInComponentAnimated(temp, 0, false);
	}

	private void updateInTemperatureFromModel() {
		Double inTemperature = model.getInTemperature();
		input().setText(inTemperature == null ? "" : inTemperature.toString());
	}

	private void updateOutTemperatureFromModel() {
		result().setText(model.getOutTemperatureAsString());
	}

	private void performComputation(String txt) {
		model.setInTemperature(Double.valueOf(txt));
		model.calculateOutTemperature();
		updateOutTemperatureFromModel();
	}
}