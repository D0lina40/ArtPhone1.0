package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatEventListCellBindingImpl extends ChatEventListCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback126;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatEventListCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ChatEventListCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.CheckBox) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.select.setTag(null);
        setRootTag(root);
        // listeners
        mCallback126 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.selectionListViewModel == variableId) {
            setSelectionListViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.EventData) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setSelectionListViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel SelectionListViewModel) {
        this.mSelectionListViewModel = SelectionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.selectionListViewModel);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.EventData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSelectionListViewModelSelectedItems((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>>) object, fieldId);
            case 2 :
                return onChangeSelectionListViewModelIsEditionEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataText(androidx.lifecycle.MutableLiveData<java.lang.String> DataText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelSelectedItems(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> SelectionListViewModelSelectedItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelIsEditionEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SelectionListViewModelIsEditionEnabled, int fieldId) {
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
        java.lang.Integer position = mPosition;
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;
        int dataSecurityBooleanTrueDataGroupLeftMboundView3AndroidColorRedColorMboundView3AndroidColorLightGreyColor = 0;
        boolean selectionListViewModelSelectedItemsContainsPosition = false;
        java.lang.Boolean selectionListViewModelIsEditionEnabledGetValue = null;
        android.graphics.drawable.Drawable dataSecurityBooleanTrueDataGroupLeftMboundView2AndroidDrawableEventDecorationRedMboundView2AndroidDrawableEventDecorationGray = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataText = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = false;
        int selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.chat.data.EventData data = mData;
        java.util.ArrayList<java.lang.Integer> selectionListViewModelSelectedItemsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectionListViewModelSelectedItems = null;
        boolean dataGroupLeft = false;
        boolean dataSecurityBooleanTrueDataGroupLeft = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> selectionListViewModelIsEditionEnabled = null;
        java.lang.String dataTextChar = null;
        java.lang.String dataTextGetValue = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        boolean dataSecurity = false;

        if ((dirtyFlags & 0x9aL) != 0) {
        }
        if ((dirtyFlags & 0x9eL) != 0) {


            if ((dirtyFlags & 0x9aL) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.selectedItems
                        selectionListViewModelSelectedItems = selectionListViewModel.getSelectedItems();
                    }
                    updateLiveDataRegistration(1, selectionListViewModelSelectedItems);


                    if (selectionListViewModelSelectedItems != null) {
                        // read selectionListViewModel.selectedItems.getValue()
                        selectionListViewModelSelectedItemsGetValue = selectionListViewModelSelectedItems.getValue();
                    }


                    if (selectionListViewModelSelectedItemsGetValue != null) {
                        // read selectionListViewModel.selectedItems.getValue().contains(position)
                        selectionListViewModelSelectedItemsContainsPosition = selectionListViewModelSelectedItemsGetValue.contains(position);
                    }
            }
            if ((dirtyFlags & 0x94L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.isEditionEnabled
                        selectionListViewModelIsEditionEnabled = selectionListViewModel.isEditionEnabled();
                    }
                    updateLiveDataRegistration(2, selectionListViewModelIsEditionEnabled);


                    if (selectionListViewModelIsEditionEnabled != null) {
                        // read selectionListViewModel.isEditionEnabled.getValue()
                        selectionListViewModelIsEditionEnabledGetValue = selectionListViewModelIsEditionEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModelIsEditionEnabledGetValue);
                if((dirtyFlags & 0x94L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
                    selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0xa1L) != 0) {



                if (data != null) {
                    // read data.text
                    dataText = data.getText();
                }
                updateLiveDataRegistration(0, dataText);


                if (dataText != null) {
                    // read data.text.getValue()
                    dataTextGetValue = dataText.getValue();
                }


                // read (data.text.getValue()) + (' ')
                dataTextChar = (dataTextGetValue) + (' ');
            if ((dirtyFlags & 0xa0L) != 0) {

                    if (data != null) {
                        // read data.security
                        dataSecurity = data.isSecurity();
                    }
                if((dirtyFlags & 0xa0L) != 0) {
                    if(dataSecurity) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0xc0L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

                if (data != null) {
                    // read data.groupLeft
                    dataGroupLeft = data.isGroupLeft();
                }
        }

        if ((dirtyFlags & 0xa0L) != 0) {

                // read data.security ? true : data.groupLeft
                dataSecurityBooleanTrueDataGroupLeft = ((dataSecurity) ? (true) : (dataGroupLeft));
            if((dirtyFlags & 0xa0L) != 0) {
                if(dataSecurityBooleanTrueDataGroupLeft) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
            }


                // read data.security ? true : data.groupLeft ? @android:color/red_color : @android:color/light_grey_color
                dataSecurityBooleanTrueDataGroupLeftMboundView3AndroidColorRedColorMboundView3AndroidColorLightGreyColor = ((dataSecurityBooleanTrueDataGroupLeft) ? (getColorFromResource(mboundView3, R.color.red_color)) : (getColorFromResource(mboundView3, R.color.light_grey_color)));
                // read data.security ? true : data.groupLeft ? @android:drawable/event_decoration_red : @android:drawable/event_decoration_gray
                dataSecurityBooleanTrueDataGroupLeftMboundView2AndroidDrawableEventDecorationRedMboundView2AndroidDrawableEventDecorationGray = ((dataSecurityBooleanTrueDataGroupLeft) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.event_decoration_red)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView2.getContext(), R.drawable.event_decoration_gray)));
        }
        // batch finished
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView2, dataSecurityBooleanTrueDataGroupLeftMboundView2AndroidDrawableEventDecorationRedMboundView2AndroidDrawableEventDecorationGray);
            this.mboundView3.setTextColor(dataSecurityBooleanTrueDataGroupLeftMboundView3AndroidColorRedColorMboundView3AndroidColorLightGreyColor);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, dataTextChar);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.select.setOnClickListener(mCallback126);
        }
        if ((dirtyFlags & 0x94L) != 0) {
            // api target 1

            this.select.setVisibility(selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x9aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.select, selectionListViewModelSelectedItemsContainsPosition);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // selectionListViewModel != null
        boolean selectionListViewModelJavaLangObjectNull = false;
        // position
        java.lang.Integer position = mPosition;
        // selectionListViewModel
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;



        selectionListViewModelJavaLangObjectNull = (selectionListViewModel) != (null);
        if (selectionListViewModelJavaLangObjectNull) {



            selectionListViewModel.onToggleSelect(position);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.text
        flag 1 (0x2L): selectionListViewModel.selectedItems
        flag 2 (0x3L): selectionListViewModel.isEditionEnabled
        flag 3 (0x4L): position
        flag 4 (0x5L): selectionListViewModel
        flag 5 (0x6L): data
        flag 6 (0x7L): clickListener
        flag 7 (0x8L): null
        flag 8 (0x9L): data.security ? true : data.groupLeft ? @android:color/red_color : @android:color/light_grey_color
        flag 9 (0xaL): data.security ? true : data.groupLeft ? @android:color/red_color : @android:color/light_grey_color
        flag 10 (0xbL): data.security ? true : data.groupLeft ? @android:drawable/event_decoration_red : @android:drawable/event_decoration_gray
        flag 11 (0xcL): data.security ? true : data.groupLeft ? @android:drawable/event_decoration_red : @android:drawable/event_decoration_gray
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): data.security ? true : data.groupLeft
        flag 15 (0x10L): data.security ? true : data.groupLeft
    flag mapping end*/
    //end
}