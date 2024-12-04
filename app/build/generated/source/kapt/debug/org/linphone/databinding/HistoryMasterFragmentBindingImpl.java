package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryMasterFragmentBindingImpl extends HistoryMasterFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 12);
        sViewsWithIds.put(R.id.list_edit_top_bar_fragment, 13);
        sViewsWithIds.put(R.id.callLogsList, 14);
        sViewsWithIds.put(R.id.history_nav_container, 15);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.view.View mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.view.View mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.view.View mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HistoryMasterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private HistoryMasterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.fragment.app.FragmentContainerView) bindings[15]
            , (androidx.fragment.app.FragmentContainerView) bindings[13]
            , (androidx.slidingpanelayout.widget.SlidingPaneLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[12]
            );
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.view.View) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.view.View) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.slidingPane.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback45 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback46 = new org.linphone.generated.callback.OnClickListener(this, 2);
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
        if (BR.editClickListener == variableId) {
            setEditClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.history.viewmodels.CallLogsListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEditClickListener(@Nullable android.view.View.OnClickListener EditClickListener) {
        this.mEditClickListener = EditClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.editClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.history.viewmodels.CallLogsListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFilter((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.history.viewmodels.CallLogsFilter>) object, fieldId);
            case 1 :
                return onChangeViewModelShowConferencesFilter((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelCallLogs((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.history.data.GroupedCallLogData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFilter(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.history.viewmodels.CallLogsFilter> ViewModelFilter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowConferencesFilter(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowConferencesFilter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCallLogs(androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.history.data.GroupedCallLogData>> ViewModelCallLogs, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.history.viewmodels.CallLogsFilter> viewModelFilter = null;
        boolean viewModelFilterCallLogsFilterMISSED = false;
        java.util.List<org.linphone.activities.main.history.data.GroupedCallLogData> viewModelCallLogsGetValue = null;
        boolean viewModelFilterCallLogsFilterALL = false;
        android.view.View.OnClickListener editClickListener = mEditClickListener;
        boolean viewModelCallLogsEmptyViewModelFilterCallLogsFilterALLBooleanFalse = false;
        int viewModelFilterCallLogsFilterMISSEDViewVISIBLEViewGONE = 0;
        boolean viewModelFilterCallLogsFilterCONFERENCE = false;
        int viewModelCallLogsEmptyViewModelFilterCallLogsFilterMISSEDBooleanFalseViewVISIBLEViewGONE = 0;
        int viewModelFilterCallLogsFilterCONFERENCEViewVISIBLEViewGONE = 0;
        boolean ViewModelFilterCallLogsFilterALL1 = false;
        org.linphone.activities.main.history.viewmodels.CallLogsFilter viewModelFilterGetValue = null;
        java.lang.Boolean viewModelShowConferencesFilterGetValue = null;
        boolean viewModelCallLogsEmpty = false;
        int viewModelCallLogsEmptyViewModelFilterCallLogsFilterALLBooleanFalseViewVISIBLEViewGONE = 0;
        boolean ViewModelFilterCallLogsFilterMISSED1 = false;
        int viewModelFilterCallLogsFilterALLViewVISIBLEViewGONE = 0;
        boolean viewModelCallLogsEmptyViewModelFilterCallLogsFilterMISSEDBooleanFalse = false;
        boolean ViewModelCallLogsEmpty1 = false;
        int viewModelCallLogsEmptyViewModelFilterCallLogsFilterCONFERENCEBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelCallLogsEmptyViewModelFilterCallLogsFilterCONFERENCEBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowConferencesFilterGetValue = false;
        int viewModelShowConferencesFilterViewVISIBLEViewINVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowConferencesFilter = null;
        boolean ViewModelFilterCallLogsFilterCONFERENCE1 = false;
        org.linphone.activities.main.history.viewmodels.CallLogsListViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.history.data.GroupedCallLogData>> viewModelCallLogs = null;

        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.filter
                        viewModelFilter = viewModel.getFilter();
                    }
                    updateLiveDataRegistration(0, viewModelFilter);


                    if (viewModelFilter != null) {
                        // read viewModel.filter.getValue()
                        viewModelFilterGetValue = viewModelFilter.getValue();
                    }


                    // read viewModel.filter.getValue() != CallLogsFilter.MISSED
                    viewModelFilterCallLogsFilterMISSED = (viewModelFilterGetValue) != (org.linphone.activities.main.history.viewmodels.CallLogsFilter.MISSED);
                    // read viewModel.filter.getValue() == CallLogsFilter.ALL
                    viewModelFilterCallLogsFilterALL = (viewModelFilterGetValue) == (org.linphone.activities.main.history.viewmodels.CallLogsFilter.ALL);
                    // read viewModel.filter.getValue() != CallLogsFilter.CONFERENCE
                    viewModelFilterCallLogsFilterCONFERENCE = (viewModelFilterGetValue) != (org.linphone.activities.main.history.viewmodels.CallLogsFilter.CONFERENCE);
                    // read viewModel.filter.getValue() != CallLogsFilter.ALL
                    ViewModelFilterCallLogsFilterALL1 = (viewModelFilterGetValue) != (org.linphone.activities.main.history.viewmodels.CallLogsFilter.ALL);
                    // read viewModel.filter.getValue() == CallLogsFilter.MISSED
                    ViewModelFilterCallLogsFilterMISSED1 = (viewModelFilterGetValue) == (org.linphone.activities.main.history.viewmodels.CallLogsFilter.MISSED);
                    // read viewModel.filter.getValue() == CallLogsFilter.CONFERENCE
                    ViewModelFilterCallLogsFilterCONFERENCE1 = (viewModelFilterGetValue) == (org.linphone.activities.main.history.viewmodels.CallLogsFilter.CONFERENCE);
                if((dirtyFlags & 0x31L) != 0) {
                    if(viewModelFilterCallLogsFilterALL) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x31L) != 0) {
                    if(ViewModelFilterCallLogsFilterMISSED1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x31L) != 0) {
                    if(ViewModelFilterCallLogsFilterCONFERENCE1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewModel.filter.getValue() == CallLogsFilter.ALL ? View.VISIBLE : View.GONE
                    viewModelFilterCallLogsFilterALLViewVISIBLEViewGONE = ((viewModelFilterCallLogsFilterALL) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.filter.getValue() == CallLogsFilter.MISSED ? View.VISIBLE : View.GONE
                    viewModelFilterCallLogsFilterMISSEDViewVISIBLEViewGONE = ((ViewModelFilterCallLogsFilterMISSED1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.filter.getValue() == CallLogsFilter.CONFERENCE ? View.VISIBLE : View.GONE
                    viewModelFilterCallLogsFilterCONFERENCEViewVISIBLEViewGONE = ((ViewModelFilterCallLogsFilterCONFERENCE1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showConferencesFilter
                        viewModelShowConferencesFilter = viewModel.getShowConferencesFilter();
                    }
                    updateLiveDataRegistration(1, viewModelShowConferencesFilter);


                    if (viewModelShowConferencesFilter != null) {
                        // read viewModel.showConferencesFilter.getValue()
                        viewModelShowConferencesFilterGetValue = viewModelShowConferencesFilter.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showConferencesFilter.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowConferencesFilterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowConferencesFilterGetValue);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowConferencesFilterGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showConferencesFilter.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelShowConferencesFilterViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowConferencesFilterGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x35L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.callLogs
                        viewModelCallLogs = viewModel.getCallLogs();
                    }
                    updateLiveDataRegistration(2, viewModelCallLogs);


                    if (viewModelCallLogs != null) {
                        // read viewModel.callLogs.getValue()
                        viewModelCallLogsGetValue = viewModelCallLogs.getValue();
                    }


                    if (viewModelCallLogsGetValue != null) {
                        // read viewModel.callLogs.getValue().empty
                        ViewModelCallLogsEmpty1 = viewModelCallLogsGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x35L) != 0) {
                    if(ViewModelCallLogsEmpty1) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x400000L;
                    }
                }

                if ((dirtyFlags & 0x34L) != 0) {

                        // read !viewModel.callLogs.getValue().empty
                        viewModelCallLogsEmpty = !ViewModelCallLogsEmpty1;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x880080L) != 0) {

                if (viewModel != null) {
                    // read viewModel.filter
                    viewModelFilter = viewModel.getFilter();
                }
                updateLiveDataRegistration(0, viewModelFilter);


                if (viewModelFilter != null) {
                    // read viewModel.filter.getValue()
                    viewModelFilterGetValue = viewModelFilter.getValue();
                }

            if ((dirtyFlags & 0x80L) != 0) {

                    // read viewModel.filter.getValue() == CallLogsFilter.ALL
                    viewModelFilterCallLogsFilterALL = (viewModelFilterGetValue) == (org.linphone.activities.main.history.viewmodels.CallLogsFilter.ALL);
                if((dirtyFlags & 0x31L) != 0) {
                    if(viewModelFilterCallLogsFilterALL) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
            }
            if ((dirtyFlags & 0x80000L) != 0) {

                    // read viewModel.filter.getValue() == CallLogsFilter.MISSED
                    ViewModelFilterCallLogsFilterMISSED1 = (viewModelFilterGetValue) == (org.linphone.activities.main.history.viewmodels.CallLogsFilter.MISSED);
                if((dirtyFlags & 0x31L) != 0) {
                    if(ViewModelFilterCallLogsFilterMISSED1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
            if ((dirtyFlags & 0x800000L) != 0) {

                    // read viewModel.filter.getValue() == CallLogsFilter.CONFERENCE
                    ViewModelFilterCallLogsFilterCONFERENCE1 = (viewModelFilterGetValue) == (org.linphone.activities.main.history.viewmodels.CallLogsFilter.CONFERENCE);
                if((dirtyFlags & 0x31L) != 0) {
                    if(ViewModelFilterCallLogsFilterCONFERENCE1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x35L) != 0) {

                // read viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.ALL : false
                viewModelCallLogsEmptyViewModelFilterCallLogsFilterALLBooleanFalse = ((ViewModelCallLogsEmpty1) ? (viewModelFilterCallLogsFilterALL) : (false));
                // read viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.MISSED : false
                viewModelCallLogsEmptyViewModelFilterCallLogsFilterMISSEDBooleanFalse = ((ViewModelCallLogsEmpty1) ? (ViewModelFilterCallLogsFilterMISSED1) : (false));
                // read viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.CONFERENCE : false
                viewModelCallLogsEmptyViewModelFilterCallLogsFilterCONFERENCEBooleanFalse = ((ViewModelCallLogsEmpty1) ? (ViewModelFilterCallLogsFilterCONFERENCE1) : (false));
            if((dirtyFlags & 0x35L) != 0) {
                if(viewModelCallLogsEmptyViewModelFilterCallLogsFilterALLBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x35L) != 0) {
                if(viewModelCallLogsEmptyViewModelFilterCallLogsFilterMISSEDBooleanFalse) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x35L) != 0) {
                if(viewModelCallLogsEmptyViewModelFilterCallLogsFilterCONFERENCEBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.ALL : false ? View.VISIBLE : View.GONE
                viewModelCallLogsEmptyViewModelFilterCallLogsFilterALLBooleanFalseViewVISIBLEViewGONE = ((viewModelCallLogsEmptyViewModelFilterCallLogsFilterALLBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.MISSED : false ? View.VISIBLE : View.GONE
                viewModelCallLogsEmptyViewModelFilterCallLogsFilterMISSEDBooleanFalseViewVISIBLEViewGONE = ((viewModelCallLogsEmptyViewModelFilterCallLogsFilterMISSEDBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.CONFERENCE : false ? View.VISIBLE : View.GONE
                viewModelCallLogsEmptyViewModelFilterCallLogsFilterCONFERENCEBooleanFalseViewVISIBLEViewGONE = ((viewModelCallLogsEmptyViewModelFilterCallLogsFilterCONFERENCEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mboundView1.setEnabled(ViewModelFilterCallLogsFilterALL1);
            this.mboundView2.setVisibility(viewModelFilterCallLogsFilterALLViewVISIBLEViewGONE);
            this.mboundView3.setEnabled(viewModelFilterCallLogsFilterMISSED);
            this.mboundView4.setVisibility(viewModelFilterCallLogsFilterMISSEDViewVISIBLEViewGONE);
            this.mboundView6.setEnabled(viewModelFilterCallLogsFilterCONFERENCE);
            this.mboundView7.setVisibility(viewModelFilterCallLogsFilterCONFERENCEViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback45);
            this.mboundView3.setOnClickListener(mCallback46);
            this.mboundView6.setOnClickListener(mCallback47);
        }
        if ((dirtyFlags & 0x35L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelCallLogsEmptyViewModelFilterCallLogsFilterMISSEDBooleanFalseViewVISIBLEViewGONE);
            this.mboundView11.setVisibility(viewModelCallLogsEmptyViewModelFilterCallLogsFilterCONFERENCEBooleanFalseViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(viewModelCallLogsEmptyViewModelFilterCallLogsFilterALLBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelShowConferencesFilterViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(editClickListener);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.mboundView8.setEnabled(viewModelCallLogsEmpty);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.history.viewmodels.CallLogsListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.showOnlyConferenceCallLogs();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.history.viewmodels.CallLogsListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.showAllCallLogs();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.history.viewmodels.CallLogsListViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.showOnlyMissedCallLogs();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.filter
        flag 1 (0x2L): viewModel.showConferencesFilter
        flag 2 (0x3L): viewModel.callLogs
        flag 3 (0x4L): editClickListener
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.ALL : false
        flag 7 (0x8L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.ALL : false
        flag 8 (0x9L): viewModel.filter.getValue() == CallLogsFilter.MISSED ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.filter.getValue() == CallLogsFilter.MISSED ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.MISSED : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.MISSED : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.filter.getValue() == CallLogsFilter.CONFERENCE ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.filter.getValue() == CallLogsFilter.CONFERENCE ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.ALL : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.ALL : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.filter.getValue() == CallLogsFilter.ALL ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.filter.getValue() == CallLogsFilter.ALL ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.MISSED : false
        flag 19 (0x14L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.MISSED : false
        flag 20 (0x15L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.CONFERENCE : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.CONFERENCE : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.CONFERENCE : false
        flag 23 (0x18L): viewModel.callLogs.getValue().empty ? viewModel.filter.getValue() == CallLogsFilter.CONFERENCE : false
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showConferencesFilter.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showConferencesFilter.getValue()) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}