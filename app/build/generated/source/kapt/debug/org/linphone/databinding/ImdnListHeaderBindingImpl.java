package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ImdnListHeaderBindingImpl extends ImdnListHeaderBinding  {

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
    private final android.widget.ImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ImdnListHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ImdnListHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.title == variableId) {
            setTitle((java.lang.Integer) variable);
        }
        else if (BR.icon == variableId) {
            setIcon((java.lang.Integer) variable);
        }
        else if (BR.textColor == variableId) {
            setTextColor((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.Integer Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setIcon(@Nullable java.lang.Integer Icon) {
        this.mIcon = Icon;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.icon);
        super.requestRebind();
    }
    public void setTextColor(@Nullable java.lang.Integer TextColor) {
        this.mTextColor = TextColor;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.textColor);
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
        int androidxDatabindingViewDataBindingSafeUnboxTextColor = 0;
        int contextCompatGetColorContextTextColor = 0;
        java.lang.Integer title = mTitle;
        java.lang.Integer icon = mIcon;
        int androidxDatabindingViewDataBindingSafeUnboxTitle = 0;
        java.lang.Integer textColor = mTextColor;
        int androidxDatabindingViewDataBindingSafeUnboxIcon = 0;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(title)
                androidxDatabindingViewDataBindingSafeUnboxTitle = androidx.databinding.ViewDataBinding.safeUnbox(title);
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(icon)
                androidxDatabindingViewDataBindingSafeUnboxIcon = androidx.databinding.ViewDataBinding.safeUnbox(icon);
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(textColor)
                androidxDatabindingViewDataBindingSafeUnboxTextColor = androidx.databinding.ViewDataBinding.safeUnbox(textColor);


                // read ContextCompat.getColor(context, androidx.databinding.ViewDataBinding.safeUnbox(textColor))
                contextCompatGetColorContextTextColor = androidx.core.content.ContextCompat.getColor(getRoot().getContext(), androidxDatabindingViewDataBindingSafeUnboxTextColor);
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView1.setText(androidxDatabindingViewDataBindingSafeUnboxTitle);
            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxTitle);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView1.setTextColor(contextCompatGetColorContextTextColor);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxIcon);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): title
        flag 1 (0x2L): icon
        flag 2 (0x3L): textColor
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}