package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipButtonsAudioRoutesBindingImpl extends VoipButtonsAudioRoutesBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipButtonsAudioRoutesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private VoipButtonsAudioRoutesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            );
        this.audioRoutesLayout.setTag(null);
        this.bluetoothAudioRoute.setTag(null);
        this.earpieceAudioRoute.setTag(null);
        this.speakerAudioRoute.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback60 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback58 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else if (BR.controlsViewModel == variableId) {
            setControlsViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelIsSpeakerSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControlsViewModelIsBluetoothHeadsetSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeControlsViewModelAudioRoutesMenuTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsSpeakerSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSpeakerSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsBluetoothHeadsetSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsBluetoothHeadsetSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelAudioRoutesMenuTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ControlsViewModelAudioRoutesMenuTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSpeakerSelected = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsBluetoothHeadsetSelected = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsBluetoothHeadsetSelectedGetValue = false;
        boolean ControlsViewModelIsBluetoothHeadsetSelected1 = false;
        java.lang.Float controlsViewModelAudioRoutesMenuTranslateYGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Float> controlsViewModelAudioRoutesMenuTranslateY = null;
        boolean ControlsViewModelIsSpeakerSelected1 = false;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        java.lang.Boolean controlsViewModelIsSpeakerSelectedGetValue = null;
        java.lang.Boolean controlsViewModelIsBluetoothHeadsetSelectedGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        boolean controlsViewModelIsSpeakerSelectedControlsViewModelIsBluetoothHeadsetSelectedBooleanFalse = false;
        float androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesMenuTranslateYGetValue = 0f;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;

        if ((dirtyFlags & 0x28L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x33L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isSpeakerSelected
                        controlsViewModelIsSpeakerSelected = controlsViewModel.isSpeakerSelected();
                    }
                    updateLiveDataRegistration(0, controlsViewModelIsSpeakerSelected);


                    if (controlsViewModelIsSpeakerSelected != null) {
                        // read controlsViewModel.isSpeakerSelected.getValue()
                        controlsViewModelIsSpeakerSelectedGetValue = controlsViewModelIsSpeakerSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSpeakerSelectedGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue())
                    ControlsViewModelIsSpeakerSelected1 = !androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue;
                if((dirtyFlags & 0x33L) != 0) {
                    if(ControlsViewModelIsSpeakerSelected1) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isBluetoothHeadsetSelected
                        controlsViewModelIsBluetoothHeadsetSelected = controlsViewModel.isBluetoothHeadsetSelected();
                    }
                    updateLiveDataRegistration(1, controlsViewModelIsBluetoothHeadsetSelected);


                    if (controlsViewModelIsBluetoothHeadsetSelected != null) {
                        // read controlsViewModel.isBluetoothHeadsetSelected.getValue()
                        controlsViewModelIsBluetoothHeadsetSelectedGetValue = controlsViewModelIsBluetoothHeadsetSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isBluetoothHeadsetSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsBluetoothHeadsetSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsBluetoothHeadsetSelectedGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.audioRoutesMenuTranslateY
                        controlsViewModelAudioRoutesMenuTranslateY = controlsViewModel.getAudioRoutesMenuTranslateY();
                    }
                    updateLiveDataRegistration(2, controlsViewModelAudioRoutesMenuTranslateY);


                    if (controlsViewModelAudioRoutesMenuTranslateY != null) {
                        // read controlsViewModel.audioRoutesMenuTranslateY.getValue()
                        controlsViewModelAudioRoutesMenuTranslateYGetValue = controlsViewModelAudioRoutesMenuTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesMenuTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesMenuTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelAudioRoutesMenuTranslateYGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.isBluetoothHeadsetSelected
                    controlsViewModelIsBluetoothHeadsetSelected = controlsViewModel.isBluetoothHeadsetSelected();
                }
                updateLiveDataRegistration(1, controlsViewModelIsBluetoothHeadsetSelected);


                if (controlsViewModelIsBluetoothHeadsetSelected != null) {
                    // read controlsViewModel.isBluetoothHeadsetSelected.getValue()
                    controlsViewModelIsBluetoothHeadsetSelectedGetValue = controlsViewModelIsBluetoothHeadsetSelected.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isBluetoothHeadsetSelected.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsBluetoothHeadsetSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsBluetoothHeadsetSelectedGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isBluetoothHeadsetSelected.getValue())
                ControlsViewModelIsBluetoothHeadsetSelected1 = !androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsBluetoothHeadsetSelectedGetValue;
        }

        if ((dirtyFlags & 0x33L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isBluetoothHeadsetSelected.getValue()) : false
                controlsViewModelIsSpeakerSelectedControlsViewModelIsBluetoothHeadsetSelectedBooleanFalse = ((ControlsViewModelIsSpeakerSelected1) ? (ControlsViewModelIsBluetoothHeadsetSelected1) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.audioRoutesLayout.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesMenuTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.audioRoutesLayout.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.audioRoutesLayout, true);
            this.bluetoothAudioRoute.setOnClickListener(mCallback58);
            this.earpieceAudioRoute.setOnClickListener(mCallback59);
            this.speakerAudioRoute.setOnClickListener(mCallback60);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.bluetoothAudioRoute.setSelected(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsBluetoothHeadsetSelectedGetValue);
        }
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            this.earpieceAudioRoute.setSelected(controlsViewModelIsSpeakerSelectedControlsViewModelIsBluetoothHeadsetSelectedBooleanFalse);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.speakerAudioRoute.setSelected(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {


                    controlsViewModel.forceEarpieceAudioRoute();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {


                    controlsViewModel.forceSpeakerAudioRoute();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {


                    controlsViewModel.forceBluetoothAudioRoute();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.isSpeakerSelected
        flag 1 (0x2L): controlsViewModel.isBluetoothHeadsetSelected
        flag 2 (0x3L): controlsViewModel.audioRoutesMenuTranslateY
        flag 3 (0x4L): inflatedVisibility
        flag 4 (0x5L): controlsViewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isBluetoothHeadsetSelected.getValue()) : false
        flag 7 (0x8L): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isBluetoothHeadsetSelected.getValue()) : false
    flag mapping end*/
    //end
}