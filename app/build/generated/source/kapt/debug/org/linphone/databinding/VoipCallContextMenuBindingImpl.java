package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallContextMenuBindingImpl extends VoipCallContextMenuBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallContextMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private VoipCallContextMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        if (BR.answerClickListener == variableId) {
            setAnswerClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.hangupClickListener == variableId) {
            setHangupClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.resumeClickListener == variableId) {
            setResumeClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.transferClickListener == variableId) {
            setTransferClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.hideResume == variableId) {
            setHideResume((java.lang.Boolean) variable);
        }
        else if (BR.hideAccept == variableId) {
            setHideAccept((java.lang.Boolean) variable);
        }
        else if (BR.pauseClickListener == variableId) {
            setPauseClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.hidePause == variableId) {
            setHidePause((java.lang.Boolean) variable);
        }
        else if (BR.hideTransfer == variableId) {
            setHideTransfer((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAnswerClickListener(@Nullable android.view.View.OnClickListener AnswerClickListener) {
        this.mAnswerClickListener = AnswerClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.answerClickListener);
        super.requestRebind();
    }
    public void setHangupClickListener(@Nullable android.view.View.OnClickListener HangupClickListener) {
        this.mHangupClickListener = HangupClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.hangupClickListener);
        super.requestRebind();
    }
    public void setResumeClickListener(@Nullable android.view.View.OnClickListener ResumeClickListener) {
        this.mResumeClickListener = ResumeClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.resumeClickListener);
        super.requestRebind();
    }
    public void setTransferClickListener(@Nullable android.view.View.OnClickListener TransferClickListener) {
        this.mTransferClickListener = TransferClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.transferClickListener);
        super.requestRebind();
    }
    public void setHideResume(@Nullable java.lang.Boolean HideResume) {
        this.mHideResume = HideResume;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.hideResume);
        super.requestRebind();
    }
    public void setHideAccept(@Nullable java.lang.Boolean HideAccept) {
        this.mHideAccept = HideAccept;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.hideAccept);
        super.requestRebind();
    }
    public void setPauseClickListener(@Nullable android.view.View.OnClickListener PauseClickListener) {
        this.mPauseClickListener = PauseClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.pauseClickListener);
        super.requestRebind();
    }
    public void setHidePause(@Nullable java.lang.Boolean HidePause) {
        this.mHidePause = HidePause;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.hidePause);
        super.requestRebind();
    }
    public void setHideTransfer(@Nullable java.lang.Boolean HideTransfer) {
        this.mHideTransfer = HideTransfer;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.hideTransfer);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxHideTransfer = false;
        android.view.View.OnClickListener answerClickListener = mAnswerClickListener;
        int hidePauseViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener hangupClickListener = mHangupClickListener;
        android.view.View.OnClickListener resumeClickListener = mResumeClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxHidePause = false;
        android.view.View.OnClickListener transferClickListener = mTransferClickListener;
        int hideResumeViewGONEViewVISIBLE = 0;
        java.lang.Boolean hideResume = mHideResume;
        java.lang.Boolean hideAccept = mHideAccept;
        int hideAcceptViewGONEViewVISIBLE = 0;
        int hideTransferViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxHideAccept = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxHideResume = false;
        android.view.View.OnClickListener pauseClickListener = mPauseClickListener;
        java.lang.Boolean hidePause = mHidePause;
        java.lang.Boolean hideTransfer = mHideTransfer;

        if ((dirtyFlags & 0x201L) != 0) {
        }
        if ((dirtyFlags & 0x202L) != 0) {
        }
        if ((dirtyFlags & 0x204L) != 0) {
        }
        if ((dirtyFlags & 0x208L) != 0) {
        }
        if ((dirtyFlags & 0x210L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(hideResume)
                androidxDatabindingViewDataBindingSafeUnboxHideResume = androidx.databinding.ViewDataBinding.safeUnbox(hideResume);
            if((dirtyFlags & 0x210L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxHideResume) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(hideResume) ? View.GONE : View.VISIBLE
                hideResumeViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxHideResume) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x220L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(hideAccept)
                androidxDatabindingViewDataBindingSafeUnboxHideAccept = androidx.databinding.ViewDataBinding.safeUnbox(hideAccept);
            if((dirtyFlags & 0x220L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxHideAccept) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(hideAccept) ? View.GONE : View.VISIBLE
                hideAcceptViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxHideAccept) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(hidePause)
                androidxDatabindingViewDataBindingSafeUnboxHidePause = androidx.databinding.ViewDataBinding.safeUnbox(hidePause);
            if((dirtyFlags & 0x280L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxHidePause) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(hidePause) ? View.GONE : View.VISIBLE
                hidePauseViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxHidePause) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x300L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(hideTransfer)
                androidxDatabindingViewDataBindingSafeUnboxHideTransfer = androidx.databinding.ViewDataBinding.safeUnbox(hideTransfer);
            if((dirtyFlags & 0x300L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxHideTransfer) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(hideTransfer) ? View.GONE : View.VISIBLE
                hideTransferViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxHideTransfer) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x204L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(resumeClickListener);
        }
        if ((dirtyFlags & 0x210L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(hideResumeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(pauseClickListener);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(hidePauseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x208L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(transferClickListener);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(hideTransferViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(answerClickListener);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(hideAcceptViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(hangupClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): answerClickListener
        flag 1 (0x2L): hangupClickListener
        flag 2 (0x3L): resumeClickListener
        flag 3 (0x4L): transferClickListener
        flag 4 (0x5L): hideResume
        flag 5 (0x6L): hideAccept
        flag 6 (0x7L): pauseClickListener
        flag 7 (0x8L): hidePause
        flag 8 (0x9L): hideTransfer
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(hidePause) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(hidePause) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(hideResume) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(hideResume) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(hideAccept) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(hideAccept) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(hideTransfer) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(hideTransfer) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}