package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageReactionBindingImpl extends ChatMessageReactionBinding  {

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
    private final android.widget.TextView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageReactionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ChatMessageReactionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.TextView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.data == variableId) {
            setData((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable java.lang.String Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.String data = mData;
        boolean dataMatchesJavaLangStringD = false;
        float dataMatchesJavaLangStringDMboundView0AndroidDimenChatMessageEmojiReactionsCountFontSizeMboundView0AndroidDimenChatMessageEmojiReactionFontSize = 0f;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.matches("\\d+")
                    dataMatchesJavaLangStringD = data.matches("\\d+");
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataMatchesJavaLangStringD) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read data.matches("\\d+") ? @android:dimen/chat_message_emoji_reactions_count_font_size : @android:dimen/chat_message_emoji_reaction_font_size
                dataMatchesJavaLangStringDMboundView0AndroidDimenChatMessageEmojiReactionsCountFontSizeMboundView0AndroidDimenChatMessageEmojiReactionFontSize = ((dataMatchesJavaLangStringD) ? (mboundView0.getResources().getDimension(R.dimen.chat_message_emoji_reactions_count_font_size)) : (mboundView0.getResources().getDimension(R.dimen.chat_message_emoji_reaction_font_size)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextSize(this.mboundView0, dataMatchesJavaLangStringDMboundView0AndroidDimenChatMessageEmojiReactionsCountFontSizeMboundView0AndroidDimenChatMessageEmojiReactionFontSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView0, data);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data.matches("\\d+") ? @android:dimen/chat_message_emoji_reactions_count_font_size : @android:dimen/chat_message_emoji_reaction_font_size
        flag 3 (0x4L): data.matches("\\d+") ? @android:dimen/chat_message_emoji_reactions_count_font_size : @android:dimen/chat_message_emoji_reaction_font_size
    flag mapping end*/
    //end
}