package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageLongPressMenuBindingImpl extends ChatMessageLongPressMenuBinding  {

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
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageLongPressMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ChatMessageLongPressMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.laughing.setTag(null);
        this.love.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.surprised.setTag(null);
        this.tear.setTag(null);
        this.thumbsUp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
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
        if (BR.replyClickListener == variableId) {
            setReplyClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.replyHidden == variableId) {
            setReplyHidden((java.lang.Boolean) variable);
        }
        else if (BR.cryingSelected == variableId) {
            setCryingSelected((java.lang.Boolean) variable);
        }
        else if (BR.deleteClickListener == variableId) {
            setDeleteClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.laughingSelected == variableId) {
            setLaughingSelected((java.lang.Boolean) variable);
        }
        else if (BR.emojiClickListener == variableId) {
            setEmojiClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.forwardHidden == variableId) {
            setForwardHidden((java.lang.Boolean) variable);
        }
        else if (BR.thumbsUpSelected == variableId) {
            setThumbsUpSelected((java.lang.Boolean) variable);
        }
        else if (BR.resendHidden == variableId) {
            setResendHidden((java.lang.Boolean) variable);
        }
        else if (BR.resendClickListener == variableId) {
            setResendClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.heartSelected == variableId) {
            setHeartSelected((java.lang.Boolean) variable);
        }
        else if (BR.addToContactsClickListener == variableId) {
            setAddToContactsClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.addToContactsHidden == variableId) {
            setAddToContactsHidden((java.lang.Boolean) variable);
        }
        else if (BR.forwardClickListener == variableId) {
            setForwardClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.copyTextHidden == variableId) {
            setCopyTextHidden((java.lang.Boolean) variable);
        }
        else if (BR.surprisedSelected == variableId) {
            setSurprisedSelected((java.lang.Boolean) variable);
        }
        else if (BR.imdnClickListener == variableId) {
            setImdnClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.copyTextClickListener == variableId) {
            setCopyTextClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.imdnHidden == variableId) {
            setImdnHidden((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReplyClickListener(@Nullable android.view.View.OnClickListener ReplyClickListener) {
        this.mReplyClickListener = ReplyClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.replyClickListener);
        super.requestRebind();
    }
    public void setReplyHidden(@Nullable java.lang.Boolean ReplyHidden) {
        this.mReplyHidden = ReplyHidden;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.replyHidden);
        super.requestRebind();
    }
    public void setCryingSelected(@Nullable java.lang.Boolean CryingSelected) {
        this.mCryingSelected = CryingSelected;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.cryingSelected);
        super.requestRebind();
    }
    public void setDeleteClickListener(@Nullable android.view.View.OnClickListener DeleteClickListener) {
        this.mDeleteClickListener = DeleteClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.deleteClickListener);
        super.requestRebind();
    }
    public void setLaughingSelected(@Nullable java.lang.Boolean LaughingSelected) {
        this.mLaughingSelected = LaughingSelected;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.laughingSelected);
        super.requestRebind();
    }
    public void setEmojiClickListener(@Nullable android.view.View.OnClickListener EmojiClickListener) {
        this.mEmojiClickListener = EmojiClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.emojiClickListener);
        super.requestRebind();
    }
    public void setForwardHidden(@Nullable java.lang.Boolean ForwardHidden) {
        this.mForwardHidden = ForwardHidden;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.forwardHidden);
        super.requestRebind();
    }
    public void setThumbsUpSelected(@Nullable java.lang.Boolean ThumbsUpSelected) {
        this.mThumbsUpSelected = ThumbsUpSelected;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.thumbsUpSelected);
        super.requestRebind();
    }
    public void setResendHidden(@Nullable java.lang.Boolean ResendHidden) {
        this.mResendHidden = ResendHidden;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.resendHidden);
        super.requestRebind();
    }
    public void setResendClickListener(@Nullable android.view.View.OnClickListener ResendClickListener) {
        this.mResendClickListener = ResendClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.resendClickListener);
        super.requestRebind();
    }
    public void setHeartSelected(@Nullable java.lang.Boolean HeartSelected) {
        this.mHeartSelected = HeartSelected;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.heartSelected);
        super.requestRebind();
    }
    public void setAddToContactsClickListener(@Nullable android.view.View.OnClickListener AddToContactsClickListener) {
        this.mAddToContactsClickListener = AddToContactsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.addToContactsClickListener);
        super.requestRebind();
    }
    public void setAddToContactsHidden(@Nullable java.lang.Boolean AddToContactsHidden) {
        this.mAddToContactsHidden = AddToContactsHidden;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.addToContactsHidden);
        super.requestRebind();
    }
    public void setForwardClickListener(@Nullable android.view.View.OnClickListener ForwardClickListener) {
        this.mForwardClickListener = ForwardClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.forwardClickListener);
        super.requestRebind();
    }
    public void setCopyTextHidden(@Nullable java.lang.Boolean CopyTextHidden) {
        this.mCopyTextHidden = CopyTextHidden;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.copyTextHidden);
        super.requestRebind();
    }
    public void setSurprisedSelected(@Nullable java.lang.Boolean SurprisedSelected) {
        this.mSurprisedSelected = SurprisedSelected;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.surprisedSelected);
        super.requestRebind();
    }
    public void setImdnClickListener(@Nullable android.view.View.OnClickListener ImdnClickListener) {
        this.mImdnClickListener = ImdnClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.imdnClickListener);
        super.requestRebind();
    }
    public void setCopyTextClickListener(@Nullable android.view.View.OnClickListener CopyTextClickListener) {
        this.mCopyTextClickListener = CopyTextClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.copyTextClickListener);
        super.requestRebind();
    }
    public void setImdnHidden(@Nullable java.lang.Boolean ImdnHidden) {
        this.mImdnHidden = ImdnHidden;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.imdnHidden);
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
        android.view.View.OnClickListener replyClickListener = mReplyClickListener;
        java.lang.Boolean replyHidden = mReplyHidden;
        java.lang.Boolean cryingSelected = mCryingSelected;
        android.view.View.OnClickListener deleteClickListener = mDeleteClickListener;
        android.graphics.drawable.Drawable cryingSelectedTearAndroidDrawableShapeOwnReactionBackgroundTearAndroidDrawableShapeTransparentReactionBackground = null;
        int addToContactsHiddenViewGONEViewVISIBLE = 0;
        java.lang.Boolean laughingSelected = mLaughingSelected;
        android.view.View.OnClickListener emojiClickListener = mEmojiClickListener;
        int copyTextHiddenViewGONEViewVISIBLE = 0;
        java.lang.Boolean forwardHidden = mForwardHidden;
        java.lang.Boolean thumbsUpSelected = mThumbsUpSelected;
        boolean androidxDatabindingViewDataBindingSafeUnboxHeartSelected = false;
        java.lang.Boolean resendHidden = mResendHidden;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxImdnHidden = false;
        android.graphics.drawable.Drawable thumbsUpSelectedThumbsUpAndroidDrawableShapeOwnReactionBackgroundThumbsUpAndroidDrawableShapeTransparentReactionBackground = null;
        android.view.View.OnClickListener resendClickListener = mResendClickListener;
        android.graphics.drawable.Drawable heartSelectedLoveAndroidDrawableShapeOwnReactionBackgroundLoveAndroidDrawableShapeTransparentReactionBackground = null;
        java.lang.Boolean heartSelected = mHeartSelected;
        boolean androidxDatabindingViewDataBindingSafeUnboxSurprisedSelected = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxLaughingSelected = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxCryingSelected = false;
        android.view.View.OnClickListener addToContactsClickListener = mAddToContactsClickListener;
        java.lang.Boolean addToContactsHidden = mAddToContactsHidden;
        boolean androidxDatabindingViewDataBindingSafeUnboxForwardHidden = false;
        int replyHiddenViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener forwardClickListener = mForwardClickListener;
        int imdnHiddenViewGONEViewVISIBLE = 0;
        android.graphics.drawable.Drawable laughingSelectedLaughingAndroidDrawableShapeOwnReactionBackgroundLaughingAndroidDrawableShapeTransparentReactionBackground = null;
        java.lang.Boolean copyTextHidden = mCopyTextHidden;
        android.graphics.drawable.Drawable surprisedSelectedSurprisedAndroidDrawableShapeOwnReactionBackgroundSurprisedAndroidDrawableShapeTransparentReactionBackground = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxReplyHidden = false;
        java.lang.Boolean surprisedSelected = mSurprisedSelected;
        int resendHiddenViewGONEViewVISIBLE = 0;
        int forwardHiddenViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxResendHidden = false;
        android.view.View.OnClickListener imdnClickListener = mImdnClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxCopyTextHidden = false;
        android.view.View.OnClickListener copyTextClickListener = mCopyTextClickListener;
        java.lang.Boolean imdnHidden = mImdnHidden;
        boolean androidxDatabindingViewDataBindingSafeUnboxThumbsUpSelected = false;

        if ((dirtyFlags & 0x80001L) != 0) {
        }
        if ((dirtyFlags & 0x80002L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(replyHidden)
                androidxDatabindingViewDataBindingSafeUnboxReplyHidden = androidx.databinding.ViewDataBinding.safeUnbox(replyHidden);
            if((dirtyFlags & 0x80002L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxReplyHidden) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(replyHidden) ? View.GONE : View.VISIBLE
                replyHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxReplyHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x80004L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(cryingSelected)
                androidxDatabindingViewDataBindingSafeUnboxCryingSelected = androidx.databinding.ViewDataBinding.safeUnbox(cryingSelected);
            if((dirtyFlags & 0x80004L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxCryingSelected) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(cryingSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
                cryingSelectedTearAndroidDrawableShapeOwnReactionBackgroundTearAndroidDrawableShapeTransparentReactionBackground = ((androidxDatabindingViewDataBindingSafeUnboxCryingSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tear.getContext(), R.drawable.shape_own_reaction_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tear.getContext(), R.drawable.shape_transparent_reaction_background)));
        }
        if ((dirtyFlags & 0x80008L) != 0) {
        }
        if ((dirtyFlags & 0x80010L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(laughingSelected)
                androidxDatabindingViewDataBindingSafeUnboxLaughingSelected = androidx.databinding.ViewDataBinding.safeUnbox(laughingSelected);
            if((dirtyFlags & 0x80010L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxLaughingSelected) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(laughingSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
                laughingSelectedLaughingAndroidDrawableShapeOwnReactionBackgroundLaughingAndroidDrawableShapeTransparentReactionBackground = ((androidxDatabindingViewDataBindingSafeUnboxLaughingSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(laughing.getContext(), R.drawable.shape_own_reaction_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(laughing.getContext(), R.drawable.shape_transparent_reaction_background)));
        }
        if ((dirtyFlags & 0x80020L) != 0) {
        }
        if ((dirtyFlags & 0x80040L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(forwardHidden)
                androidxDatabindingViewDataBindingSafeUnboxForwardHidden = androidx.databinding.ViewDataBinding.safeUnbox(forwardHidden);
            if((dirtyFlags & 0x80040L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxForwardHidden) {
                        dirtyFlags |= 0x20000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(forwardHidden) ? View.GONE : View.VISIBLE
                forwardHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxForwardHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x80080L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(thumbsUpSelected)
                androidxDatabindingViewDataBindingSafeUnboxThumbsUpSelected = androidx.databinding.ViewDataBinding.safeUnbox(thumbsUpSelected);
            if((dirtyFlags & 0x80080L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxThumbsUpSelected) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(thumbsUpSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
                thumbsUpSelectedThumbsUpAndroidDrawableShapeOwnReactionBackgroundThumbsUpAndroidDrawableShapeTransparentReactionBackground = ((androidxDatabindingViewDataBindingSafeUnboxThumbsUpSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(thumbsUp.getContext(), R.drawable.shape_own_reaction_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(thumbsUp.getContext(), R.drawable.shape_transparent_reaction_background)));
        }
        if ((dirtyFlags & 0x80100L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(resendHidden)
                androidxDatabindingViewDataBindingSafeUnboxResendHidden = androidx.databinding.ViewDataBinding.safeUnbox(resendHidden);
            if((dirtyFlags & 0x80100L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxResendHidden) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(resendHidden) ? View.GONE : View.VISIBLE
                resendHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxResendHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x80200L) != 0) {
        }
        if ((dirtyFlags & 0x80400L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(heartSelected)
                androidxDatabindingViewDataBindingSafeUnboxHeartSelected = androidx.databinding.ViewDataBinding.safeUnbox(heartSelected);
            if((dirtyFlags & 0x80400L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxHeartSelected) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(heartSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
                heartSelectedLoveAndroidDrawableShapeOwnReactionBackgroundLoveAndroidDrawableShapeTransparentReactionBackground = ((androidxDatabindingViewDataBindingSafeUnboxHeartSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(love.getContext(), R.drawable.shape_own_reaction_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(love.getContext(), R.drawable.shape_transparent_reaction_background)));
        }
        if ((dirtyFlags & 0x80800L) != 0) {
        }
        if ((dirtyFlags & 0x81000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden)
                androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden = androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden);
            if((dirtyFlags & 0x81000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden) ? View.GONE : View.VISIBLE
                addToContactsHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x82000L) != 0) {
        }
        if ((dirtyFlags & 0x84000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(copyTextHidden)
                androidxDatabindingViewDataBindingSafeUnboxCopyTextHidden = androidx.databinding.ViewDataBinding.safeUnbox(copyTextHidden);
            if((dirtyFlags & 0x84000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxCopyTextHidden) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(copyTextHidden) ? View.GONE : View.VISIBLE
                copyTextHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxCopyTextHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x88000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(surprisedSelected)
                androidxDatabindingViewDataBindingSafeUnboxSurprisedSelected = androidx.databinding.ViewDataBinding.safeUnbox(surprisedSelected);
            if((dirtyFlags & 0x88000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSurprisedSelected) {
                        dirtyFlags |= 0x2000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(surprisedSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
                surprisedSelectedSurprisedAndroidDrawableShapeOwnReactionBackgroundSurprisedAndroidDrawableShapeTransparentReactionBackground = ((androidxDatabindingViewDataBindingSafeUnboxSurprisedSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(surprised.getContext(), R.drawable.shape_own_reaction_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(surprised.getContext(), R.drawable.shape_transparent_reaction_background)));
        }
        if ((dirtyFlags & 0x90000L) != 0) {
        }
        if ((dirtyFlags & 0xa0000L) != 0) {
        }
        if ((dirtyFlags & 0xc0000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(imdnHidden)
                androidxDatabindingViewDataBindingSafeUnboxImdnHidden = androidx.databinding.ViewDataBinding.safeUnbox(imdnHidden);
            if((dirtyFlags & 0xc0000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxImdnHidden) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(imdnHidden) ? View.GONE : View.VISIBLE
                imdnHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxImdnHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x80020L) != 0) {
            // api target 1

            this.laughing.setOnClickListener(emojiClickListener);
            this.love.setOnClickListener(emojiClickListener);
            this.surprised.setOnClickListener(emojiClickListener);
            this.tear.setOnClickListener(emojiClickListener);
            this.thumbsUp.setOnClickListener(emojiClickListener);
        }
        if ((dirtyFlags & 0x80010L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.laughing, laughingSelectedLaughingAndroidDrawableShapeOwnReactionBackgroundLaughingAndroidDrawableShapeTransparentReactionBackground);
        }
        if ((dirtyFlags & 0x80400L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.love, heartSelectedLoveAndroidDrawableShapeOwnReactionBackgroundLoveAndroidDrawableShapeTransparentReactionBackground);
        }
        if ((dirtyFlags & 0xc0000L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(imdnHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x90000L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(imdnClickListener);
        }
        if ((dirtyFlags & 0x81000L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(addToContactsHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x80800L) != 0) {
            // api target 1

            this.mboundView11.setOnClickListener(addToContactsClickListener);
        }
        if ((dirtyFlags & 0x80008L) != 0) {
            // api target 1

            this.mboundView12.setOnClickListener(deleteClickListener);
        }
        if ((dirtyFlags & 0x80100L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(resendHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x80200L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(resendClickListener);
        }
        if ((dirtyFlags & 0x84000L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(copyTextHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xa0000L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(copyTextClickListener);
        }
        if ((dirtyFlags & 0x82000L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(forwardClickListener);
        }
        if ((dirtyFlags & 0x80040L) != 0) {
            // api target 1

            this.mboundView8.setVisibility(forwardHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x80001L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(replyClickListener);
        }
        if ((dirtyFlags & 0x80002L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(replyHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x88000L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.surprised, surprisedSelectedSurprisedAndroidDrawableShapeOwnReactionBackgroundSurprisedAndroidDrawableShapeTransparentReactionBackground);
        }
        if ((dirtyFlags & 0x80004L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tear, cryingSelectedTearAndroidDrawableShapeOwnReactionBackgroundTearAndroidDrawableShapeTransparentReactionBackground);
        }
        if ((dirtyFlags & 0x80080L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.thumbsUp, thumbsUpSelectedThumbsUpAndroidDrawableShapeOwnReactionBackgroundThumbsUpAndroidDrawableShapeTransparentReactionBackground);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): replyClickListener
        flag 1 (0x2L): replyHidden
        flag 2 (0x3L): cryingSelected
        flag 3 (0x4L): deleteClickListener
        flag 4 (0x5L): laughingSelected
        flag 5 (0x6L): emojiClickListener
        flag 6 (0x7L): forwardHidden
        flag 7 (0x8L): thumbsUpSelected
        flag 8 (0x9L): resendHidden
        flag 9 (0xaL): resendClickListener
        flag 10 (0xbL): heartSelected
        flag 11 (0xcL): addToContactsClickListener
        flag 12 (0xdL): addToContactsHidden
        flag 13 (0xeL): forwardClickListener
        flag 14 (0xfL): copyTextHidden
        flag 15 (0x10L): surprisedSelected
        flag 16 (0x11L): imdnClickListener
        flag 17 (0x12L): copyTextClickListener
        flag 18 (0x13L): imdnHidden
        flag 19 (0x14L): null
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(cryingSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(cryingSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden) ? View.GONE : View.VISIBLE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(copyTextHidden) ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(copyTextHidden) ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(thumbsUpSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(thumbsUpSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(heartSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(heartSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(replyHidden) ? View.GONE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(replyHidden) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(imdnHidden) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(imdnHidden) ? View.GONE : View.VISIBLE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(laughingSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(laughingSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(surprisedSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(surprisedSelected) ? @android:drawable/shape_own_reaction_background : @android:drawable/shape_transparent_reaction_background
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(resendHidden) ? View.GONE : View.VISIBLE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(resendHidden) ? View.GONE : View.VISIBLE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(forwardHidden) ? View.GONE : View.VISIBLE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(forwardHidden) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}