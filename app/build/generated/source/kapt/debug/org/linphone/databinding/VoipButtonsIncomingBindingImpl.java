package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipButtonsIncomingBindingImpl extends VoipButtonsIncomingBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback124;
    @Nullable
    private final android.view.View.OnClickListener mCallback125;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipButtonsIncomingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private VoipButtonsIncomingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.answer.setTag(null);
        this.hangup.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback124 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback125 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsIncomingCallVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsIncomingCallVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsIncomingCallVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsIncomingCallVideoGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsIncomingCallVideo = null;
        java.lang.Boolean viewModelIsIncomingCallVideoGetValue = null;
        android.graphics.drawable.Drawable viewModelIsIncomingCallVideoAnswerAndroidDrawableIconCallAnswerVideoAnswerAndroidDrawableIconCallAnswer = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isIncomingCallVideo
                    viewModelIsIncomingCallVideo = viewModel.isIncomingCallVideo();
                }
                updateLiveDataRegistration(0, viewModelIsIncomingCallVideo);


                if (viewModelIsIncomingCallVideo != null) {
                    // read viewModel.isIncomingCallVideo.getValue()
                    viewModelIsIncomingCallVideoGetValue = viewModelIsIncomingCallVideo.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isIncomingCallVideo.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsIncomingCallVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsIncomingCallVideoGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsIncomingCallVideoGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isIncomingCallVideo.getValue()) ? @android:drawable/icon_call_answer_video : @android:drawable/icon_call_answer
                viewModelIsIncomingCallVideoAnswerAndroidDrawableIconCallAnswerVideoAnswerAndroidDrawableIconCallAnswer = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsIncomingCallVideoGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(answer.getContext(), R.drawable.icon_call_answer_video)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(answer.getContext(), R.drawable.icon_call_answer)));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.answer.setOnClickListener(mCallback125);
            this.hangup.setOnClickListener(mCallback124);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.answer, viewModelIsIncomingCallVideoAnswerAndroidDrawableIconCallAnswerVideoAnswerAndroidDrawableIconCallAnswer);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.hangUp();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.answer();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isIncomingCallVideo
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isIncomingCallVideo.getValue()) ? @android:drawable/icon_call_answer_video : @android:drawable/icon_call_answer
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isIncomingCallVideo.getValue()) ? @android:drawable/icon_call_answer_video : @android:drawable/icon_call_answer
    flag mapping end*/
    //end
}