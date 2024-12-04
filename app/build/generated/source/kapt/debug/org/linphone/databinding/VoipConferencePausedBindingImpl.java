package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferencePausedBindingImpl extends VoipConferencePausedBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.out_of_conf_title, 2);
        sViewsWithIds.put(R.id.out_of_conf_subtitle, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback204;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferencePausedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private VoipConferencePausedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.resumeConference.setTag(null);
        setRootTag(root);
        // listeners
        mCallback204 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
        if (BR.conferenceViewModel == variableId) {
            setConferenceViewModel((org.linphone.activities.voip.viewmodels.ConferenceViewModel) variable);
        }
        else if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConferenceViewModel(@Nullable org.linphone.activities.voip.viewmodels.ConferenceViewModel ConferenceViewModel) {
        this.mConferenceViewModel = ConferenceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.mboundView0, true);
            this.resumeConference.setOnClickListener(mCallback204);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // conferenceViewModel
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        // conferenceViewModel != null
        boolean conferenceViewModelJavaLangObjectNull = false;



        conferenceViewModelJavaLangObjectNull = (conferenceViewModel) != (null);
        if (conferenceViewModelJavaLangObjectNull) {


            conferenceViewModel.resumeConference();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): conferenceViewModel
        flag 1 (0x2L): inflatedVisibility
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}