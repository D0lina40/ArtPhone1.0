package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NumpadBindingImpl extends NumpadBinding implements org.linphone.generated.callback.OnClickListener.Listener, org.linphone.generated.callback.OnLongClickListener.Listener {

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
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.ImageView mboundView12;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback159;
    @Nullable
    private final android.view.View.OnClickListener mCallback168;
    @Nullable
    private final android.view.View.OnClickListener mCallback169;
    @Nullable
    private final android.view.View.OnClickListener mCallback166;
    @Nullable
    private final android.view.View.OnClickListener mCallback167;
    @Nullable
    private final android.view.View.OnClickListener mCallback164;
    @Nullable
    private final android.view.View.OnClickListener mCallback165;
    @Nullable
    private final android.view.View.OnClickListener mCallback162;
    @Nullable
    private final android.view.View.OnClickListener mCallback163;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback160;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback171;
    @Nullable
    private final android.view.View.OnClickListener mCallback161;
    @Nullable
    private final android.view.View.OnClickListener mCallback172;
    @Nullable
    private final android.view.View.OnClickListener mCallback170;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NumpadBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private NumpadBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.flexbox.FlexboxLayout) bindings[0]
            );
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.ImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.ImageView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.numpad.setTag(null);
        setRootTag(root);
        // listeners
        mCallback159 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback168 = new org.linphone.generated.callback.OnClickListener(this, 10);
        mCallback169 = new org.linphone.generated.callback.OnClickListener(this, 11);
        mCallback166 = new org.linphone.generated.callback.OnClickListener(this, 8);
        mCallback167 = new org.linphone.generated.callback.OnClickListener(this, 9);
        mCallback164 = new org.linphone.generated.callback.OnClickListener(this, 6);
        mCallback165 = new org.linphone.generated.callback.OnClickListener(this, 7);
        mCallback162 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback163 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback160 = new org.linphone.generated.callback.OnLongClickListener(this, 2);
        mCallback171 = new org.linphone.generated.callback.OnLongClickListener(this, 13);
        mCallback161 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback172 = new org.linphone.generated.callback.OnClickListener(this, 14);
        mCallback170 = new org.linphone.generated.callback.OnClickListener(this, 12);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.keyListener == variableId) {
            setKeyListener((org.linphone.activities.main.dialer.NumpadDigitListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKeyListener(@Nullable org.linphone.activities.main.dialer.NumpadDigitListener KeyListener) {
        this.mKeyListener = KeyListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.keyListener);
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
        org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback159);
            this.mboundView1.setOnLongClickListener(mCallback160);
            this.mboundView10.setOnClickListener(mCallback169);
            this.mboundView11.setOnClickListener(mCallback170);
            this.mboundView11.setOnLongClickListener(mCallback171);
            this.mboundView12.setOnClickListener(mCallback172);
            this.mboundView2.setOnClickListener(mCallback161);
            this.mboundView3.setOnClickListener(mCallback162);
            this.mboundView4.setOnClickListener(mCallback163);
            this.mboundView5.setOnClickListener(mCallback164);
            this.mboundView6.setOnClickListener(mCallback165);
            this.mboundView7.setOnClickListener(mCallback166);
            this.mboundView8.setOnClickListener(mCallback167);
            this.mboundView9.setOnClickListener(mCallback168);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('1');
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('9');
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('*');
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('7');
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('8');
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('5');
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('6');
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('3');
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('4');
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('2');
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('#');
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListener.handleClick('0');
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;
                // keyListener.handleLongClick('1')
                boolean keyListenerHandleLongClickChar1 = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListenerHandleLongClickChar1 = keyListener.handleLongClick('1');
                }
                return keyListenerHandleLongClickChar1;
            }
            case 13: {
                // localize variables for thread safety
                // keyListener
                org.linphone.activities.main.dialer.NumpadDigitListener keyListener = mKeyListener;
                // keyListener != null
                boolean keyListenerJavaLangObjectNull = false;
                // keyListener.handleLongClick('+')
                boolean keyListenerHandleLongClickChar = false;



                keyListenerJavaLangObjectNull = (keyListener) != (null);
                if (keyListenerJavaLangObjectNull) {



                    keyListenerHandleLongClickChar = keyListener.handleLongClick('+');
                }
                return keyListenerHandleLongClickChar;
            }
            default: {
                return false;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): keyListener
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}