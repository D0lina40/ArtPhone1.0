package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomMenuBindingImpl extends ChatRoomMenuBinding  {

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

    public ChatRoomMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ChatRoomMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100000L;
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
        if (BR.goToContactListener == variableId) {
            setGoToContactListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.muteListener == variableId) {
            setMuteListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.addToContactsHidden == variableId) {
            setAddToContactsHidden((java.lang.Boolean) variable);
        }
        else if (BR.groupInfoHidden == variableId) {
            setGroupInfoHidden((java.lang.Boolean) variable);
        }
        else if (BR.meetingListener == variableId) {
            setMeetingListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.meetingHidden == variableId) {
            setMeetingHidden((java.lang.Boolean) variable);
        }
        else if (BR.devicesHidden == variableId) {
            setDevicesHidden((java.lang.Boolean) variable);
        }
        else if (BR.groupInfoListener == variableId) {
            setGroupInfoListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.devicesListener == variableId) {
            setDevicesListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.ephemeralEnabled == variableId) {
            setEphemeralEnabled((java.lang.Boolean) variable);
        }
        else if (BR.goToContactHidden == variableId) {
            setGoToContactHidden((java.lang.Boolean) variable);
        }
        else if (BR.meetingEnabled == variableId) {
            setMeetingEnabled((java.lang.Boolean) variable);
        }
        else if (BR.ephemeralListener == variableId) {
            setEphemeralListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.editionModeListener == variableId) {
            setEditionModeListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.devicesEnabled == variableId) {
            setDevicesEnabled((java.lang.Boolean) variable);
        }
        else if (BR.muteHidden == variableId) {
            setMuteHidden((java.lang.Boolean) variable);
        }
        else if (BR.unmuteListener == variableId) {
            setUnmuteListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.addToContactsListener == variableId) {
            setAddToContactsListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.ephemeralHidden == variableId) {
            setEphemeralHidden((java.lang.Boolean) variable);
        }
        else if (BR.unmuteHidden == variableId) {
            setUnmuteHidden((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGoToContactListener(@Nullable android.view.View.OnClickListener GoToContactListener) {
        this.mGoToContactListener = GoToContactListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.goToContactListener);
        super.requestRebind();
    }
    public void setMuteListener(@Nullable android.view.View.OnClickListener MuteListener) {
        this.mMuteListener = MuteListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.muteListener);
        super.requestRebind();
    }
    public void setAddToContactsHidden(@Nullable java.lang.Boolean AddToContactsHidden) {
        this.mAddToContactsHidden = AddToContactsHidden;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.addToContactsHidden);
        super.requestRebind();
    }
    public void setGroupInfoHidden(@Nullable java.lang.Boolean GroupInfoHidden) {
        this.mGroupInfoHidden = GroupInfoHidden;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.groupInfoHidden);
        super.requestRebind();
    }
    public void setMeetingListener(@Nullable android.view.View.OnClickListener MeetingListener) {
        this.mMeetingListener = MeetingListener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.meetingListener);
        super.requestRebind();
    }
    public void setMeetingHidden(@Nullable java.lang.Boolean MeetingHidden) {
        this.mMeetingHidden = MeetingHidden;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.meetingHidden);
        super.requestRebind();
    }
    public void setDevicesHidden(@Nullable java.lang.Boolean DevicesHidden) {
        this.mDevicesHidden = DevicesHidden;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.devicesHidden);
        super.requestRebind();
    }
    public void setGroupInfoListener(@Nullable android.view.View.OnClickListener GroupInfoListener) {
        this.mGroupInfoListener = GroupInfoListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.groupInfoListener);
        super.requestRebind();
    }
    public void setDevicesListener(@Nullable android.view.View.OnClickListener DevicesListener) {
        this.mDevicesListener = DevicesListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.devicesListener);
        super.requestRebind();
    }
    public void setEphemeralEnabled(@Nullable java.lang.Boolean EphemeralEnabled) {
        this.mEphemeralEnabled = EphemeralEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.ephemeralEnabled);
        super.requestRebind();
    }
    public void setGoToContactHidden(@Nullable java.lang.Boolean GoToContactHidden) {
        this.mGoToContactHidden = GoToContactHidden;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.goToContactHidden);
        super.requestRebind();
    }
    public void setMeetingEnabled(@Nullable java.lang.Boolean MeetingEnabled) {
        this.mMeetingEnabled = MeetingEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.meetingEnabled);
        super.requestRebind();
    }
    public void setEphemeralListener(@Nullable android.view.View.OnClickListener EphemeralListener) {
        this.mEphemeralListener = EphemeralListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.ephemeralListener);
        super.requestRebind();
    }
    public void setEditionModeListener(@Nullable android.view.View.OnClickListener EditionModeListener) {
        this.mEditionModeListener = EditionModeListener;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.editionModeListener);
        super.requestRebind();
    }
    public void setDevicesEnabled(@Nullable java.lang.Boolean DevicesEnabled) {
        this.mDevicesEnabled = DevicesEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.devicesEnabled);
        super.requestRebind();
    }
    public void setMuteHidden(@Nullable java.lang.Boolean MuteHidden) {
        this.mMuteHidden = MuteHidden;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.muteHidden);
        super.requestRebind();
    }
    public void setUnmuteListener(@Nullable android.view.View.OnClickListener UnmuteListener) {
        this.mUnmuteListener = UnmuteListener;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.unmuteListener);
        super.requestRebind();
    }
    public void setAddToContactsListener(@Nullable android.view.View.OnClickListener AddToContactsListener) {
        this.mAddToContactsListener = AddToContactsListener;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.addToContactsListener);
        super.requestRebind();
    }
    public void setEphemeralHidden(@Nullable java.lang.Boolean EphemeralHidden) {
        this.mEphemeralHidden = EphemeralHidden;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.ephemeralHidden);
        super.requestRebind();
    }
    public void setUnmuteHidden(@Nullable java.lang.Boolean UnmuteHidden) {
        this.mUnmuteHidden = UnmuteHidden;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.unmuteHidden);
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
        android.view.View.OnClickListener goToContactListener = mGoToContactListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxMeetingEnabled = false;
        android.view.View.OnClickListener muteListener = mMuteListener;
        java.lang.Boolean addToContactsHidden = mAddToContactsHidden;
        int groupInfoHiddenViewGONEViewVISIBLE = 0;
        int ephemeralHiddenViewGONEViewVISIBLE = 0;
        java.lang.Boolean groupInfoHidden = mGroupInfoHidden;
        int goToContactHiddenViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener meetingListener = mMeetingListener;
        java.lang.Boolean meetingHidden = mMeetingHidden;
        int muteHiddenViewGONEViewVISIBLE = 0;
        java.lang.Boolean devicesHidden = mDevicesHidden;
        android.view.View.OnClickListener groupInfoListener = mGroupInfoListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxEphemeralEnabled = false;
        int addToContactsHiddenViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxEphemeralHidden = false;
        int unmuteHiddenViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxMeetingHidden = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxGoToContactHidden = false;
        int meetingHiddenViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxUnmuteHidden = false;
        android.view.View.OnClickListener devicesListener = mDevicesListener;
        java.lang.Boolean ephemeralEnabled = mEphemeralEnabled;
        java.lang.Boolean goToContactHidden = mGoToContactHidden;
        java.lang.Boolean meetingEnabled = mMeetingEnabled;
        boolean androidxDatabindingViewDataBindingSafeUnboxMuteHidden = false;
        android.view.View.OnClickListener ephemeralListener = mEphemeralListener;
        android.view.View.OnClickListener editionModeListener = mEditionModeListener;
        java.lang.Boolean devicesEnabled = mDevicesEnabled;
        boolean androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden = false;
        java.lang.Boolean muteHidden = mMuteHidden;
        boolean androidxDatabindingViewDataBindingSafeUnboxDevicesHidden = false;
        android.view.View.OnClickListener unmuteListener = mUnmuteListener;
        android.view.View.OnClickListener addToContactsListener = mAddToContactsListener;
        java.lang.Boolean ephemeralHidden = mEphemeralHidden;
        boolean androidxDatabindingViewDataBindingSafeUnboxGroupInfoHidden = false;
        java.lang.Boolean unmuteHidden = mUnmuteHidden;
        boolean androidxDatabindingViewDataBindingSafeUnboxDevicesEnabled = false;
        int devicesHiddenViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x100001L) != 0) {
        }
        if ((dirtyFlags & 0x100002L) != 0) {
        }
        if ((dirtyFlags & 0x100004L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden)
                androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden = androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden);
            if((dirtyFlags & 0x100004L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden) {
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden) ? View.GONE : View.VISIBLE
                addToContactsHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxAddToContactsHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x100008L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(groupInfoHidden)
                androidxDatabindingViewDataBindingSafeUnboxGroupInfoHidden = androidx.databinding.ViewDataBinding.safeUnbox(groupInfoHidden);
            if((dirtyFlags & 0x100008L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxGroupInfoHidden) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(groupInfoHidden) ? View.GONE : View.VISIBLE
                groupInfoHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxGroupInfoHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x100010L) != 0) {
        }
        if ((dirtyFlags & 0x100020L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(meetingHidden)
                androidxDatabindingViewDataBindingSafeUnboxMeetingHidden = androidx.databinding.ViewDataBinding.safeUnbox(meetingHidden);
            if((dirtyFlags & 0x100020L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxMeetingHidden) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(meetingHidden) ? View.GONE : View.VISIBLE
                meetingHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxMeetingHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x100040L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(devicesHidden)
                androidxDatabindingViewDataBindingSafeUnboxDevicesHidden = androidx.databinding.ViewDataBinding.safeUnbox(devicesHidden);
            if((dirtyFlags & 0x100040L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDevicesHidden) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(devicesHidden) ? View.GONE : View.VISIBLE
                devicesHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDevicesHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x100080L) != 0) {
        }
        if ((dirtyFlags & 0x100100L) != 0) {
        }
        if ((dirtyFlags & 0x100200L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ephemeralEnabled)
                androidxDatabindingViewDataBindingSafeUnboxEphemeralEnabled = androidx.databinding.ViewDataBinding.safeUnbox(ephemeralEnabled);
        }
        if ((dirtyFlags & 0x100400L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(goToContactHidden)
                androidxDatabindingViewDataBindingSafeUnboxGoToContactHidden = androidx.databinding.ViewDataBinding.safeUnbox(goToContactHidden);
            if((dirtyFlags & 0x100400L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxGoToContactHidden) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(goToContactHidden) ? View.GONE : View.VISIBLE
                goToContactHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxGoToContactHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x100800L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(meetingEnabled)
                androidxDatabindingViewDataBindingSafeUnboxMeetingEnabled = androidx.databinding.ViewDataBinding.safeUnbox(meetingEnabled);
        }
        if ((dirtyFlags & 0x101000L) != 0) {
        }
        if ((dirtyFlags & 0x102000L) != 0) {
        }
        if ((dirtyFlags & 0x104000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(devicesEnabled)
                androidxDatabindingViewDataBindingSafeUnboxDevicesEnabled = androidx.databinding.ViewDataBinding.safeUnbox(devicesEnabled);
        }
        if ((dirtyFlags & 0x108000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(muteHidden)
                androidxDatabindingViewDataBindingSafeUnboxMuteHidden = androidx.databinding.ViewDataBinding.safeUnbox(muteHidden);
            if((dirtyFlags & 0x108000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxMuteHidden) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(muteHidden) ? View.GONE : View.VISIBLE
                muteHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxMuteHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x110000L) != 0) {
        }
        if ((dirtyFlags & 0x120000L) != 0) {
        }
        if ((dirtyFlags & 0x140000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ephemeralHidden)
                androidxDatabindingViewDataBindingSafeUnboxEphemeralHidden = androidx.databinding.ViewDataBinding.safeUnbox(ephemeralHidden);
            if((dirtyFlags & 0x140000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxEphemeralHidden) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ephemeralHidden) ? View.GONE : View.VISIBLE
                ephemeralHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxEphemeralHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x180000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(unmuteHidden)
                androidxDatabindingViewDataBindingSafeUnboxUnmuteHidden = androidx.databinding.ViewDataBinding.safeUnbox(unmuteHidden);
            if((dirtyFlags & 0x180000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxUnmuteHidden) {
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(unmuteHidden) ? View.GONE : View.VISIBLE
                unmuteHiddenViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxUnmuteHidden) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x100004L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(addToContactsHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x120000L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(addToContactsListener);
        }
        if ((dirtyFlags & 0x100400L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(goToContactHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x100001L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(goToContactListener);
        }
        if ((dirtyFlags & 0x100008L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(groupInfoHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x100080L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(groupInfoListener);
        }
        if ((dirtyFlags & 0x100040L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(devicesHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x100100L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(devicesListener);
        }
        if ((dirtyFlags & 0x104000L) != 0) {
            // api target 1

            this.mboundView4.setEnabled(androidxDatabindingViewDataBindingSafeUnboxDevicesEnabled);
        }
        if ((dirtyFlags & 0x140000L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(ephemeralHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x101000L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(ephemeralListener);
        }
        if ((dirtyFlags & 0x100200L) != 0) {
            // api target 1

            this.mboundView5.setEnabled(androidxDatabindingViewDataBindingSafeUnboxEphemeralEnabled);
        }
        if ((dirtyFlags & 0x100020L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(meetingHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x100010L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(meetingListener);
        }
        if ((dirtyFlags & 0x100800L) != 0) {
            // api target 1

            this.mboundView6.setEnabled(androidxDatabindingViewDataBindingSafeUnboxMeetingEnabled);
        }
        if ((dirtyFlags & 0x108000L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(muteHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x100002L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(muteListener);
        }
        if ((dirtyFlags & 0x180000L) != 0) {
            // api target 1

            this.mboundView8.setVisibility(unmuteHiddenViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x110000L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(unmuteListener);
        }
        if ((dirtyFlags & 0x102000L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(editionModeListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): goToContactListener
        flag 1 (0x2L): muteListener
        flag 2 (0x3L): addToContactsHidden
        flag 3 (0x4L): groupInfoHidden
        flag 4 (0x5L): meetingListener
        flag 5 (0x6L): meetingHidden
        flag 6 (0x7L): devicesHidden
        flag 7 (0x8L): groupInfoListener
        flag 8 (0x9L): devicesListener
        flag 9 (0xaL): ephemeralEnabled
        flag 10 (0xbL): goToContactHidden
        flag 11 (0xcL): meetingEnabled
        flag 12 (0xdL): ephemeralListener
        flag 13 (0xeL): editionModeListener
        flag 14 (0xfL): devicesEnabled
        flag 15 (0x10L): muteHidden
        flag 16 (0x11L): unmuteListener
        flag 17 (0x12L): addToContactsListener
        flag 18 (0x13L): ephemeralHidden
        flag 19 (0x14L): unmuteHidden
        flag 20 (0x15L): null
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(groupInfoHidden) ? View.GONE : View.VISIBLE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(groupInfoHidden) ? View.GONE : View.VISIBLE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(ephemeralHidden) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(ephemeralHidden) ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(goToContactHidden) ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(goToContactHidden) ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(muteHidden) ? View.GONE : View.VISIBLE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(muteHidden) ? View.GONE : View.VISIBLE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden) ? View.GONE : View.VISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(addToContactsHidden) ? View.GONE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(unmuteHidden) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(unmuteHidden) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(meetingHidden) ? View.GONE : View.VISIBLE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(meetingHidden) ? View.GONE : View.VISIBLE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(devicesHidden) ? View.GONE : View.VISIBLE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(devicesHidden) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}