package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConferenceSchedulingFragmentBindingImpl extends ConferenceSchedulingFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.back, 19);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.Spinner mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.Spinner mboundView12;
    @NonNull
    private final android.widget.EditText mboundView13;
    @NonNull
    private final com.google.android.material.checkbox.MaterialCheckBox mboundView14;
    @NonNull
    private final com.google.android.material.checkbox.MaterialCheckBox mboundView15;
    @NonNull
    private final android.widget.ImageView mboundView16;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView17;
    @NonNull
    private final android.widget.ImageView mboundView18;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.Spinner mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    @Nullable
    private final android.view.View.OnClickListener mCallback99;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView10selectedValueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.duration.getValue()
            //         is viewModel.duration.setValue((org.linphone.activities.main.conference.data.Duration) callbackArg_0)
            java.lang.Object callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getSelectedValue(mboundView10);
            // localize variables for thread safety
            // viewModel.duration.getValue()
            org.linphone.activities.main.conference.data.Duration viewModelDurationGetValue = null;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel.duration
            androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> viewModelDuration = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.duration != null
            boolean viewModelDurationJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDuration = viewModel.getDuration();

                viewModelDurationJavaLangObjectNull = (viewModelDuration) != (null);
                if (viewModelDurationJavaLangObjectNull) {




                    viewModelDuration.setValue(((org.linphone.activities.main.conference.data.Duration) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView12selectedValueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.timeZone.getValue()
            //         is viewModel.timeZone.setValue((org.linphone.activities.main.conference.data.TimeZoneData) callbackArg_0)
            java.lang.Object callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getSelectedValue(mboundView12);
            // localize variables for thread safety
            // viewModel.timeZone != null
            boolean viewModelTimeZoneJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel.timeZone.getValue()
            org.linphone.activities.main.conference.data.TimeZoneData viewModelTimeZoneGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.timeZone
            androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> viewModelTimeZone = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTimeZone = viewModel.getTimeZone();

                viewModelTimeZoneJavaLangObjectNull = (viewModelTimeZone) != (null);
                if (viewModelTimeZoneJavaLangObjectNull) {




                    viewModelTimeZone.setValue(((org.linphone.activities.main.conference.data.TimeZoneData) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView13androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.description.getValue()
            //         is viewModel.description.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView13);
            // localize variables for thread safety
            // viewModel.description.getValue()
            java.lang.String viewModelDescriptionGetValue = null;
            // viewModel.description != null
            boolean viewModelDescriptionJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel.description
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDescription = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDescription = viewModel.getDescription();

                viewModelDescriptionJavaLangObjectNull = (viewModelDescription) != (null);
                if (viewModelDescriptionJavaLangObjectNull) {




                    viewModelDescription.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView14androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.sendInviteViaChat.getValue()
            //         is viewModel.sendInviteViaChat.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView14.isChecked();
            // localize variables for thread safety
            // viewModel.sendInviteViaChat
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSendInviteViaChat = null;
            // viewModel.sendInviteViaChat != null
            boolean viewModelSendInviteViaChatJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.sendInviteViaChat.getValue()
            java.lang.Boolean viewModelSendInviteViaChatGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSendInviteViaChat = viewModel.getSendInviteViaChat();

                viewModelSendInviteViaChatJavaLangObjectNull = (viewModelSendInviteViaChat) != (null);
                if (viewModelSendInviteViaChatJavaLangObjectNull) {




                    viewModelSendInviteViaChat.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView15androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.sendInviteViaEmail.getValue()
            //         is viewModel.sendInviteViaEmail.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView15.isChecked();
            // localize variables for thread safety
            // viewModel.sendInviteViaEmail
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSendInviteViaEmail = null;
            // viewModel.sendInviteViaEmail.getValue()
            java.lang.Boolean viewModelSendInviteViaEmailGetValue = null;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.sendInviteViaEmail != null
            boolean viewModelSendInviteViaEmailJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSendInviteViaEmail = viewModel.getSendInviteViaEmail();

                viewModelSendInviteViaEmailJavaLangObjectNull = (viewModelSendInviteViaEmail) != (null);
                if (viewModelSendInviteViaEmailJavaLangObjectNull) {




                    viewModelSendInviteViaEmail.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView17androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.isEncrypted.getValue()
            //         is viewModel.isEncrypted.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView17.isChecked();
            // localize variables for thread safety
            // viewModel.isEncrypted
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEncrypted = null;
            // viewModel.isEncrypted.getValue()
            java.lang.Boolean viewModelIsEncryptedGetValue = null;
            // viewModel.isEncrypted != null
            boolean viewModelIsEncryptedJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelIsEncrypted = viewModel.isEncrypted();

                viewModelIsEncryptedJavaLangObjectNull = (viewModelIsEncrypted) != (null);
                if (viewModelIsEncryptedJavaLangObjectNull) {




                    viewModelIsEncrypted.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.subject.getValue()
            //         is viewModel.subject.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.subject.getValue()
            java.lang.String viewModelSubjectGetValue = null;
            // viewModel.subject
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.subject != null
            boolean viewModelSubjectJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSubject = viewModel.getSubject();

                viewModelSubjectJavaLangObjectNull = (viewModelSubject) != (null);
                if (viewModelSubjectJavaLangObjectNull) {




                    viewModelSubject.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.scheduleForLater.getValue()
            //         is viewModel.scheduleForLater.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView4.isChecked();
            // localize variables for thread safety
            // viewModel.scheduleForLater.getValue()
            java.lang.Boolean viewModelScheduleForLaterGetValue = null;
            // viewModel.scheduleForLater
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelScheduleForLater = null;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.scheduleForLater != null
            boolean viewModelScheduleForLaterJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelScheduleForLater = viewModel.getScheduleForLater();

                viewModelScheduleForLaterJavaLangObjectNull = (viewModelScheduleForLater) != (null);
                if (viewModelScheduleForLaterJavaLangObjectNull) {




                    viewModelScheduleForLater.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8selectedValueAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.mode.getValue()
            //         is viewModel.mode.setValue((java.lang.String) callbackArg_0)
            java.lang.Object callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getSelectedValue(mboundView8);
            // localize variables for thread safety
            // viewModel.mode
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelMode = null;
            // viewModel.mode.getValue()
            java.lang.String viewModelModeGetValue = null;
            // viewModel.mode != null
            boolean viewModelModeJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMode = viewModel.getMode();

                viewModelModeJavaLangObjectNull = (viewModelMode) != (null);
                if (viewModelModeJavaLangObjectNull) {




                    viewModelMode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ConferenceSchedulingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ConferenceSchedulingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 14
            , (android.widget.ImageView) bindings[19]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.Spinner) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.Spinner) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.EditText) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (com.google.android.material.checkbox.MaterialCheckBox) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (com.google.android.material.checkbox.MaterialCheckBox) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.ImageView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.ImageView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.Spinner) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback100 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback99 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback98 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
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
        if (BR.timePickerClickListener == variableId) {
            setTimePickerClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.datePickerClickListener == variableId) {
            setDatePickerClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.nextClickListener == variableId) {
            setNextClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTimePickerClickListener(@Nullable android.view.View.OnClickListener TimePickerClickListener) {
        this.mTimePickerClickListener = TimePickerClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.timePickerClickListener);
        super.requestRebind();
    }
    public void setDatePickerClickListener(@Nullable android.view.View.OnClickListener DatePickerClickListener) {
        this.mDatePickerClickListener = DatePickerClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.datePickerClickListener);
        super.requestRebind();
    }
    public void setNextClickListener(@Nullable android.view.View.OnClickListener NextClickListener) {
        this.mNextClickListener = NextClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.nextClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSendInviteViaEmail((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelFormattedDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelDuration((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration>) object, fieldId);
            case 3 :
                return onChangeViewModelFormattedTime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelIsBroadcastAllowed((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelTimeZone((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData>) object, fieldId);
            case 8 :
                return onChangeViewModelIsUpdate((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelMode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelScheduleForLater((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelIsEncrypted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeViewModelSendInviteViaChat((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeViewModelContinueEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSendInviteViaEmail(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSendInviteViaEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFormattedDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFormattedDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDuration(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> ViewModelDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFormattedTime(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFormattedTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDescription(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsBroadcastAllowed(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsBroadcastAllowed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimeZone(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> ViewModelTimeZone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsUpdate(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsUpdate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMode(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelScheduleForLater(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelScheduleForLater, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsEncrypted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEncrypted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSendInviteViaChat(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSendInviteViaChat, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContinueEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelContinueEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
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
        java.lang.Boolean viewModelIsUpdateGetValue = null;
        android.view.View.OnClickListener timePickerClickListener = mTimePickerClickListener;
        java.lang.Boolean viewModelSendInviteViaEmailGetValue = null;
        int viewModelScheduleForLaterViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelContinueEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSendInviteViaEmail = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFormattedDate = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> viewModelDuration = null;
        int viewModelIsBroadcastAllowedViewVISIBLEViewGONE = 0;
        java.lang.String viewModelScheduleForLaterMboundView3AndroidStringConferenceScheduleSubjectHintMboundView3AndroidStringConferenceGroupCallSubjectHint = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFormattedTime = null;
        java.lang.String viewModelDescriptionGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue = false;
        java.util.List<java.lang.String> viewModelModesList = null;
        java.lang.String viewModelFormattedTimeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDescription = null;
        org.linphone.activities.main.conference.data.TimeZoneData viewModelTimeZoneGetValue = null;
        android.view.View.OnClickListener datePickerClickListener = mDatePickerClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsBroadcastAllowed = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> viewModelTimeZone = null;
        java.lang.Boolean viewModelSendInviteViaChatGetValue = null;
        java.lang.String viewModelIsUpdateMboundView1AndroidStringConferenceScheduleEditViewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleTitleMboundView1AndroidStringConferenceGroupCallTitle = null;
        java.lang.String viewModelFormattedDateGetValue = null;
        java.lang.String viewModelIsUpdateMboundView15AndroidStringConferenceScheduleSendUpdatedInviteEmailMboundView15AndroidStringConferenceScheduleSendInviteEmail = null;
        java.lang.Boolean viewModelScheduleForLaterGetValue = null;
        boolean viewModelIsUpdate = false;
        java.util.List<org.linphone.activities.main.conference.data.TimeZoneData> viewModelTimeZones = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsUpdate1 = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelMode = null;
        java.lang.String viewModelModeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelScheduleForLater = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEncrypted = null;
        java.lang.String viewModelSubjectGetValue = null;
        java.util.List<org.linphone.activities.main.conference.data.Duration> viewModelDurationList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSendInviteViaChat = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsBroadcastAllowedGetValue = false;
        java.lang.String viewModelIsUpdateMboundView14AndroidStringConferenceScheduleSendUpdatedInviteChatMboundView14AndroidStringConferenceScheduleSendInviteChat = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdate = false;
        android.view.View.OnClickListener nextClickListener = mNextClickListener;
        org.linphone.activities.main.conference.data.Duration viewModelDurationGetValue = null;
        java.lang.Boolean viewModelIsEncryptedGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaChatGetValue = false;
        java.lang.Boolean viewModelIsBroadcastAllowedGetValue = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelContinueEnabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaEmailGetValue = false;
        org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
        java.lang.String viewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleTitleMboundView1AndroidStringConferenceGroupCallTitle = null;
        java.lang.Boolean viewModelContinueEnabledGetValue = null;

        if ((dirtyFlags & 0x44000L) != 0) {
        }
        if ((dirtyFlags & 0x48000L) != 0) {
        }
        if ((dirtyFlags & 0x50000L) != 0) {
        }
        if ((dirtyFlags & 0x63fffL) != 0) {


            if ((dirtyFlags & 0x60001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sendInviteViaEmail
                        viewModelSendInviteViaEmail = viewModel.getSendInviteViaEmail();
                    }
                    updateLiveDataRegistration(0, viewModelSendInviteViaEmail);


                    if (viewModelSendInviteViaEmail != null) {
                        // read viewModel.sendInviteViaEmail.getValue()
                        viewModelSendInviteViaEmailGetValue = viewModelSendInviteViaEmail.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaEmail.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaEmailGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSendInviteViaEmailGetValue);
            }
            if ((dirtyFlags & 0x60002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.formattedDate
                        viewModelFormattedDate = viewModel.getFormattedDate();
                    }
                    updateLiveDataRegistration(1, viewModelFormattedDate);


                    if (viewModelFormattedDate != null) {
                        // read viewModel.formattedDate.getValue()
                        viewModelFormattedDateGetValue = viewModelFormattedDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x60004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.duration
                        viewModelDuration = viewModel.getDuration();
                    }
                    updateLiveDataRegistration(2, viewModelDuration);


                    if (viewModelDuration != null) {
                        // read viewModel.duration.getValue()
                        viewModelDurationGetValue = viewModelDuration.getValue();
                    }
            }
            if ((dirtyFlags & 0x60008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.formattedTime
                        viewModelFormattedTime = viewModel.getFormattedTime();
                    }
                    updateLiveDataRegistration(3, viewModelFormattedTime);


                    if (viewModelFormattedTime != null) {
                        // read viewModel.formattedTime.getValue()
                        viewModelFormattedTimeGetValue = viewModelFormattedTime.getValue();
                    }
            }
            if ((dirtyFlags & 0x60010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subject
                        viewModelSubject = viewModel.getSubject();
                    }
                    updateLiveDataRegistration(4, viewModelSubject);


                    if (viewModelSubject != null) {
                        // read viewModel.subject.getValue()
                        viewModelSubjectGetValue = viewModelSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x60000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.modesList
                        viewModelModesList = viewModel.getModesList();
                        // read viewModel.timeZones
                        viewModelTimeZones = viewModel.getTimeZones();
                        // read viewModel.durationList
                        viewModelDurationList = viewModel.getDurationList();
                    }
            }
            if ((dirtyFlags & 0x60020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.description
                        viewModelDescription = viewModel.getDescription();
                    }
                    updateLiveDataRegistration(5, viewModelDescription);


                    if (viewModelDescription != null) {
                        // read viewModel.description.getValue()
                        viewModelDescriptionGetValue = viewModelDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0x60040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isBroadcastAllowed
                        viewModelIsBroadcastAllowed = viewModel.isBroadcastAllowed();
                    }
                    updateLiveDataRegistration(6, viewModelIsBroadcastAllowed);


                    if (viewModelIsBroadcastAllowed != null) {
                        // read viewModel.isBroadcastAllowed.getValue()
                        viewModelIsBroadcastAllowedGetValue = viewModelIsBroadcastAllowed.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBroadcastAllowed.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsBroadcastAllowedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsBroadcastAllowedGetValue);
                if((dirtyFlags & 0x60040L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsBroadcastAllowedGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBroadcastAllowed.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsBroadcastAllowedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsBroadcastAllowedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x60080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.timeZone
                        viewModelTimeZone = viewModel.getTimeZone();
                    }
                    updateLiveDataRegistration(7, viewModelTimeZone);


                    if (viewModelTimeZone != null) {
                        // read viewModel.timeZone.getValue()
                        viewModelTimeZoneGetValue = viewModelTimeZone.getValue();
                    }
            }
            if ((dirtyFlags & 0x60500L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isUpdate
                        ViewModelIsUpdate1 = viewModel.isUpdate();
                    }
                    updateLiveDataRegistration(8, ViewModelIsUpdate1);


                    if (ViewModelIsUpdate1 != null) {
                        // read viewModel.isUpdate.getValue()
                        viewModelIsUpdateGetValue = ViewModelIsUpdate1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsUpdateGetValue);
                if((dirtyFlags & 0x60500L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
                if((dirtyFlags & 0x60100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x20000000L;
                    }
                }

                if ((dirtyFlags & 0x60100L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_send_updated_invite_email : @android:string/conference_schedule_send_invite_email
                        viewModelIsUpdateMboundView15AndroidStringConferenceScheduleSendUpdatedInviteEmailMboundView15AndroidStringConferenceScheduleSendInviteEmail = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) ? (mboundView15.getResources().getString(R.string.conference_schedule_send_updated_invite_email)) : (mboundView15.getResources().getString(R.string.conference_schedule_send_invite_email)));
                        // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue())
                        viewModelIsUpdate = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue;
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_send_updated_invite_chat : @android:string/conference_schedule_send_invite_chat
                        viewModelIsUpdateMboundView14AndroidStringConferenceScheduleSendUpdatedInviteChatMboundView14AndroidStringConferenceScheduleSendInviteChat = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) ? (mboundView14.getResources().getString(R.string.conference_schedule_send_updated_invite_chat)) : (mboundView14.getResources().getString(R.string.conference_schedule_send_invite_chat)));


                        // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()))
                        androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdate = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsUpdate);
                }
            }
            if ((dirtyFlags & 0x60200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mode
                        viewModelMode = viewModel.getMode();
                    }
                    updateLiveDataRegistration(9, viewModelMode);


                    if (viewModelMode != null) {
                        // read viewModel.mode.getValue()
                        viewModelModeGetValue = viewModelMode.getValue();
                    }
            }
            if ((dirtyFlags & 0x60400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.scheduleForLater
                        viewModelScheduleForLater = viewModel.getScheduleForLater();
                    }
                    updateLiveDataRegistration(10, viewModelScheduleForLater);


                    if (viewModelScheduleForLater != null) {
                        // read viewModel.scheduleForLater.getValue()
                        viewModelScheduleForLaterGetValue = viewModelScheduleForLater.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelScheduleForLaterGetValue);
                if((dirtyFlags & 0x60400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                }
                if((dirtyFlags & 0x2000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? View.VISIBLE : View.GONE
                    viewModelScheduleForLaterViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_subject_hint : @android:string/conference_group_call_subject_hint
                    viewModelScheduleForLaterMboundView3AndroidStringConferenceScheduleSubjectHintMboundView3AndroidStringConferenceGroupCallSubjectHint = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) ? (mboundView3.getResources().getString(R.string.conference_schedule_subject_hint)) : (mboundView3.getResources().getString(R.string.conference_group_call_subject_hint)));
            }
            if ((dirtyFlags & 0x60800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEncrypted
                        viewModelIsEncrypted = viewModel.isEncrypted();
                    }
                    updateLiveDataRegistration(11, viewModelIsEncrypted);


                    if (viewModelIsEncrypted != null) {
                        // read viewModel.isEncrypted.getValue()
                        viewModelIsEncryptedGetValue = viewModelIsEncrypted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEncrypted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEncryptedGetValue);
            }
            if ((dirtyFlags & 0x61000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sendInviteViaChat
                        viewModelSendInviteViaChat = viewModel.getSendInviteViaChat();
                    }
                    updateLiveDataRegistration(12, viewModelSendInviteViaChat);


                    if (viewModelSendInviteViaChat != null) {
                        // read viewModel.sendInviteViaChat.getValue()
                        viewModelSendInviteViaChatGetValue = viewModelSendInviteViaChat.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaChatGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSendInviteViaChatGetValue);
            }
            if ((dirtyFlags & 0x62000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.continueEnabled
                        viewModelContinueEnabled = viewModel.getContinueEnabled();
                    }
                    updateLiveDataRegistration(13, viewModelContinueEnabled);


                    if (viewModelContinueEnabled != null) {
                        // read viewModel.continueEnabled.getValue()
                        viewModelContinueEnabledGetValue = viewModelContinueEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.continueEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelContinueEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelContinueEnabledGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.scheduleForLater
                    viewModelScheduleForLater = viewModel.getScheduleForLater();
                }
                updateLiveDataRegistration(10, viewModelScheduleForLater);


                if (viewModelScheduleForLater != null) {
                    // read viewModel.scheduleForLater.getValue()
                    viewModelScheduleForLaterGetValue = viewModelScheduleForLater.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelScheduleForLaterGetValue);
            if((dirtyFlags & 0x60400L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                        dirtyFlags |= 0x100000L;
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                        dirtyFlags |= 0x800000L;
                }
            }
            if((dirtyFlags & 0x2000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_title : @android:string/conference_group_call_title
                viewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleTitleMboundView1AndroidStringConferenceGroupCallTitle = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) ? (mboundView1.getResources().getString(R.string.conference_schedule_title)) : (mboundView1.getResources().getString(R.string.conference_group_call_title)));
        }

        if ((dirtyFlags & 0x60500L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_edit : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_title : @android:string/conference_group_call_title
                viewModelIsUpdateMboundView1AndroidStringConferenceScheduleEditViewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleTitleMboundView1AndroidStringConferenceGroupCallTitle = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) ? (mboundView1.getResources().getString(R.string.conference_schedule_edit)) : (viewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleTitleMboundView1AndroidStringConferenceGroupCallTitle));
        }
        // batch finished
        if ((dirtyFlags & 0x60500L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelIsUpdateMboundView1AndroidStringConferenceScheduleEditViewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleTitleMboundView1AndroidStringConferenceGroupCallTitle);
        }
        if ((dirtyFlags & 0x60000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView10, viewModelDurationList);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView12, viewModelTimeZones);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView8, viewModelModesList);
        }
        if ((dirtyFlags & 0x60004L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSelectedValue(this.mboundView10, viewModelDurationGetValue);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setInverseBindingListener(this.mboundView10, mboundView10selectedValueAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.setInverseBindingListener(this.mboundView12, mboundView12selectedValueAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView13, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView13androidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView14, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView14androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView15, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView15androidCheckedAttrChanged);
            this.mboundView16.setOnClickListener(mCallback99);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView17, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView17androidCheckedAttrChanged);
            this.mboundView18.setOnClickListener(mCallback100);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView4, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView4androidCheckedAttrChanged);
            this.mboundView5.setOnClickListener(mCallback98);
            org.linphone.utils.DataBindingUtilsKt.setInverseBindingListener(this.mboundView8, mboundView8selectedValueAttrChanged);
        }
        if ((dirtyFlags & 0x44000L) != 0) {
            // api target 1

            this.mboundView11.setOnClickListener(timePickerClickListener);
        }
        if ((dirtyFlags & 0x60008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelFormattedTimeGetValue);
        }
        if ((dirtyFlags & 0x60080L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSelectedValue(this.mboundView12, viewModelTimeZoneGetValue);
        }
        if ((dirtyFlags & 0x60020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelDescriptionGetValue);
        }
        if ((dirtyFlags & 0x60100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelIsUpdateMboundView14AndroidStringConferenceScheduleSendUpdatedInviteChatMboundView14AndroidStringConferenceScheduleSendInviteChat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, viewModelIsUpdateMboundView15AndroidStringConferenceScheduleSendUpdatedInviteEmailMboundView15AndroidStringConferenceScheduleSendInviteEmail);
            this.mboundView4.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdate);
        }
        if ((dirtyFlags & 0x61000L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView14, androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaChatGetValue);
        }
        if ((dirtyFlags & 0x60001L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView15, androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaEmailGetValue);
        }
        if ((dirtyFlags & 0x60800L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView17, androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue);
        }
        if ((dirtyFlags & 0x50000L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(nextClickListener);
        }
        if ((dirtyFlags & 0x62000L) != 0) {
            // api target 1

            this.mboundView2.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelContinueEnabledGetValue);
        }
        if ((dirtyFlags & 0x60400L) != 0) {
            // api target 1

            this.mboundView3.setHint(viewModelScheduleForLaterMboundView3AndroidStringConferenceScheduleSubjectHintMboundView3AndroidStringConferenceGroupCallSubjectHint);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView4, androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue);
            this.mboundView6.setVisibility(viewModelScheduleForLaterViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelSubjectGetValue);
        }
        if ((dirtyFlags & 0x60040L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(viewModelIsBroadcastAllowedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60200L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSelectedValue(this.mboundView8, viewModelModeGetValue);
        }
        if ((dirtyFlags & 0x48000L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(datePickerClickListener);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelFormattedDateGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.updateEncryption(true);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.updateEncryption(false);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleSchedule();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.sendInviteViaEmail
        flag 1 (0x2L): viewModel.formattedDate
        flag 2 (0x3L): viewModel.duration
        flag 3 (0x4L): viewModel.formattedTime
        flag 4 (0x5L): viewModel.subject
        flag 5 (0x6L): viewModel.description
        flag 6 (0x7L): viewModel.isBroadcastAllowed
        flag 7 (0x8L): viewModel.timeZone
        flag 8 (0x9L): viewModel.isUpdate
        flag 9 (0xaL): viewModel.mode
        flag 10 (0xbL): viewModel.scheduleForLater
        flag 11 (0xcL): viewModel.isEncrypted
        flag 12 (0xdL): viewModel.sendInviteViaChat
        flag 13 (0xeL): viewModel.continueEnabled
        flag 14 (0xfL): timePickerClickListener
        flag 15 (0x10L): datePickerClickListener
        flag 16 (0x11L): nextClickListener
        flag 17 (0x12L): viewModel
        flag 18 (0x13L): null
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBroadcastAllowed.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBroadcastAllowed.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_subject_hint : @android:string/conference_group_call_subject_hint
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_subject_hint : @android:string/conference_group_call_subject_hint
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_edit : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_title : @android:string/conference_group_call_title
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_edit : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_title : @android:string/conference_group_call_title
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_send_updated_invite_email : @android:string/conference_schedule_send_invite_email
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_send_updated_invite_email : @android:string/conference_schedule_send_invite_email
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_send_updated_invite_chat : @android:string/conference_schedule_send_invite_chat
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_send_updated_invite_chat : @android:string/conference_schedule_send_invite_chat
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_title : @android:string/conference_group_call_title
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_title : @android:string/conference_group_call_title
    flag mapping end*/
    //end
}