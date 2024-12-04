package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageReplyBubbleBindingImpl extends ChatMessageReplyBubbleBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.color, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final com.google.android.flexbox.FlexboxLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageReplyBubbleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ChatMessageReplyBubbleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.view.View) bindings[5]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.flexbox.FlexboxLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.ChatMessageData) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataContents((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData>>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataText((androidx.lifecycle.MutableLiveData<android.text.Spannable>) object, fieldId);
            case 3 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataContents(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData>> DataContents, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> DataDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataText(androidx.lifecycle.MutableLiveData<android.text.Spannable> DataText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean dataTextLengthInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData>> dataContents = null;
        java.lang.String dataDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        androidx.lifecycle.MutableLiveData<android.text.Spannable> dataText = null;
        int dataTextLength = 0;
        java.lang.String dataContactName = null;
        org.linphone.activities.main.chat.data.ChatMessageData data = mData;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        int dataContentsSizeInt0ViewVISIBLEViewGONE = 0;
        java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData> dataContentsGetValue = null;
        android.text.Spannable dataTextGetValue = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        int dataTextLengthInt0ViewGONEViewVISIBLE = 0;
        boolean dataContentsSizeInt0 = false;
        int dataContentsSize = 0;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0x5fL) != 0) {


            if ((dirtyFlags & 0x51L) != 0) {

                    if (data != null) {
                        // read data.contents
                        dataContents = data.getContents();
                    }
                    updateLiveDataRegistration(0, dataContents);


                    if (dataContents != null) {
                        // read data.contents.getValue()
                        dataContentsGetValue = dataContents.getValue();
                    }


                    if (dataContentsGetValue != null) {
                        // read data.contents.getValue().size()
                        dataContentsSize = dataContentsGetValue.size();
                    }


                    // read data.contents.getValue().size() > 0
                    dataContentsSizeInt0 = (dataContentsSize) > (0);
                if((dirtyFlags & 0x51L) != 0) {
                    if(dataContentsSizeInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read data.contents.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    dataContentsSizeInt0ViewVISIBLEViewGONE = ((dataContentsSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x54L) != 0) {

                    if (data != null) {
                        // read data.text
                        dataText = data.getText();
                    }
                    updateLiveDataRegistration(2, dataText);


                    if (dataText != null) {
                        // read data.text.getValue()
                        dataTextGetValue = dataText.getValue();
                    }


                    if (dataTextGetValue != null) {
                        // read data.text.getValue().length()
                        dataTextLength = dataTextGetValue.length();
                    }


                    // read data.text.getValue().length() == 0
                    dataTextLengthInt0 = (dataTextLength) == (0);
                if((dirtyFlags & 0x54L) != 0) {
                    if(dataTextLengthInt0) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read data.text.getValue().length() == 0 ? View.GONE : View.VISIBLE
                    dataTextLengthInt0ViewGONEViewVISIBLE = ((dataTextLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x5aL) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(3, dataContact);


                    if (dataContact != null) {
                        // read data.contact.getValue()
                        dataContactGetValue = dataContact.getValue();
                    }


                    if (dataContactGetValue != null) {
                        // read data.contact.getValue().name
                        dataContactName = dataContactGetValue.getName();
                    }


                    // read data.contact.getValue().name == null
                    dataContactNameJavaLangObjectNull = (dataContactName) == (null);
                if((dirtyFlags & 0x5aL) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (data != null) {
                    // read data.displayName
                    dataDisplayName = data.getDisplayName();
                }
                updateLiveDataRegistration(1, dataDisplayName);


                if (dataDisplayName != null) {
                    // read data.displayName.getValue()
                    dataDisplayNameGetValue = dataDisplayName.getValue();
                }
        }

        if ((dirtyFlags & 0x5aL) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(dataContentsSizeInt0ViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView2, dataContentsGetValue, R.layout.chat_message_reply_content_cell);
        }
        if ((dirtyFlags & 0x5aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(dataTextLengthInt0ViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataTextGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.contents
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.text
        flag 3 (0x4L): data.contact
        flag 4 (0x5L): data
        flag 5 (0x6L): clickListener
        flag 6 (0x7L): null
        flag 7 (0x8L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 8 (0x9L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 9 (0xaL): data.contents.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): data.contents.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): data.text.getValue().length() == 0 ? View.GONE : View.VISIBLE
        flag 12 (0xdL): data.text.getValue().length() == 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}