package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsConferencesFragmentBindingImpl extends SettingsConferencesFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_list"},
            new int[] {4},
            new int[] {org.linphone.R.layout.settings_widget_list});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.view.View mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView31;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsConferencesFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private SettingsConferencesFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            );
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[4];
        setContainedBinding(this.mboundView31);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        mboundView31.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView31.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.ConferencesSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.ConferencesSettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView31.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLayoutLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 1 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelLayoutIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLayoutLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelLayoutLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLayoutIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLayoutIndex, int fieldId) {
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
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        java.lang.Integer viewModelLayoutIndexGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLayoutListener = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelLayoutLabels = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        java.util.ArrayList<java.lang.String> viewModelLayoutLabelsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLayoutIndex = null;
        org.linphone.activities.main.settings.viewmodels.ConferencesSettingsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x2aL) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(1, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x2aL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x35L) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.layoutListener
                        viewModelLayoutListener = viewModel.getLayoutListener();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.layoutLabels
                        viewModelLayoutLabels = viewModel.getLayoutLabels();
                    }
                    updateLiveDataRegistration(0, viewModelLayoutLabels);


                    if (viewModelLayoutLabels != null) {
                        // read viewModel.layoutLabels.getValue()
                        viewModelLayoutLabelsGetValue = viewModelLayoutLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.layoutIndex
                        viewModelLayoutIndex = viewModel.getLayoutIndex();
                    }
                    updateLiveDataRegistration(2, viewModelLayoutIndex);


                    if (viewModelLayoutIndex != null) {
                        // read viewModel.layoutIndex.getValue()
                        viewModelLayoutIndexGetValue = viewModelLayoutIndex.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.conferences_settings_layout_title));
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelLayoutListener);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.mboundView31.setSelectedIndex(viewModelLayoutIndexGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mboundView31.setLabels(viewModelLayoutLabelsGetValue);
        }
        executeBindingsOn(mboundView31);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.layoutLabels
        flag 1 (0x2L): sharedMainViewModel.isSlidingPaneSlideable
        flag 2 (0x3L): viewModel.layoutIndex
        flag 3 (0x4L): sharedMainViewModel
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
    flag mapping end*/
    //end
}